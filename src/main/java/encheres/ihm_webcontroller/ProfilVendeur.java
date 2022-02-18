package encheres.ihm_webcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encheres.buisness.bo.Utilisateur;

/**
 * Servlet implementation class ProfilVendeur
 */
@WebServlet("/ProfilVendeur")
public class ProfilVendeur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//ajout d'un utilisateur pour test d'affichage
	private Utilisateur profilTest = new Utilisateur("paf","MARTIN","Bernard","aze@ty.com",0101010101,"rue A",101000,"NANTES","password");

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/profilVendeur.jsp");
		
		String pseudoUtilisateur = profilTest.getPseudo();
		String nomUtilisateur = profilTest.getNom();
		String prenomUtilisateur = profilTest.getPrenom();
		String emailUtilisateur = profilTest.getEmail();
		int telephoneUtilisateur = profilTest.getTelephone();
		String rueUtilisateur = profilTest.getAdresse().getRue();
		int codePostalUtilisateur = profilTest.getAdresse().getCodePostale();
		String villeUtilisateur = profilTest.getAdresse().getVille();

		request.setAttribute("pseudonyme", pseudoUtilisateur);
		request.setAttribute("nomUtil", nomUtilisateur);
		request.setAttribute("prenomUtil", prenomUtilisateur);
		request.setAttribute("emailUtil", emailUtilisateur);
		request.setAttribute("telephoneUtil", telephoneUtilisateur);
		request.setAttribute("rueUtil", rueUtilisateur);
		request.setAttribute("codePostaleUtil", codePostalUtilisateur);
		request.setAttribute("villeUtil", villeUtilisateur);
		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/profilVendeur.jsp");
		rd.forward(request, response);
	}

}
