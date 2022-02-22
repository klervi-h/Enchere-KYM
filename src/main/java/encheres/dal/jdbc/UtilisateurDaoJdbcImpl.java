package encheres.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import encheres.buisness.bo.Utilisateur;
import encheres.dal.DALException;
import encheres.dal.UtilisateurDAO;


public class UtilisateurDaoJdbcImpl implements UtilisateurDAO {

	private static final String sqlSelectById ="select * from UTILISATEURS where no_utilisateur = ?";
	private static final String sqlInsert ="insert into UTILISATEURS (pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe) values (?,?,?,?,?,?,?,?,?)";
	private static final String sqlUpdate = "update UTILISATEURS set pseudo = ?,nom = ?,prenom = ?,email = ?,telephone = ?,rue = ?,code_postal = ?,ville = ?,mot_de_passe = ?,credit = ? where no_utilisateur = ?";
	
	//PROBLEME AU NIVEAU DE L'UPDATE UTILISATEUR
	@Override
	public void update(Utilisateur utilisateur) throws DALException {
		try(Connection con = JdbcTools.getConnection();
				PreparedStatement stmt = con.prepareStatement(sqlUpdate, Statement.RETURN_GENERATED_KEYS);){
			stmt.setString(1, utilisateur.getPseudo());
			stmt.setString(2, utilisateur.getNom());
			stmt.setString(3, utilisateur.getPrenom());
			stmt.setString(4, utilisateur.getEmail());
			stmt.setString(5, utilisateur.getTelephone());
			stmt.setString(6, utilisateur.getAdresse().getRue());
			stmt.setInt(7, utilisateur.getAdresse().getCodePostale());
			stmt.setString(8, utilisateur.getAdresse().getVille());
			stmt.setString(9, utilisateur.getMotDePasse());
			stmt.setInt(10, utilisateur.getCredit());
			stmt.setInt(11, utilisateur.getNoUtilisateur());
								
			int nbRows = stmt.executeUpdate();
			if(nbRows ==1) {
				ResultSet rs = stmt.getGeneratedKeys();
				if(rs.next()) {
					utilisateur.setNoUtilisateur(rs.getInt(1));}}
			}
		catch (SQLException e) {
			throw new DALException("insert utilisateur failed - "+ utilisateur ,e);
		}
	}	
	
	@Override
	public Utilisateur selectById(int id) throws DALException {
		Utilisateur util = null;
		try (Connection con = JdbcTools.getConnection();
				PreparedStatement stmt = con.prepareStatement(sqlSelectById);)
		{
			stmt.setInt(1,id);
			ResultSet rs = stmt.executeQuery();

			if(rs.next()) {
				util = new Utilisateur(rs.getInt("no_utilisateur"),
						rs.getString("pseudo"),
						rs.getString("nom"),
						rs.getString("prenom"),
						rs.getString("email"),
						rs.getString("telephone"),
						rs.getString("rue"),
						rs.getInt("code_postal"),
						rs.getString("ville"),
						rs.getString("mot_de_passe"),
						rs.getInt("credit")
						);
				System.out.println(rs.getString(2));
						}
		} catch (SQLException e) {
			throw new DALException("selcetById failde - id = "+ id, e);			
		}
		return util;
}

	@Override
	public void insert(Utilisateur utilisateur) throws DALException {

		try(Connection con = JdbcTools.getConnection();
					PreparedStatement stmt = con.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);){
				stmt.setString(1, utilisateur.getPseudo());
				stmt.setString(2, utilisateur.getNom());
				stmt.setString(3, utilisateur.getPrenom());
				stmt.setString(4, utilisateur.getEmail());
				stmt.setString(5, utilisateur.getTelephone());
				stmt.setString(6, utilisateur.getAdresse().getRue());
				stmt.setInt(7, utilisateur.getAdresse().getCodePostale());
				stmt.setString(8, utilisateur.getAdresse().getVille());
				stmt.setString(9, utilisateur.getMotDePasse());
				
							
				int nbRows = stmt.executeUpdate();
				if(nbRows ==1) {
					ResultSet rs = stmt.getGeneratedKeys();
					if(rs.next()) {
						utilisateur.setNoUtilisateur(rs.getInt(1));}}
				}
			catch (SQLException e) {
				throw new DALException("insert utilisateur failed - "+ utilisateur ,e);
			}
		
		
	}
}
