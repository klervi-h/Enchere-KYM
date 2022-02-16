package encheres.dal;

import java.lang.reflect.InvocationTargetException;

public class DAOFactory {

	public static ArticleDAO getArticleDao() {

			try {
				return (ArticleDAO) Class.forName("dal.jdbc.ArticleDaoJdbcImpl").getDeclaredConstructor().newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException
					| ClassNotFoundException e) {
				e.printStackTrace();
			}
			return null;
	}
}
