package encheres;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class TestPoolConnection
 */
@WebServlet("/TestPoolConnection")
public class TestPoolConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		try {
			Context context = new InitialContext();
			//Recherche sde la datasource
			DataSource dataSource = (DataSource) context.lookup("jdbc/pool_cnx");
			//Demande une connection : methode getConnection ; en attentente tant qu'il n'y a pas de co dispo
			Connection cnx = dataSource.getConnection();
			out.print("la co est : "+ (cnx.isClosed()? "fermé":"ouverte"));
			//Liberer la co lorsqu'ion en a plus besoin
			cnx.close(); //la co est remise dans le pull
			
			
			
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			out.print("une erreur est survenue lors de l'utilisation de la base de donnée");
		}
		
				
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
