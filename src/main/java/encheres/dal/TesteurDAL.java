package encheres.dal;

import encheres.buisness.bo.Article;
import encheres.buisness.bo.Utilisateur;

public class TesteurDAL {

	public static void main(String[] args) throws DALException {
		
		UtilisateurDAO utilisateurDAO = DAOFactory.getUtilisateurDao();
		System.out.println("recuperation d'un utilisateur... ");
		
		Utilisateur u = utilisateurDAO.selectById(3);
		System.out.println(u.toString());
		
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
