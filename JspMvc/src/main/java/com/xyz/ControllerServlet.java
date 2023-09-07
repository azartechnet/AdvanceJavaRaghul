package com.xyz;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 resp.setContentType("text/html");
		 PrintWriter out=resp.getWriter();
		 
		 String name=req.getParameter("name");
		 String pass=req.getParameter("password");
		 
		  LoginBean bean=new LoginBean();
		  bean.setName(name);
		  bean.setPassword(pass);
		  
		  req.setAttribute("bean",bean);
		  
		  boolean status=bean.validate();
		  
		  if(status)
		  {
			  RequestDispatcher rd=req.getRequestDispatcher("login-success.jsp");
			  rd.forward(req, resp);
		  }
		  else
		  {
			  RequestDispatcher rd=req.getRequestDispatcher("login-error.jsp");
			  rd.include(req, resp);
		  }
		 
	}
	 @Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		    doPost(req, resp);
		}
}
