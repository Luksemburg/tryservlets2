package redirect.servlet.src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SetCookie extends HttpServlet {
	private static final long serialVersionUID = 5151885L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response){
		Cookie cook = new Cookie("fat", "132 kg");
		response.addCookie(cook);
		
		try{
			PrintWriter pw = response.getWriter();
			pw.println("<h2>Cookie " + cook.getName() + " was set to " + cook.getValue() + "</h2>");
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	
}
