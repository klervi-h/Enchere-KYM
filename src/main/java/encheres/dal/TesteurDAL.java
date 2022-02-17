package encheres.dal;

import encheres.buisness.bo.Article;

public class TesteurDAL {

	public static void main(String[] args) {
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
