

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
         // Set refresh time as 1 seconds
         response.setIntHeader("Refresh", 5);
 
         // Set response content type
         response.setContentType("text/html");
 
         // Get current time
         Calendar calendar = new GregorianCalendar();
         String am_pm;
         int hour = calendar.get(Calendar.HOUR);
         int minute = calendar.get(Calendar.MINUTE);
         int second = calendar.get(Calendar.SECOND);
         if(calendar.get(Calendar.AM_PM) == 0)
         {
              am_pm = "AM";
         }
         else
         {
              am_pm = "PM";
         }
         String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
     
         PrintWriter out = response.getWriter();
       
         out.println("<h1 align='center'>Auto Refresh Page</h1>");
         out.println("<h2 align='center'>Current time: "+CT+"</h2>");
    }
    // Handle POST method request.
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
         doGet(request, response);
    }

}
