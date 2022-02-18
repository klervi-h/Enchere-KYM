package encheres.dal;

import encheres.buisness.bo.Utilisateur;

 public interface UtilisateurDAO {
	public Utilisateur selectById(int id) throws DALException;
	/*public List<Article> selectAll() throws DALException;
	public List<Article> selectByMarque(String marque) throws DALException;
	public List<Article> selectByMotCle(String motCle) throws DALException;
	public void insert(Article article) throws DALException;
	public void update(Article article) throws DALException;
	public void delete(Integer idArt) throws DALException;*/

	public void insert(Utilisateur utilisateur) throws DALException;
}
