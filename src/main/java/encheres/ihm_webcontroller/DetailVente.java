package encheres.ihm_webcontroller;

import java.io.IOException;
import java.sql.Date;

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
import encheres.buisness.bo.Retrait;
import encheres.buisness.bo.Utilisateur;

/**
 * Servlet implementation class DetailVente
 */

@WebServlet("/DetailVente")
public class DetailVente extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //Création d'un article test de la bdd
	ArticleManager aM = new ArticleManager();
	Article articleTest = null;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/detailVente.jsp");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		rd.forward(request, response);
		
		try {
			articleTest = aM.afficherParId(3);
		} catch (BusinessException e1) {
			e1.printStackTrace();
		}
		
		int noArticle = articleTest.getNoArticle();
		String nomArticle = articleTest.getNomArticle();
		String descriptionArticle = articleTest.getDescription();
		int catArticle = articleTest.getNoCategorie();
		int prixArticle = articleTest.getPrixVente();
		int prixInitArticle = articleTest.getPrixInitial();
		Date dateFinArticle = articleTest.getDateFin();
		/*String rueUtilisateur = articleTest.getAdresseRetrait().getRueRetrait();
		int codePostalUtilisateur = articleTest.getAdresseRetrait().getCodePostaleRetrait();
		String villeUtilisateur = articleTest.getAdresseRetrait().getVilleRetrait();
		int noUtilArticle = articleTest.getNoUtilisateur();*/

		request.setAttribute("nArticle", noArticle);
		request.setAttribute("nomArticle", nomArticle);
		request.setAttribute("description", descriptionArticle);
		request.setAttribute("categorie", catArticle);
		request.setAttribute("prixArticle", prixArticle);
		request.setAttribute("prixInitial", prixInitArticle);
		request.setAttribute("dateFin", dateFinArticle);
		/*request.setAttribute("rueUtil", rueUtilisateur);
		request.setAttribute("codePostaleUtil", codePostalUtilisateur);
		request.setAttribute("villeUtil", villeUtilisateur);
		request.setAttribute("noUtilisateur", noUtilArticle);*/

		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/detailVente.jsp");
		rd.forward(request, response);
	}

}
