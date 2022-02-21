package encheres.ihm_webcontroller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import encheres.buisness.bll.BusinessException;
import encheres.buisness.bll.UtilisateurManager;

import encheres.buisness.bo.Utilisateur;

/**
 * Servlet implementation class CreationCompte
 */
@WebServlet("/CreationCompte")
public class CreationCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/creationCompte.jsp");
		rd.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
					
			Utilisateur utilisateur = new Utilisateur(
					request.getParameter("pseudo"),
					request.getParameter("nom"),
					request.getParameter("prenom"),
					request.getParameter("email"),
					Integer.parseInt(request.getParameter("telephone")),
					request.getParameter("rue"),
					Integer.parseInt(request.getParameter("codePostal")),
					request.getParameter("ville"),
					request.getParameter("password")
					);
			
			UtilisateurManager utilisateurManager = new UtilisateurManager();
			utilisateurManager.ajouter(utilisateur);
			System.out.println(utilisateur.toString());
		} catch (NumberFormatException | BusinessException e) {
			e.printStackTrace();
			System.out.println("erreur au niveau du format des données saisies ppar l'utilisateur dans la page : CreationCompte");
		}
		
			
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/creationCompte.jsp");
		rd.forward(request, response);
	}

}
