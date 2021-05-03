package com.inter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InterfaceDemo
 */
@WebServlet("/InterfaceDemo")
public class InterfaceDemo implements Servlet {
	
       
    
    public InterfaceDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

    ServletConfig config=null;
    public void init(ServletConfig config){
        this.config=config;
        System.out.println("Initialization complete");
     }

    public void service(ServletRequest req,ServletResponse res)
            throws IOException,ServletException{
                res.setContentType("text/html");
                PrintWriter pwriter=res.getWriter();
                pwriter.print("<html>");
                pwriter.print("<body>");
                pwriter.print("In the service() method<br>");
                pwriter.print("</body>");
                pwriter.print("</html>");
            }
            public void destroy(){
                System.out.println("In destroy() method");
            }
            public ServletConfig getServletConfig(){
                return config;
            }
            public String getServletInfo(){
                return "This is a sample servlet info";
            }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
