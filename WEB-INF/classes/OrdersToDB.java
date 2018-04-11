import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

@SuppressWarnings("serial")
public class OrdersToDB extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
		String date = req.getParameter("date");
		String time = req.getParameter("hour"); //estas cogiendo el valor de name del input en el formulario
		//int id=Integer.parseInt(req.getParameter("id"));
		int id=2;
		
        String sql="INSERT INTO Orders (Customer, Date, Time) values('" +id + "', '" +date + "', '" + time + "')";
		
		System.out.println("Order: "+sql);
		int n=0;
		try {
			Statement stm=connection.createStatement();
			
			n = stm.executeUpdate(sql);
		}catch (SQLException e){
			//System.out.println(sql);
			e.printStackTrace();			
		}
		//return n;
    }
}