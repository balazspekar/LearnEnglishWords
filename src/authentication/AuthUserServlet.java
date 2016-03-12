package authentication;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import administrators.Administrator;

public class AuthUserServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// Pointless to call this page with a GET request
		response.sendRedirect("index.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HashMap<String, String> allowedUsers = new Administrator().getAdmins();

		PrintWriter out = response.getWriter();

		String userName = request.getParameter("userName");
		String userPass = request.getParameter("userPass");

		if (allowedUsers.containsKey(userName) && allowedUsers.get(userName).equals(userPass))
		{
			HttpSession session = request.getSession();

			session.setAttribute("userName", userName);
			session.setAttribute("userPass", userPass);

		}
		else
		{
			response.sendRedirect("loginfailed.html");
		}
	}

}
