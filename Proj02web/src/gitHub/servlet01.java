 package gitHub;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet01")
public class servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.print("<title>Hello,world2! </title>");
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("</body>");
		System.out.println("hahahahahaha");
		out.print("</body>");
		out.print("<h3>Hello,world! </h3>");
		out.print("</body>");

		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
