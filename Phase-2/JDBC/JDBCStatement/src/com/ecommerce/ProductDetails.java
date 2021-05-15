package com.ecommerce;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductDetails
 */
@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			PrintWriter out = response.getWriter();
            out.println("<html><body>");

            InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
            Properties props = new Properties();
            props.load(in);
            
            DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"),props.getProperty("password"));
            out.println("DB Connection initialized.<br>");
            
            Statement stmt = conn.getConnection().createStatement();
            
            stmt.executeUpdate("create database mydatabase");
            out.println("Created database: mydatabase successfully <br>");
            
            stmt.executeUpdate("use mydatabase");
            out.println("Selected mydatabase <br>");
            
            ResultSet rst = stmt.executeQuery("show databases");
            
            while(rst.next())
            {
            	out.println("===>" + rst.getString("Database") + "<br>");
            }
            
            stmt.executeUpdate("drop database mydatabase");
            stmt.close();
            out.println("Dropped database: mydatabase <br>");
            
            //Program 1 
            /*Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            
            stmt.executeUpdate("insert into eproductnew(name,price,date_added) values('Sterilizer', 90000.00, now())");
            
            ResultSet rst = stmt.executeQuery("select * from eproductnew");
            
            while(rst.next())
            {
            	out.println(rst.getInt("ID") + "," + rst.getString("name") + "<br>");
            }
            
            //Program 2 - Code for Stored Procedure Invocation with Dynamic Parameters
            CallableStatement clStmt = conn.getConnection().prepareCall("{call add_productnew(?,?)}");
            
            clStmt.setString(1, "LENOVO");
            clStmt.setBigDecimal(2, new BigDecimal(25642.25));
            clStmt.executeUpdate();
            
            //stmt.close();
            clStmt.close();*/
            
            out.println("</body></html>");
            conn.closeConnection();
		}catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
