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
@WebServlet("/VenteRemporterVendeur")
public class VenteRemporterVendeur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ArticleManager aM = new ArticleManager();
	Article article = null;
	UtilisateurManager uM = new UtilisateurManager();
	Utilisateur vendeur = null;
	Utilisateur acheteur = null;
	EncheresManager eM= new EncheresManager();
	Encheres encheres = null;
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/venteRemporterVendeur.jsp");
		int idArt = 2;
		
		try {
			article = aM.afficherParId(idArt);
			encheres = eM.afficherParId(idArt);
			vendeur = uM.afficherParId(article.getNoUtilisateur());
			acheteur = uM.afficherParId(encheres.getNoUtilisateur());
		} catch (BusinessException e1) {
			e1.printStackTrace();
		}

		String nomArticle = article.getNomArticle();
		String descriptionArticle = article.getDescription();
		int prixArticle = article.getPrixVente();
		int prixInitArticle = article.getPrixInitial();
		String dateFinArticle = article.getDateFin().toString();
		String rueUtilisateur = article.getAdresseRetrait().getRue();
		int codePostalUtilisateur = article.getAdresseRetrait().getCodePostale();
		String villeUtilisateur = article.getAdresseRetrait().getVille();
		int noVendeur = article.getNoUtilisateur();
		String pseudoVendeur = vendeur.getPseudo();
		String pseudoAcheteur = acheteur.getPseudo();
		

		request.setAttribute("nomArticle", nomArticle);
		request.setAttribute("description", descriptionArticle);
		request.setAttribute("prixArticle", prixArticle);
		request.setAttribute("prixInitial", prixInitArticle);
		request.setAttribute("dateFin", dateFinArticle);
		request.setAttribute("rueUtil", rueUtilisateur);
		request.setAttribute("codePostaleUtil", codePostalUtilisateur);
		request.setAttribute("villeUtil", villeUtilisateur);
		request.setAttribute("noVendeur", noVendeur);
		
		request.setAttribute("pseudoVendeur", pseudoVendeur);
		request.setAttribute("acheteur", pseudoAcheteur);
		
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
