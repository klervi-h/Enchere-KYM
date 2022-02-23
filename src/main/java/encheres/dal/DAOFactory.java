package encheres.dal;

import java.lang.reflect.InvocationTargetException;

public class DAOFactory {


	public static UtilisateurDAO getUtilisateurDao() {

		try {
			return (UtilisateurDAO) Class.forName("encheres.dal.jdbc.UtilisateurDaoJdbcImpl").getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static ArticleDAO getArticleDao() {

		try {
			return (ArticleDAO) Class.forName("encheres.dal.jdbc.ArticleDaoJdbcImpl").getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static EncheresDAO getEnchereDAO() {
		try {
			return (EncheresDAO) Class.forName("encheres.dal.jdbc.EncheresDaoJdbcImpl").getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
