package encheres.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import encheres.buisness.bo.Utilisateur;
import encheres.dal.DALException;
import encheres.dal.UtilisateurDAO;

public class UtilisateurDaoJdbcImpl implements UtilisateurDAO {

	private static final String sqlSelectById ="select * from UTILISATEURS where no_utilisateur = ?";
	private static final String sqlInsert ="insert into UTILISATEURS (pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit) values (?,?,?,?,?,?,?, ?, ?, ?)";

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
						rs.getInt("telephone"),
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
		// TODO Auto-generated method stub
		
	}
}
