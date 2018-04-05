import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

@SuppressWarnings("serial")


public class Orders extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        //String idStr = req.getParameter("id");
		 
		toClient.println("<html>");
		toClient.println("<head>");
		toClient.println("<title> Make your order  </title>");
		toClient.println("<link rel='stylesheet' href='Style.css'>");
		toClient.println("</head>");
		toClient.println("<body>");
		toClient.println("<a href='Inicio.html'>");
		toClient.println("<img class='index' src='unav.jpg' style='width:200px;height:100px;border:0'></a>");
		toClient.println("<p align='center'>");
		toClient.println("<div class='menu'><h1>TECNUNCAFE</h1></div></p>");
	    toClient.println("<div class='formulario'><FORM ethod='GET' action='NuevoUsuario'>");
		toClient.println("<P><INPUT type='text' placeholder='E-mail' name='email'></P>"):
	    toClient.println("<P><INPUT type='text' placeholder='Phone number' name='phonenumber'></P>");
		toClient.println("<P><INPUT type='text' placeholder='Date' name='date'></P>");
		toClient.println("<P><INPUT type='text' placeholder='Hour' name='hour'></P>");				
		toClient.println("<p align='center'>");
		toClient.println("<a href='Payment.html'><INPUT type='button' value='Pay with card'></a>");
		toClient.println("<a href='Confirmation.html'><INPUT type='button' value='Pay in cash'></a>");
		toClient.println("</p>");
		toClient.println("</FORM>");
		toClient.println("</div>");
		toClient.println("</body>");
		toClient.println("</html>");
		
	}



}



