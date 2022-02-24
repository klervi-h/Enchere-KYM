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
	Utilisateur utilisateur =null;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/monProfilModification.jsp");
		HttpSession session = request.getSession();
		int noUtil = (int) session.getAttribute("noUtil");
		try {
			utilisateur = uM.afficherParId(noUtil);
		} catch (BusinessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String pseudoUtilisateur = utilisateur.getPseudo();
		String nomUtilisateur = utilisateur.getNom();
		String prenomUtilisateur = utilisateur.getPrenom();
		String emailUtilisateur = utilisateur.getEmail();
		String telephoneUtilisateur = utilisateur.getTelephone();
		String rueUtilisateur = utilisateur.getAdresse().getRue();
		int codePostalUtilisateur = utilisateur.getAdresse().getCodePostale();
		String villeUtilisateur = utilisateur.getAdresse().getVille();
		String passwordUtilisateur = utilisateur.getMotDePasse();
		int creditUtilisateur = utilisateur.getCredit();

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
		HttpSession session = request.getSession();
		int noUtil = (int) session.getAttribute("noUtil");
		int credit;
		String action = request.getParameter("action");
		String chemin = null;

		if ("enregistrer".equals(action)) {

			try {
				Utilisateur utilisateur=null;
				credit = uM.afficherParId(noUtil).getCredit();	
				String password = (request.getParameter("newPassword")!=null)? request.getParameter("newPassword") : request.getParameter("mdp");

				utilisateur = new Utilisateur(
						noUtil,
						request.getParameter("pseudo"),
						request.getParameter("nom"),
						request.getParameter("prenom"),
						request.getParameter("email"),
						request.getParameter("telephone"),
						request.getParameter("rue"),
						Integer.parseInt(request.getParameter("codePostal")),
						request.getParameter("ville"),
						password,
						credit
						);
				uM.update(utilisateur);
				//verif en console
				System.out.println(utilisateur.toString());

			} catch (NumberFormatException | BusinessException e) {
				e.printStackTrace();
				System.out.println("erreur au niveau du format des données saisies par l'utilisateur dans la page : modificationMonProfil");
			}
			chemin = "/WEB-INF/jsp/monProfil.jsp";
		}else if("supprimer".equals(action)) {

			//Suppression utilisateur
			try {
				uM.delete(utilisateur);
				chemin = "/Accueil";
			} catch (BusinessException e) {
				e.printStackTrace();
			}
			//verif en console
			System.out.println("une erreur est survenue lors de la suppression du compte dans la page: CreationCompte");

			//envoi vers la page d'accueil
			RequestDispatcher rd = request.getRequestDispatcher(chemin);
			rd.forward(request, response);
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}
	}
}

