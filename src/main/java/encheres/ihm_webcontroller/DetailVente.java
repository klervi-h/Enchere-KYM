package encheres.ihm_webcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import encheres.buisness.bll.ArticleManager;
import encheres.buisness.bll.BusinessException;
import encheres.buisness.bo.Article;

/**
 * Servlet implementation class DetailVente
 */

@WebServlet("/DetailVente")
public class DetailVente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//Création d'un article test de la bdd
	ArticleManager aM = new ArticleManager();
	Article article = null;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/detailVente.jsp");
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		try {
			article = aM.afficherParId(1);
		} catch (BusinessException e1) {
			e1.printStackTrace();
		}

		int noArticle = article.getNoArticle();
		String nomArticle = article.getNomArticle();
		String descriptionArticle = article.getDescription();
		int catArticle = article.getNoCategorie();
		int prixArticle = article.getPrixVente();
		int prixInitArticle = article.getPrixInitial();
		String dateFinArticle = article.getDateFin().toString();
		String rueUtilisateur = article.getAdresseRetrait().getRue();
		int codePostalUtilisateur = article.getAdresseRetrait().getCodePostale();
		String villeUtilisateur = article.getAdresseRetrait().getVille();
		int noUtilArticle = article.getNoUtilisateur();

		request.setAttribute("nArticle", noArticle);
		request.setAttribute("nomArticle", nomArticle);
		request.setAttribute("description", descriptionArticle);
		request.setAttribute("categorie", catArticle);
		request.setAttribute("prixArticle", prixArticle);
		request.setAttribute("prixInitial", prixInitArticle);
		request.setAttribute("dateFin", dateFinArticle);
		request.setAttribute("rueUtil", rueUtilisateur);
		request.setAttribute("codePostaleUtil", codePostalUtilisateur);
		request.setAttribute("villeUtil", villeUtilisateur);
		request.setAttribute("noUtilisateur", noUtilArticle);

		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int noUtil = (int) session.getAttribute("noUtil");
		
		int newPrixVente = Integer.parseInt(request.getParameter("newPrixVente"));
		int nArticle = Integer.parseInt(request.getParameter("numeroArticle"));

		try {
			article = aM.afficherParId(nArticle);
		} catch (BusinessException e1) {
			e1.printStackTrace();
		}
		article.setPrixVente(newPrixVente);
		
		
		
		ArticleManager articleManager = new ArticleManager();
		try {
			articleManager.update(article);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//verif en console
		System.out.println(article.toString());
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
