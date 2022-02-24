package encheres.ihm_webcontroller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encheres.buisness.bll.ArticleManager;
import encheres.buisness.bo.Article;

/**
 * Servlet implementation class AcceuilConnectee
 */
@WebServlet("/AcceuilConnectee")
public class AcceuilConnectee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArticleManager aM = new ArticleManager();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Article> listeArticle = null;
		try {
			listeArticle = aM.getCatalogue();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		request.setAttribute("listeArticle", listeArticle);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/accueilConnectee.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/accueilConnectee.jsp");
		rd.forward(request, response);
	}

}
