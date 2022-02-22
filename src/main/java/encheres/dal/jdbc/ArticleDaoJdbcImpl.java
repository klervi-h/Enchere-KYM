package encheres.dal.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import encheres.buisness.bo.*;
import encheres.dal.ArticleDAO;
import encheres.dal.DALException;


public class ArticleDaoJdbcImpl implements ArticleDAO {

	private static final String sqlSelectById ="select * from ARTICLES_VENDUS where no_article = ?";
	private static final String sqlSelectByIdAdresseArt = " select * from RETRAITS where no_article = ?";
	private static final String sqlInsertArticles ="insert into ARTICLES_VENDUS (nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, no_utilisateur, no_categorie) values (?,?,?,?,?,?,?)";
	private static final String sqlInsertRetraits ="insert into RETRAITS (no_article, rue, code_postal, ville)values(?,?,?,?)";
	private static final String sqlUpdate ="update ARTICLES_VENDUS set nom_article = ?, description = ?, date_debut_encheres = ?, date_fin_encheres = ?, prix_initial = ?, no_utilisateur = ?, no_categorie = ?";
	
	//TODO update à tester
	@Override
	public void update(Article article) throws DALException {
		try(Connection con = JdbcTools.getConnection();
				PreparedStatement stmt = con.prepareStatement(sqlUpdate, Statement.RETURN_GENERATED_KEYS);){
			stmt.setString(1, article.getNomArticle());
			stmt.setString(2, article.getDescription());
			stmt.setDate(3, article.getDateDebut());
			stmt.setDate(4, article.getDateFin());
			stmt.setInt(5, article.getPrixInitial());
			stmt.setInt(6, article.getNoUtilisateur());
			stmt.setInt(7, article.getNoCategorie());
								
			int nbRows = stmt.executeUpdate();
			if(nbRows ==1) {
				ResultSet rs = stmt.getGeneratedKeys();
				if(rs.next()) {
					article.setNoArticle(rs.getInt(1));}}
			}
		catch (SQLException e) {
			throw new DALException("insert article failed - "+ article ,e);
		}
	}	
	
	@Override
	public Article selectById(int id) throws DALException {
		Article art = null;
		Adresse adr = null;
		try (Connection con = JdbcTools.getConnection();
				PreparedStatement stmt = con.prepareStatement(sqlSelectById);)
		{
			stmt.setInt(1,id);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				art = new Article(rs.getInt("no_article"),
						rs.getString("nom_article"),
						rs.getString("description"),
						rs.getDate("date_debut_encheres"),
						rs.getDate("date_fin_encheres"),
						rs.getInt("prix_initial"),
						rs.getInt("prix_vente"),
						rs.getInt("no_utilisateur"),
						rs.getInt("no_categorie")
						);
				System.out.println(rs.getString(2));
			}
		} catch (SQLException e) {
			throw new DALException("selcetById failde - id = "+ id, e);			
		}
			
			try (Connection con = JdbcTools.getConnection();
					PreparedStatement stmt = con.prepareStatement(sqlSelectByIdAdresseArt);)
			{
				stmt.setInt(1,id);
				ResultSet rs = stmt.executeQuery();
				if(rs.next()) {
					adr = new Adresse(
							rs.getString("rue"),
							Integer.parseInt(rs.getString("code_postal")),
							rs.getString("ville")
							);
					System.out.println(rs.getString(2));
				}
			} catch (SQLException e) {
				throw new DALException("selcetById failde - id = "+ id, e);			
			}
		
			art.setAdresseRetrait(adr);
		return art;
	}

	@Override
	public void insert(Article article) throws DALException {
		int noArticle=0;
		try(Connection con = JdbcTools.getConnection();
				PreparedStatement stmt = con.prepareStatement(sqlInsertArticles, Statement.RETURN_GENERATED_KEYS);){
			stmt.setString(1, article.getNomArticle());
			stmt.setString(2, article.getDescription());
			stmt.setDate(3, (Date) article.getDateDebut());
			stmt.setDate(4, (Date) article.getDateFin());
			stmt.setInt(5, article.getPrixInitial());
			stmt.setInt(6, article.getNoUtilisateur());
			stmt.setInt(7, article.getNoCategorie());

			//récupération du no d'article autogénérer par la bdd
			int nbRows = stmt.executeUpdate();
			if(nbRows ==1) {
				ResultSet rs = stmt.getGeneratedKeys();
				if(rs.next()) {
					noArticle=rs.getInt(1);
				}
			}
		}
		catch (SQLException e) {
			throw new DALException("insert article failed - "+ article ,e);
		}
		Adresse adresseRetrait = new Adresse();
		adresseRetrait = article.getAdresseRetrait();
		try(Connection con = JdbcTools.getConnection();
				PreparedStatement stmt = con.prepareStatement(sqlInsertRetraits, Statement.RETURN_GENERATED_KEYS);){
			stmt.setInt(1, noArticle);
			stmt.setString(2, adresseRetrait.getRue());
			stmt.setInt(3, adresseRetrait.getCodePostale());
			stmt.setString(4, adresseRetrait.getVille());
		}
		catch (SQLException e) {
			throw new DALException("insert retrait failed - "+ noArticle + adresseRetrait,e);
		}
	}

}
