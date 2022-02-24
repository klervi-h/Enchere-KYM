package encheres.dal;

import encheres.buisness.bo.Utilisateur;

 public interface UtilisateurDAO {
	public void update(Utilisateur utilisateur) throws DALException;
	public Utilisateur selectById(int id) throws DALException;
	public void insert(Utilisateur utilisateur) throws DALException;
	String selectByPassword(String pseudo) throws DALException;
	public int idSelectByPseudo(String pseudo) throws DALException;
	//exemple papeterie 
	/*public void delete(Integer idArt) throws DALException;
	public void delete(Utilisateur utilisateur) throws DALException;*/
}
