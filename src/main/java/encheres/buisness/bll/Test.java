package encheres.buisness.bll;

import java.sql.Date;

import encheres.buisness.bo.Article;
import encheres.buisness.bo.Utilisateur;

public class Test {

	public static void main(String[] args) {
		
		Utilisateur util = null;
		UtilisateurManager uM = new UtilisateurManager();
		
		try {
			util = uM.afficherParId(3);
		} catch (BusinessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(util.toString());
		
		Article article = null;
		ArticleManager aM = new ArticleManager();
		
		try {
			article = aM.afficherParId(3);
		} catch (BusinessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(article.toString());
		
		
		// TODO Auto-generated method stub
Article article2 = new Article("kaway","rouge",4, 24, Date.valueOf("2020-11-05"), Date.valueOf("2021-2-2"), "rue", 440, "nantes",2);
ArticleManager aM2 = new ArticleManager();
try {
	aM2.ajouter(article2);
} catch (BusinessException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
}
