package redirect.servlet.src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Redirect extends HttpServlet {
	private static final long serialVersionUID = 1354561L;

    public Redirect() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		String unknown_path = request.getContextPath() + "/notfound";
		String id = request.getParameter("id");
		ServletContext contex = getServletContext();
		String value = contex.getInitParameter("val");
		ServletConfig config = getServletConfig(); 
		String priv_value = config.getInitParameter("private_val");
		//RequestDispatcher rd = s_contex.getRequestDispatcher(path);
		//rd.forward(request, response);	
		HttpSession session = request.getSession();
		
		session.setAttribute("plane", "Boeing");
		session.setAttribute("model", "747");
		
		request.setAttribute("surname", "Turtle");
		request.setAttribute("height", 178);
		
		contex.setAttribute("car", "Lada");
		contex.setAttribute("car_numb", "L777H");
		
		Cookie[] cooks = request.getCookies();
		String name_cook = "fat";
		Cookie c = null;
		
		if(cooks != null){
			for(Cookie x: cooks){
				if(name_cook.equals(x.getName())){
					c = x;
					break;
				}
			}
		}
		
		SessData temp = (SessData) request.getSession().getAttribute("name");

		if(id == null){
			response.sendRedirect(unknown_path);
		}else{
			if(id.equals("excp")){
				//int y = 0;
				//int x = 5/y;	
				throw new RuntimeException("Yo!");
			}
			
			if(id.equals("out")){
				response.sendRedirect("https://google.com/");
			}else{
				response.setContentType("text/html");
				PrintWriter pw = response.getWriter();
				pw.println("<h1> This ID Value Was Input: " + id + "</h1>");
				pw.println("<h2> Public Parameter Value: " + value + "</h2>");
				pw.println("<h2> Private Parameter: " + priv_value + "</h2>");
				pw.println("<h2> Cookie " + c.getName() + " was set to " + c.getValue() + "</h2>");		
				pw.println("<h2> Session \"name\" was set to: <li> string value: " + temp.getStr() + 
						"<li> integet value: " + temp.getVal() + "<li> double value: " + temp.getKF() + "</h2>");
				
				if(id.equals("to2")){
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {					
						e.printStackTrace();
					}
					
					getServletContext().getRequestDispatcher("/2.jsp").forward(request, response);
				}
				
				pw.close();				
			}
		}		
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
