package encheres.buisness.bll;

import encheres.buisness.bo.Encheres;
import encheres.dal.DALException;
import encheres.dal.DAOFactory;
import encheres.dal.EncheresDAO;

public class EncheresManager {

	private EncheresDAO encheresDAO;
	public EncheresManager() {
		this.encheresDAO=DAOFactory.getEnchereDAO();
	}

	public Encheres afficherParId(int id) throws BusinessException{
		Encheres encheres = null;
		BusinessException exception = new BusinessException();
		try {
			encheres = this.encheresDAO.selectById(id);
		} catch (DALException e){
			e.printStackTrace();
		}
		return encheres;
	}

	public void update(Encheres encheres) throws BusinessException{
		BusinessException exception = new BusinessException();
		try {
			this.encheresDAO.update(encheres);
		} catch (DALException e){
			e.printStackTrace();
		}
	}

	public void ajouter(Encheres encheres) throws BusinessException{
		BusinessException exception = new BusinessException();
		try {
			this.encheresDAO.insert(encheres);
		} catch (DALException e) {
			e.printStackTrace();
		}
	}
}


