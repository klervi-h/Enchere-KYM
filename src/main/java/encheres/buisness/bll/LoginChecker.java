package encheres.buisness.bll;

import encheres.buisness.bo.Utilisateur;
import encheres.dal.DALException;
import encheres.dal.DAOFactory;
import encheres.dal.UtilisateurDAO;


	public class LoginChecker {


		private UtilisateurDAO utilisateurDAO;

		public LoginChecker() {
			this.utilisateurDAO=DAOFactory.getUtilisateurDao();
		}
		public boolean checkPassword(String pseudo, String password) throws BusinessException
		{
			Utilisateur utilisateur = null;
			String passwordBdd = null;
			boolean valid = false;
			
			
			BusinessException exception = new BusinessException();

			try {
				passwordBdd = this.utilisateurDAO.selectByPassword(pseudo);
				
			} catch (DALException e) 
			{

				e.printStackTrace();
			}
			
			valid = password.equals(passwordBdd)? true : false;
			
			return valid;
		}
	
}
