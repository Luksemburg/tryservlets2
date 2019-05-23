package redirect.servlet.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SetSessionData extends HttpServlet {
	private static final long serialVersionUID = 89746462L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		
		Random rnd = new Random();
		SessData sd = new SessData("lol", rnd.nextInt(100000), rnd.nextDouble());
		
		session.setAttribute("name", sd);	
		session.setMaxInactiveInterval(1230);
		PrintWriter pw = response.getWriter();
		pw.println("<h2> Session was set to next value: <p> string value: " + sd.getStr() + "</p>" + 
				"<p> int value: " + sd.getVal() + "</p>" + "double value: " + sd.getKF() + "</p></h2>");
		
		
	}
	
}