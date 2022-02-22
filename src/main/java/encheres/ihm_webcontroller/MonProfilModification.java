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
 * Servlet implementation class MonProfilModification
 */
@WebServlet("/MonProfilModification")
public class MonProfilModification extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//ajout d'un utilisateur pour test d'affichage
	UtilisateurManager uM = new UtilisateurManager();
	Utilisateur profilTest =/* null;*/new Utilisateur(3,"chuky","Walker","Ranger","chuck@norris.com", "0123456789", "rue du Ranch", 28000, "Texas", "mdp", 4);

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/monProfilModification.jsp");
/*	try {
			profilTest = uM.afficherParId(3);
		} catch (BusinessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/

		String pseudoUtilisateur = profilTest.getPseudo();
		String nomUtilisateur = profilTest.getNom();
		String prenomUtilisateur = profilTest.getPrenom();
		String emailUtilisateur = profilTest.getEmail();
		String telephoneUtilisateur = profilTest.getTelephone();
		String rueUtilisateur = profilTest.getAdresse().getRue();
		int codePostalUtilisateur = profilTest.getAdresse().getCodePostale();
		String villeUtilisateur = profilTest.getAdresse().getVille();
		String passwordUtilisateur = profilTest.getMotDePasse();
		int creditUtilisateur = profilTest.getCredit();

		request.setAttribute("pseudonyme", pseudoUtilisateur);
		request.setAttribute("nomUtil", nomUtilisateur);
		request.setAttribute("prenomUtil", prenomUtilisateur);
		request.setAttribute("emailUtil", emailUtilisateur);
		request.setAttribute("telephoneUtil", telephoneUtilisateur);
		request.setAttribute("rueUtil", rueUtilisateur);
		request.setAttribute("codePostaleUtil", codePostalUtilisateur);
		request.setAttribute("villeUtil", villeUtilisateur);
		request.setAttribute("password", passwordUtilisateur);
		request.setAttribute("creditUtil", creditUtilisateur);
		request.setAttribute("noUtil",3);

		rd.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utilisateur utilisateur=null;
		//try {		
			String password = (request.getParameter("newPassword")!=null)? request.getParameter("newPassword") : request.getParameter("mdp");
			utilisateur = new Utilisateur(
					Integer.parseInt (request.getParameter("noUtil")),
					request.getParameter("pseudo"),
					request.getParameter("nom"),
					request.getParameter("prenom"),
					request.getParameter("email"),
					request.getParameter("telephone"),
					request.getParameter("rue"),
					Integer.parseInt(request.getParameter("codePostal")),
					request.getParameter("ville"),
					password,
					Integer.parseInt(request.getParameter("credit"))
					);
		//	UtilisateurManager utilisateurManager = new UtilisateurManager();
		//	utilisateurManager.update(utilisateur);
			//verif en console
			System.out.println(utilisateur.toString());

	//	} catch (NumberFormatException | BusinessException e) {
	//		e.printStackTrace();
	//		System.out.println("erreur au niveau du format des données saisies par l'utilisateur dans la page : modificationMonProfil");
	//	}
		
		//envoi sur la jsp Mon profil
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/monProfil.jsp");
		String pseudoUtilisateur = utilisateur.getPseudo();
		String nomUtilisateur = utilisateur.getNom();
		String prenomUtilisateur = utilisateur.getPrenom();
		String emailUtilisateur = utilisateur.getEmail();
		String telephoneUtilisateur = utilisateur.getTelephone();
		String rueUtilisateur = utilisateur.getAdresse().getRue();
		int codePostalUtilisateur = utilisateur.getAdresse().getCodePostale();
		String villeUtilisateur = utilisateur.getAdresse().getVille();

		request.setAttribute("pseudonyme", pseudoUtilisateur);
		request.setAttribute("nomUtil", nomUtilisateur);
		request.setAttribute("prenomUtil", prenomUtilisateur);
		request.setAttribute("emailUtil", emailUtilisateur);
		request.setAttribute("telephoneUtil", telephoneUtilisateur);
		request.setAttribute("rueUtil", rueUtilisateur);
		request.setAttribute("codePostaleUtil", codePostalUtilisateur);
		request.setAttribute("villeUtil", villeUtilisateur);

		rd.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
