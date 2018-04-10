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
		NewOrder order= new NewOrder(
				req.getParameter("name"),
				req.getParameter("number"),
				req.getParameter("ExpDate"),
				req.getParameter("cvv")
		);
		
		int n = NewOrder.Orderinsert(connection, order);
		
        PrintWriter toClient = res.getWriter();
		
   // del orders.html ................. VEO EL PAYMENT.HTML
   
		toClient.println("<html>");
		toClient.println("<head>");
		toClient.println("<title> Make your order  </title>");
		toClient.println("<link rel='stylesheet' href='Style.css'>");
		toClient.println("</head>");
		toClient.println("<body>");
		toClient.println("<a href='Inicio.html'>");
		toClient.println("<img class='index' src='unav.jpg' style='width:200px;height:100px;border:0'></a>");
		toClient.println("<p align='center'>");
		toClient.println("<div class='menu'><h1>An order</h1></div></p>");
	    toClient.println("<div class='formulario'><FORM method='GET' action=Orders>");
		toClient.println("<P><INPUT type='text' placeholder='Name' name='name'></P>"):
	    toClient.println("<P><INPUT type='text' placeholder='Number' name='number'></P>");
		toClient.println("<P><INPUT type='text' placeholder='Expiration Date' name='ExpDate'></P>");
		toClient.println("<P><INPUT type='text' placeholder='cvv' name='cvv'></P>");				
		toClient.println("<p align='center'>");
		toClient.println("<a href='Confirmation.html'><INPUT type='button' value='Make Order'></a>");
		toClient.println("</p>");
		toClient.println("</FORM>");
		toClient.println("</div>");
		toClient.println("</body>");
		toClient.println("</html>");
		
	}



}




