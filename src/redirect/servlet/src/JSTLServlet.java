package redirect.servlet.src;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JSTLServlet extends HttpServlet {
	private static final long serialVersionUID = 1558848465132488L;

    public JSTLServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String[] autos = {"Lada", "Mazda", "Lamborghini", "Bugatti", "Infiniti"}; 
		
		request.setAttribute("nominal", 2);
		request.setAttribute("isVisible", true);
		request.setAttribute("cars", autos);
		request.setAttribute("mes", "<script>alert('Hello Alert')</script>");
		getServletContext().getRequestDispatcher("/try_jstl.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
