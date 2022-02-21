package encheres.buisness.bll;


import encheres.buisness.bo.Utilisateur;
import encheres.dal.DALException;
import encheres.dal.DAOFactory;
import encheres.dal.UtilisateurDAO;

public class UtilisateurManager {

	private UtilisateurDAO utilisateurDAO;

	public UtilisateurManager() {
		this.utilisateurDAO=DAOFactory.getUtilisateurDao();
	}
	public Utilisateur afficherParId(int id) throws BusinessException
	{
		Utilisateur utilisateur = null;
		
		BusinessException exception = new BusinessException();

		try {
			utilisateur = this.utilisateurDAO.selectById(id);
		} catch (DALException e) 
		{

			e.printStackTrace();
		}
		return utilisateur;
	}
	
	public void update(Utilisateur utilisateur) throws BusinessException
	{
		
		BusinessException exception = new BusinessException();

		try {
			this.utilisateurDAO.update(utilisateur);
		} catch (DALException e) 
		{

			e.printStackTrace();
		}
	}
	

	public void ajouter(Utilisateur utilisateur) throws BusinessException
	{
		BusinessException exception = new BusinessException();
		
		
		
		try {
			this.utilisateurDAO.insert(utilisateur);
		} catch (DALException e) {
			
			e.printStackTrace();
		}
	}
}
