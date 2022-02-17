package encheres.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import encheres.buisness.bo.*;
import encheres.dal.ArticleDAO;
import encheres.dal.DALException;


public class ArticleDaoJdbcImpl implements ArticleDAO {

	private static final String sqlSelectById ="select * from ARTICLES_VENDUS where no_article = ?";

	@Override
	public Article selectById(int id) throws DALException {
		Article art = null;
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
		return art;
}



/*
	private static final String STYLO = "stylo";
	private static final String RAMETTE ="ramette";

	private static final String sqlSelectById ="select * from Articles where idArticle = ?";
	private static final String sqlSelectByMarque ="select * from Articles where marque = ?";
	private static final String sqlSelectByMotCle ="select * from Articles where marque like ? or designation like ?";
	private static final String sqlSelectAll ="select * from Articles";
	private static final String sqlUpdate = "update Articles set reference = ?,marque = ?,designation = ?,prixUnitaire = ?,qteStock = ?,grammage = ?,couleur = ? where idArticle = ?";
	private static final String sqlInsert ="insert into Articles (reference, marque, designation, prixUnitaire, qteStock,type, grammage, couleur) values (?,?,?,?,?,?,?,?)";

	@Override
	public Article selectById(int id) throws DALException{
		Article art = null;
		try (Connection con = JdbcTools.getConnection();
				PreparedStatement stmt = con.prepareStatement(sqlSelectById);)
		{
			stmt.setInt(1,id);
			ResultSet rs = stmt.executeQuery();

			if(rs.next()) {
				if (STYLO.equalsIgnoreCase(rs.getString("type").trim())) {
					art = new Stylo(rs.getInt("idArticle"),
							rs.getString("marque"),
							rs.getString("reference"),
							rs.getString("designation"),
							rs.getFloat("prixUnitaire"),
							rs.getInt("qteStock"),
							rs.getString("couleur"));
				}
				if(RAMETTE.equalsIgnoreCase(rs.getString("type").trim())) {
					art = new Ramette(rs.getInt("idArticle"),
							rs.getString("marque"),
							rs.getString("reference"),
							rs.getString("designation"),
							rs.getFloat("prixUnitaire"),
							rs.getInt("qteStock"),
							rs.getInt("grammage"));	
				}
			}
		} catch (SQLException e) {
			throw new DALException("selcetById failde - id = "+ id, e);			
		}
		return art;
	};

	@Override
	public List<Article> selectAll() throws DALException {
		List<Article> articles = new ArrayList<>();
		try (Connection con = JdbcTools.getConnection();
				Statement stmt = con.createStatement();)
		{
			ResultSet rs = stmt.executeQuery(sqlSelectAll);
			while(rs.next()){
				if (STYLO.equalsIgnoreCase(rs.getString("type").trim())) {
					articles.add(new Stylo
							(rs.getInt("idArticle"),
									rs.getString("marque"),
									rs.getString("reference"),
									rs.getString("designation"),
									rs.getFloat("prixUnitaire"),
									rs.getInt("qteStock"),
									rs.getString("couleur")));
				}
				if(RAMETTE.equalsIgnoreCase(rs.getString("type").trim())) {
					articles.add(new Ramette
							(rs.getInt("idArticle"),
									rs.getString("marque"),
									rs.getString("reference"),
									rs.getString("designation"),
									rs.getFloat("prixUnitaire"),
									rs.getInt("qteStock"),
									rs.getInt("grammage")));	
				}	
			}
		} catch (SQLException e) {
			e.printStackTrace();			
		} 
		return articles;
	};

	@Override
	public void update(Article article) throws DALException {

		try (Connection con = JdbcTools.getConnection();
				PreparedStatement stmt = con.prepareStatement(sqlUpdate);){
			stmt.setString(1, article.getReference());
			stmt.setString(2, article.getMarque());
			stmt.setString(3, article.getDesignation());
			stmt.setFloat(4, article.getprixUnitaire());
			stmt.setInt(5, article.getQteStock());
			stmt.setInt(8, article.getIdArticle());
			if(article instanceof Ramette) {
				Ramette r =(Ramette)article;
				stmt.setInt(7,r.getGrammage());
				stmt.setNull(6,Types.VARCHAR);
				if(article instanceof Stylo) {
					Stylo s =(Stylo)article;
					stmt.setNull(7,Types.INTEGER);
					stmt.setString(6,s.getCouleur());}}
		} catch (SQLException e) {
			throw new DALException("Update article failed - "+ article, e);
		}
	};

	@Override
	public void insert(Article article) throws DALException {

		try(Connection con = JdbcTools.getConnection();
				PreparedStatement stmt = con.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);){
			stmt.setString(1, article.getReference());
			stmt.setString(2, article.getMarque());
			stmt.setString(3, article.getDesignation());
			stmt.setFloat(4, article.getprixUnitaire());
			stmt.setInt(5, article.getQteStock());
			if(article instanceof Ramette) {
				Ramette r =(Ramette)article;
				stmt.setString(6, RAMETTE);
				stmt.setInt(7,r.getGrammage());
				stmt.setNull(8, Types.VARCHAR);}
			if(article instanceof Stylo) {
				Stylo s =(Stylo)article;
				stmt.setString(6, STYLO);
				stmt.setNull(7,Types.INTEGER);
				stmt.setString(8,s.getCouleur());}
			int nbRows = stmt.executeUpdate();
			if(nbRows ==1) {
				ResultSet rs = stmt.getGeneratedKeys();
				if(rs.next()) {
					article.setIdArticle(rs.getInt(1));}
			}
		} catch (SQLException e) {
			throw new DALException("insert article failed - "+article,e);
		}
	};

	@Override
	public void delete(Integer idArt) throws DALException {
		try (Connection con = JdbcTools.getConnection();
				Statement stmt = con.createStatement();){
			String requeteSql = "select "+ String.valueOf(idArt) +" from Articles ";
			ResultSet rs = stmt.executeQuery(requeteSql);	
			if(rs.equals(null)) {
				throw new DALException("Cet identifiant ne correspond � aucun article! Vous ne pouvez suprimer un article inexistant...\nVeuiller vous r�f�rer au catalogue.");
			}else {
				StringBuilder supr = new StringBuilder();
				supr.append("BEGIN "+"delete from Articles where idArticle = "+ idArt+"; END;");
				stmt.executeUpdate(supr.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();			
		}
	}

	@Override
	public List<Article> selectByMarque(String marque) throws DALException {
		List<Article> articles = new ArrayList<>();
		try (Connection con = JdbcTools.getConnection();
				PreparedStatement stmt = con.prepareStatement(sqlSelectByMarque);)
		{
			stmt.setString(1,marque);
			ResultSet rs = stmt.executeQuery(sqlSelectById);
			while(rs.next()) {
				if (STYLO.equalsIgnoreCase(rs.getString("type").trim())) {
					articles.add(new Stylo(rs.getInt("idArticle"),
							rs.getString("marque"),
							rs.getString("reference"),
							rs.getString("designation"),
							rs.getFloat("prixUnitaire"),
							rs.getInt("qteStock"),
							rs.getString("couleur")));
				}
				if(RAMETTE.equalsIgnoreCase(rs.getString("type").trim())) {
					articles.add(new Ramette(rs.getInt("idArticle"),
							rs.getString("marque"),
							rs.getString("reference"),
							rs.getString("designation"),
							rs.getFloat("prixUnitaire"),
							rs.getInt("qteStock"),
							rs.getInt("grammage")));	
				}
			}
		} catch (SQLException e) {
			throw new DALException("selcetByMarque failde - marque = "+ marque, e);			
		}
		return articles;
	}

	@Override
	public List<Article> selectByMotCle(String motCle) throws DALException {
		List<Article> articles = new ArrayList<>();
		try (Connection con = JdbcTools.getConnection();
				PreparedStatement stmt = con.prepareStatement(sqlSelectByMotCle);)
		{
			stmt.setString(1,motCle);
			ResultSet rs = stmt.executeQuery(sqlSelectById);
			while(rs.next()) {
				if (STYLO.equalsIgnoreCase(rs.getString("type").trim())) {
					articles.add(new Stylo(rs.getInt("idArticle"),
							rs.getString("marque"),
							rs.getString("reference"),
							rs.getString("designation"),
							rs.getFloat("prixUnitaire"),
							rs.getInt("qteStock"),
							rs.getString("couleur")));
				}
				if(RAMETTE.equalsIgnoreCase(rs.getString("type").trim())) {
					articles.add(new Ramette(rs.getInt("idArticle"),
							rs.getString("marque"),
							rs.getString("reference"),
							rs.getString("designation"),
							rs.getFloat("prixUnitaire"),
							rs.getInt("qteStock"),
							rs.getInt("grammage")));	
				}
			}
		} catch (SQLException e) {
			throw new DALException("selcetByMarque failde - mot cle = "+ motCle, e);			
		} 
		return articles;
	}

 */
}
