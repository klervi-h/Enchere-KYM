package encheres.ihm_webcontroller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import encheres.buisness.bll.ArticleManager;
import encheres.buisness.bo.Article;

/**
 * Servlet implementation class AcceuilConnectee
 */
@WebServlet("/AccueilConnectee")
public class AccueilConnectee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArticleManager aM = new ArticleManager();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String chemin = "/Accueil";
		HttpSession session = request.getSession();
		if(null!=session.getAttribute("noUtil")){
			List<Article> listeArticle = null;
			try {
				listeArticle = aM.getCatalogue();
			} catch (Exception e) {
				e.printStackTrace();
			}		
			request.setAttribute("listeArticle", listeArticle);
			chemin = "/WEB-INF/jsp/accueilConnectee.jsp";
		}

		RequestDispatcher rd = request.getRequestDispatcher(chemin);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
