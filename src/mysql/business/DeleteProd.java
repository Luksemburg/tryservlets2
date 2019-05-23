package mysql.business;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteProd extends HttpServlet {
	private static final long serialVersionUID = 88100054564L;

    public DeleteProd() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			int id = Integer.parseInt(request.getParameter("id"));
			ProductDB.delete(id);
			response.sendRedirect(request.getContextPath() + "/Answer");
		}catch(Exception e){
			getServletContext().getRequestDispatcher("/notfound").forward(request, response);
		}
	}

}
