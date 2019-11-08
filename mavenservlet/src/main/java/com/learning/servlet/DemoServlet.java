package com.learning.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In GET Method");
		ServletConfig config = getServletConfig();
		String servletOwner = (String) config.getInitParameter("servlet-owner");
		System.out.println("servletOwner: "+ servletOwner);
		
		ServletContext context = getServletContext();
		String appOwner = context.getInitParameter("app-owner");
		System.out.println("appOwner: "+appOwner);
		
		req.setAttribute("servletOwner", servletOwner);
		req.setAttribute("appOwner", appOwner);
		
		req.getRequestDispatcher("demo.jsp").forward(req, resp);
	}		

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In POST Method");
		
		
		
	}
	

}
