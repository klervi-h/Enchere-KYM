package encheres.dal;

import encheres.buisness.bo.Article;
import encheres.buisness.bo.Utilisateur;

public class TesteurDAL {

	public static void main(String[] args) throws DALException {
		
		UtilisateurDAO utilisateurDAO = DAOFactory.getUtilisateurDao();
		System.out.println("recuperation d'un utilisateur... ");
		
		Utilisateur u = utilisateurDAO.selectById(3);
		System.out.println(u.toString());
		
		Utilisateur u2 = new Utilisateur(u.getNoUtilisateur(),u.getPseudo(),u.getNom(),u.getPrenom(),u.getEmail(),u.getTelephone(),u.getAdresse().getRue(),44000,u.getAdresse().getVille(),u.getMotDePasse(),30);
		
		utilisateurDAO.update(u2);
		
		ArticleDAO articleDAO = DAOFactory.getArticleDao();
		System.out.println("recuperation d'un article... ");
		try {
			Article a = articleDAO.selectById(5);
		System.out.println(a.toString());
	} catch (DALException e) {
		e.printStackTrace();
	}	
	}

}
