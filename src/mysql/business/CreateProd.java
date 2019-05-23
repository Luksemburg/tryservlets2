package mysql.business;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateProd extends HttpServlet {
	private static final long serialVersionUID = 177756546579L;

    public CreateProd() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			String name = request.getParameter("name");
			int price = Integer.parseInt(request.getParameter("price"));
			Product product = new Product(name, price);
			ProductDB.insert(product);
			response.sendRedirect(request.getContextPath() + "/Answer");
		}catch(Exception e){
			getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
		}
	}

}
