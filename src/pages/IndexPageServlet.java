package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class IndexPageServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession();

		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Learn English Words</title>");
		out.println("<link rel='stylesheet' type='text/css' href='style.css'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>Learn English Words / Login</h1>");
		out.println("<p>Please log in with your credentials.</p>");
		out.println("<div>");
		out.println("<form action='authenticate-user' method='POST'>");
		out.println("<input type='text' name='userName' value='peba'><br />");
		out.println("<br /> <input type='password' name='userPass' value='1111'><br />");
		out.println("<br /> <input type='submit' name='submit' value='Login'>");
		out.println("</form>");
		out.println("</div>");
		out.println("<p>A Practice Project by Balazs Pekar | Codecool Miskolc | 2016</p>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");

	}

}
