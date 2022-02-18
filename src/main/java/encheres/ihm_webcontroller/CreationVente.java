package encheres.ihm_webcontroller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encheres.buisness.bo.Article;

/**
 * Servlet implementation class CreationVente
 */
@WebServlet("/CreationVente")
public class CreationVente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/creationVente.jsp");
		rd.forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Article article=null;
		SimpleDateFormat dateD = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat dateF = new SimpleDateFormat("yyyy-MM-dd");
		
	
		try {
			article = new Article(request.getParameter("article"),request.getParameter("description"),
					Integer.parseInt(request.getParameter("categorie")), Integer.parseInt(request.getParameter("prixInit")),
					dateD.parse(request.getParameter("dateDebut")),
					dateF.parse(request.getParameter("dateFin"))
					,request.getParameter("rue"), Integer.parseInt(request.getParameter("codePostale")),request.getParameter("ville"));
			System.out.println(article.toString());
		} catch (NumberFormatException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
			
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/creationVente.jsp");
		rd.forward(request, response);
	}

}


// /Enchere-KYM/src/main/webapp/WEB-INF/jsp/creationVente.jsp