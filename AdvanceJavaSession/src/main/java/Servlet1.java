

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String u1=req.getParameter("uname");
		PrintWriter out=resp.getWriter();
		if(u1.equals("admin"))
		{
			HttpSession sess=req.getSession();
			sess.setAttribute("k1",u1);
			RequestDispatcher rd=req.getRequestDispatcher("Servlet2");
			rd.forward(req, resp);
		}
		else
		{
			out.println("LoginFail!!!");
		}
	}

}
