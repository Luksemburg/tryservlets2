package redirect.servlet.src;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendArray extends HttpServlet {
	private static final long serialVersionUID = 145644454L;
       
    public SendArray() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List l = new ArrayList();
		Person p = new Person("Randy", 42);		
		request.setAttribute("person", p);
		//getServletContext().getRequestDispatcher("/el.jsp").forward(request, response);
		
		Collections.addAll(l, "lol", 173, "Serv");
		request.setAttribute("arr", l);
		getServletContext().getRequestDispatcher("/el.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
