package encheres.buisness.bll;

import java.sql.Date;

import encheres.buisness.bo.Article;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Article article = new Article("kaway","rouge",4, 24, Date.valueOf("2020-11-05"), Date.valueOf("2021-2-2"), "rue", 440, "nantes",2);
ArticleManager aM = new ArticleManager();
try {
	aM.ajouter(article);
} catch (BusinessException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
}
