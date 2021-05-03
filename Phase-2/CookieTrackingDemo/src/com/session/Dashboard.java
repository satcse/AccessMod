package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dashboard
 */
@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dashboard() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie cookie = null;
		Cookie[] cookies = null;
		PrintWriter out = response.getWriter();
		boolean found=false;
		out.println("<html><body>");
		
		cookies = request.getCookies();
		if(cookies!=null)
		{
			for(int i=0;i< cookies.length;i++)
			{
				cookie = cookies[i];
				if(cookie.getName().contentEquals("userid") && cookie.getValue()!=null)
				{
					out.println("UserID read from Cookie: "+cookie.getValue() + "<br>");
					found= true;
				}
			}
		}
		
		if(!found)
		{
			out.println("No UserID was found in the cookie");
		}
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}