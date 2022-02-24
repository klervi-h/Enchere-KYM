package encheres.ihm_webcontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encheres.buisness.bll.ArticleManager;
import encheres.buisness.bll.BusinessException;
import encheres.buisness.bo.Article;

import java.util.List;
/**
 * Servlet implementation class listerEncheres
 */
@WebServlet("/listerEncheres")
public class listerEncheres extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		List<Article> lst;
		try {
			lst=new ArticleManager().getCatalogue();
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
