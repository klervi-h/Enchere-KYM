package encheres.ihm_webcontroller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encheres.buisness.bll.ArticleManager;
import encheres.buisness.bll.BusinessException;
import encheres.buisness.bo.Article;
import encheres.buisness.bo.Utilisateur;

/**
 * Servlet implementation class CreationVente
 */
@WebServlet("/CreationVente")
public class CreationVente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int noUtil=2;
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
		
		try {
			Date debut = Date.valueOf(request.getParameter("dateDebut"));
			Date fin = Date.valueOf(request.getParameter("dateFin"));
			Article article = new Article(request.getParameter("article"),request.getParameter("description"),
					Integer.parseInt(request.getParameter("categorie")), Integer.parseInt(request.getParameter("prixInit")),
					debut,fin
					,request.getParameter("rue"), Integer.parseInt(request.getParameter("codePostale")),request.getParameter("ville"),
					noUtil);
			ArticleManager articleManager = new ArticleManager();
			articleManager.ajouter(article);
			System.out.println(article.toString());
		} catch (NumberFormatException | BusinessException e) {
			e.printStackTrace();
			System.out.println("erreur au niveau du format des données saisies ppar l'utilisateur dans la page : CreationVente");
		}


		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/creationVente.jsp");
		rd.forward(request, response);
	}

}


// /Enchere-KYM/src/main/webapp/WEB-INF/jsp/creationVente.jsp