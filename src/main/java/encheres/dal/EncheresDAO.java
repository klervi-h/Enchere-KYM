package encheres.dal;

import encheres.buisness.bo.Article;
import encheres.buisness.bo.Encheres;

public interface EncheresDAO {
		public Encheres selectById(int id) throws DALException;
		public void insert(Encheres encheres) throws DALException;
		public void update(Encheres encheres) throws DALException;
		// TODO Auto-generated constructor stub
	

}
