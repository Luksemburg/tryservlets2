package mysql.business;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditProd extends HttpServlet {
	private static final long serialVersionUID = 665752422151L;

    public EditProd() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			int id = Integer.parseInt(request.getParameter("id"));
			Product product = ProductDB.selectOne(id);
			
			if(product != null){
				request.setAttribute("product", product);
				getServletContext().getRequestDispatcher("/edit.jsp").forward(request, response);
			}else{
				getServletContext().getRequestDispatcher("/notfound").forward(request, response);
			}
			
		}catch(Exception e){
			getServletContext().getRequestDispatcher("/notfound").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			int price = Integer.parseInt(request.getParameter("price"));
			Product product = new Product(id, name, price);
			ProductDB.update(product);
			response.sendRedirect(request.getContextPath() + "/Answer");
		}catch(Exception e){
			getServletContext().getRequestDispatcher("/notfound").forward(request, response);
		}
	}

}
