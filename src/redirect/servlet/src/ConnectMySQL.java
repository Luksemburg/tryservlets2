package redirect.servlet.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConnectMySQL extends HttpServlet {
	private static final long serialVersionUID = 1000245L;

    public ConnectMySQL() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		try{
			String url = "jdbc:mysql://localhost/test?serverTimezone=Europe/Moscow&useSSL=false";
			String user = "root";
			String pass = "";
			
			try{
				Connection conn = DriverManager.getConnection(url, user, pass);
				pw.println("Connection to Database test succesfull");
			}catch(RuntimeException re){
				pw.println("Connection Failed(((");
				pw.println(re);
			}
			
		}catch(Exception e){
			pw.println("Connection to Database Failed...(");
			pw.println(e);
		}
		finally{
			pw.close();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
