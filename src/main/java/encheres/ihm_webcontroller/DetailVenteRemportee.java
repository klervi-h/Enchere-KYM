package encheres.ihm_webcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encheres.buisness.bll.ArticleManager;
import encheres.buisness.bll.BusinessException;
import encheres.buisness.bll.UtilisateurManager;
import encheres.buisness.bo.Article;
import encheres.buisness.bo.Utilisateur;

/**
 * Servlet implementation class VenteRemporterVendeur
 */
@WebServlet("/DetailVenteRemportee")
public class DetailVenteRemportee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ArticleManager aM = new ArticleManager();
	Article articleTest = null;
	UtilisateurManager uM = new UtilisateurManager();
	Utilisateur vendeur = null;
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/detailVenteRemportee.jsp");
		
		try {
			articleTest = aM.afficherParId(2);
		} catch (BusinessException e1) {
			e1.printStackTrace();
		}

		String nomArticle = articleTest.getNomArticle();
		String descriptionArticle = articleTest.getDescription();
		int prixArticle = articleTest.getPrixVente();
		int prixInitArticle = articleTest.getPrixInitial();
		String rueUtilisateur = articleTest.getAdresseRetrait().getRue();
		int codePostalUtilisateur = articleTest.getAdresseRetrait().getCodePostale();
		String villeUtilisateur = articleTest.getAdresseRetrait().getVille();
		int noVendeur = articleTest.getNoUtilisateur();
		
		try {
			vendeur = uM.afficherParId(noVendeur);
		} catch (BusinessException e1) {
			e1.printStackTrace();
		}
		String telephoneUtilisateur = vendeur.getTelephone();
		String pseudoUtilisateur = vendeur.getPseudo();

		request.setAttribute("nomArticle", nomArticle);
		request.setAttribute("description", descriptionArticle);
		request.setAttribute("prixArticle", prixArticle);
		request.setAttribute("prixInitial", prixInitArticle);
		request.setAttribute("rueUtil", rueUtilisateur);
		request.setAttribute("codePostaleUtil", codePostalUtilisateur);
		request.setAttribute("villeUtil", villeUtilisateur);
		
		request.setAttribute("telephoneUtil", telephoneUtilisateur);
		request.setAttribute("pseudoVendeur", pseudoUtilisateur);
		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
