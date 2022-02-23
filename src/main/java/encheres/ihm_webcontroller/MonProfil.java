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
 * Servlet implementation class MonProfil
 */
@WebServlet("/MonProfil")

public class MonProfil extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//ajout d'un utilisateur pour test d'affichage
	//private Utilisateur profilTest = new Utilisateur("paf","MARTIN","Bernard","aze@ty.com",0101010101,"rue A",101000,"NANTES","password");

	//utilisateur de la bdd
	UtilisateurManager uM = new UtilisateurManager();
	Utilisateur utilisateur = null;
	
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int noUtil = (int) session.getAttribute("noUtil");
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/monProfil.jsp");
		
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/monProfil.jsp");
		rd.forward(request, response);
	}
}