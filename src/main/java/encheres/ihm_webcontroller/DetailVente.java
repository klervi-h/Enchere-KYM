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
import encheres.buisness.bo.Article;

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

		try {
			articleTest = aM.afficherParId(1);
		} catch (BusinessException e1) {
			e1.printStackTrace();
		}

		int noArticle = articleTest.getNoArticle();
		String nomArticle = articleTest.getNomArticle();
		String descriptionArticle = articleTest.getDescription();
		int catArticle = articleTest.getNoCategorie();
		int prixArticle = articleTest.getPrixVente();
		int prixInitArticle = articleTest.getPrixInitial();
		String dateFinArticle = articleTest.getDateFin().toString();
		String rueUtilisateur = articleTest.getAdresseRetrait().getRue();
		int codePostalUtilisateur = articleTest.getAdresseRetrait().getCodePostale();
		String villeUtilisateur = articleTest.getAdresseRetrait().getVille();
		int noUtilArticle = articleTest.getNoUtilisateur();

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
		/*Article article = null;
		 *newPrixVente

		article = new Article(
				Integer.parseInt(request.getParameter("maProposition"))
				);*/

		int newPrixVente = Integer.parseInt(request.getParameter("newPrixVente"));
		int nArticle = Integer.parseInt(request.getParameter("numeroArticle"));

		try {
			articleTest = aM.afficherParId(nArticle);
		} catch (BusinessException e1) {
			e1.printStackTrace();
		}
		articleTest.setPrixVente(newPrixVente);
		
		ArticleManager articleManager = new ArticleManager();
		try {
			articleManager.update(articleTest);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//verif en console
		System.out.println(articleTest.toString());
		
		/*RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/detailVente.jsp");
		
		int prixArticle = articleTest.getPrixVente();
		request.setAttribute("prixArticle", prixArticle);
		
		rd.forward(request, response);*/
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//TODO articleTest = aM. faire comme dans modif profil articleTest

		/*try {		
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
			System.out.println(utilisateur.toString());*/
		
		
	}

}
