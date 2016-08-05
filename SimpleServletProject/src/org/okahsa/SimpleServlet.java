package org.okahsa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet example", urlPatterns = { "/SimpleServletPath" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    System.out.println("Hello from GET method");
	    PrintWriter out = response.getWriter();
	    response.setContentType("text/html");
	    String name = request.getParameter("UserName"); 
	    //response.getWriter().println("<h3>Hello in HTML</h3>");
	    out.println("From GET method .. Hello! " + name);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    System.out.println("Hello from GET method");
	    PrintWriter out = response.getWriter();
	    response.setContentType("text/html");
	    String userName = request.getParameter("UserName");
	    String fullName = request.getParameter("fullName");
	    String prof = request.getParameter("prof");
	    //String location = request.getParameter("location");
	    //response.getWriter().println("<h3>Hello in HTML</h3>");
	    out.println("Form Post Method .. Hello! " + userName + " \n" + fullName);
	    out.println("You are a " + prof);
	    String[] location = request.getParameterValues("location");
	    for (int i=0;i<location.length;++i)
	    	out.println("YOu are in " + location[i]);
	}

}
