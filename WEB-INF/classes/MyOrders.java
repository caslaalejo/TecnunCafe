import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

@SuppressWarnings("serial")


public class MyOrders extends HttpServlet {
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
		toClient.println("<title> My account </title>");
		toClient.println("<link rel='stylesheet' href='Style.css'>");
		toClient.println("</head>");
		toClient.println("<body>");
		toClient.println("<div class='sign'><a href='Inicio.html'>Log Out</a></div>");
		toClient.println("<a href='InicioUsuario.html'>");
		toClient.println("<img class='index' src='unav.jpg' style='width:200px;height:100px;border:0'></a>");
		toClient.println("<p align='center'>");
		toClient.println("<div class='menu'><h1>My account</h1></div>");
	    toClient.println("<div class='sidenav'>");
	    toClient.println("<a href='MyInf.html'>My information</a>"):
	    toClient.println("<a href='MyOrders.html'>My orders</a>");
		toClient.println("<a href=`'MyVouchers.html'>My vouchers</a>");
		toClient.println("</div>");
		toClient.println("<div class='main'>");					
		toClient.println("<table class='d' style='margin: 10px auto 10px 260px; width:76%'>");
		toClient.println("<tr><th>Date</th>");
		toClient.println("<th>Order number</th>");
		toClient.println("<th>Voucher</th>");
		toClient.println("</tr>");
		toClient.println("<tr><td>01/03/2018</div></td>");
		toClient.println("<td>00001</div></td>");
		toClient.println("<td>No</div></td>");
		toClient.println("</tr>");
		toClient.println("</table>");
	    toClient.println("</div>");
		toClient.println("/p>");
		toClient.println("</form>");
		toClient.println("</body>");
		toClient.println("</html>");
		
		
		
		
}
