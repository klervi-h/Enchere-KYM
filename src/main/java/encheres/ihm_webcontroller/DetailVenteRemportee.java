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
import encheres.buisness.bll.EncheresManager;
import encheres.buisness.bll.UtilisateurManager;
import encheres.buisness.bo.Article;
import encheres.buisness.bo.Encheres;
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
		int noArt=2;
		
		try {
			articleTest = aM.afficherParId(noArt);
		} catch (BusinessException e1) {
			e1.printStackTrace();
		}

		String nomArticle = articleTest.getNomArticle();
		String descriptionArticle = articleTest.getDescription();
		int prixArticle = articleTest.getPrixVente();
		int prixInitArticle = articleTest.getPrixInitial();
		String rueVendeur = articleTest.getAdresseRetrait().getRue();
		int codePostalVendeur = articleTest.getAdresseRetrait().getCodePostale();
		String villeVendeur = articleTest.getAdresseRetrait().getVille();
		int noVendeur = articleTest.getNoUtilisateur();
		
		try {
			vendeur = uM.afficherParId(noVendeur);
		} catch (BusinessException e1) {
			e1.printStackTrace();
		}
		String telephoneVendeur = vendeur.getTelephone();
		String pseudoVendeur = vendeur.getPseudo();

		request.setAttribute("nomArticle", nomArticle);
		request.setAttribute("description", descriptionArticle);
		request.setAttribute("prixArticle", prixArticle);
		request.setAttribute("prixInitial", prixInitArticle);
		request.setAttribute("rueVendeur", rueVendeur);
		request.setAttribute("codePostaleVendeur", codePostalVendeur);
		request.setAttribute("villeVendeur", villeVendeur);
		request.setAttribute("telephoneVendeur", telephoneVendeur);
		request.setAttribute("pseudoVendeur", pseudoVendeur);
		
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
