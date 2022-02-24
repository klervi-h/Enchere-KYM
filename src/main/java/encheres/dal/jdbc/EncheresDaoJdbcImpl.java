package encheres.dal.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import encheres.buisness.bo.Encheres;
import encheres.dal.DALException;
import encheres.dal.EncheresDAO;

public class EncheresDaoJdbcImpl implements EncheresDAO {
	
	private static final String sqlSelectById ="select * from ENCHERES where no_article = ?";
	private static final String sqlInsert ="insert into ENCHERES (no_utilisateur, no_article, date_enchere, montant_enchere) values (?,?,?,?)";
	private static final String sqlUpdate = "update ENCHERES set no_utilisateur = ?,date_enchere = ?,montant_enchere = ? where no_article = ?";

	@Override
	public void update(Encheres encheres) throws DALException {
		try(Connection con = JdbcTools.getConnection();
				PreparedStatement stmt = con.prepareStatement(sqlUpdate, Statement.RETURN_GENERATED_KEYS);){
			stmt.setInt(1, encheres.getNoUtilisateur());
			stmt.setDate(2, (Date) encheres.getDateEnchere());
			stmt.setInt(3, encheres.getMontantEnchere());
			stmt.setInt(4, encheres.getNoArticle());
		
			int nbRows = stmt.executeUpdate();
			if(nbRows ==1) {
				ResultSet rs = stmt.getGeneratedKeys();
				if(rs.next()) {
					encheres.setNoUtilisateur(rs.getInt(1));}}
		}
		catch (SQLException e) {
			throw new DALException("update encheres failed - "+ encheres ,e);
		}
	}	

	
	@Override
	public Encheres selectById(int id) throws DALException {
		Encheres encheres = null;
		try (Connection con = JdbcTools.getConnection();
				PreparedStatement stmt = con.prepareStatement(sqlSelectById);)
		{
			stmt.setInt(1,id);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				encheres = new Encheres(rs.getInt("no_utilisateur"),
						rs.getInt("no_article"),
						rs.getDate("date_enchere"),
						rs.getInt("montant_enchere")
						);
				System.out.println(rs.getString(2));
			}
		} catch (SQLException e) {
			throw new DALException("selectById failed - id = "+ id, e);			
		}
		return encheres;
	}
	
	@Override
	public void insert(Encheres encheres) throws DALException {
		try(Connection con = JdbcTools.getConnection();
				PreparedStatement stmt = con.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);){
			stmt.setInt(1, encheres.getNoUtilisateur());
			stmt.setInt(2, encheres.getNoArticle());
			stmt.setDate(3, (Date) encheres.getDateEnchere());
			stmt.setInt(4, encheres.getMontantEnchere());

			int nbRows = stmt.executeUpdate();
			if(nbRows ==1) {
				ResultSet rs = stmt.getGeneratedKeys();
				if(rs.next()) {
					encheres.setNoArticle(rs.getInt(1));}}
		}
		catch (SQLException e) {
			throw new DALException("insert utilisateur failed - "+ encheres ,e);
		}
	}
}
