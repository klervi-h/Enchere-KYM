package encheres.ihm_webcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import encheres.buisness.bll.BusinessException;
import encheres.buisness.bll.LoginChecker;
import encheres.buisness.bll.UtilisateurManager;

/**
 * Servlet implementation class Connexion
 */
@WebServlet("/Connexion")
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/connexion.jsp");
		rd.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String chemin = null;
		String pseudo = request.getParameter("pseudo");
		String password = request.getParameter("password");
		UtilisateurManager utilisateurManager = new UtilisateurManager();
		int noUtil=0;
		try {
			noUtil= utilisateurManager.idParPseudo(pseudo) ;
		} catch (BusinessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		LoginChecker logCK = new LoginChecker();

		try {
			if (logCK.checkPassword(pseudo, password))
			{
				HttpSession session = request.getSession();
				session.setAttribute("noUtil", noUtil );
				chemin="/WEB-INF/jsp/accueil.jsp";
			}
			else
			{chemin ="/WEB-INF/jsp/connexion.jsp";
			}
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher(chemin);
		rd.forward(request, response);	
	}
}
