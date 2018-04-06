//Erich Ibarrola Aycart
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

@SuppressWarnings("serial")
public class NewUser extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        NewUserData user = new NewUserData(
                    req.getParameter("name"),
                    req.getParameter("surname"),
                    Integer.parseInt(req.getParameter("phonenumber")),
                    req.getParameter("email"),
                    req.getParameter("password"),
                    req.getParameter("confirmpassword")
                );
        
		String emailSign=req.getParameter("email");
		String passwordSign=req.getParameter("password");
		String confpasswordSign=req.getParameter("confirmpassword");
		
		int n = NewUserData.registerUser(connection, user);
		
		if(passwordSign.equals(confpasswordSign)){		
		
    
		res.setContentType("text/html");
		PrintWriter toClient = res.getWriter();
					toClient.println("<head>");
					toClient.println("<title>You are signed up!</title>");
					toClient.println("<link rel='stylesheet' href='Style.css'>");
					toClient.println("</head>");
					toClient.println("<body>");
					toClient.println("<a href='Inicio.html'>");
					toClient.println("<img class='index' src='unav.jpg' style='width:200px;height:100px;border:0'></a>");
					toClient.println("<p align='center'>");
					toClient.println("<div class='menu'><h1>TECNUNCAFE</h1></div></p>");
					toClient.println("<p align='center'><div class='menu'><h1> CONGRATS! You are now succesfully signed up.</h1></div></p>");
					toClient.println("<a href='InicioUsuario.html'><p style='font-size:30px;position:absolute;top:8px;right:30px;font-size:18px;padding:9px 10px;color:white;background-color:#92342b'>Go to user page</p></a>");
					toClient.println("</body>");
					toClient.close();
		}else{// esto se da cuando password no coincide con confpassword
		
		int del = NewUserData.deleteUser(connection, user);
		
		res.setContentType("text/html");
		PrintWriter toClient = res.getWriter();
					toClient.println("<head>");
					toClient.println("<title>Oops</title>");
					toClient.println("<link rel='stylesheet' href='Style.css'>");
					toClient.println("</head>");
					toClient.println("<body>");
					toClient.println("<a href='Inicio.html'>");
					toClient.println("<img class='index' src='unav.jpg' style='width:200px;height:100px;border:0'></a>");
					toClient.println("<p align='center'>");
					toClient.println("<div class='menu'><h1>TECNUNCAFE</h1></div></p>");
					toClient.println("<p align='center'><div class='menu'><h1> Something went wrong! </h1></div></p>");
					toClient.println("<p align='center' style='Color:white;width:100%;padding:12px20px;font-size:15px'>Looks like the values you put in were not correct.</p>");
					toClient.println("<a href='SignUp'><p style='font-size:30px;position:absolute;top:8px;right:30px;font-size:18px;padding:9px 10px;color:white;background-color:#92342b'>Try again</p></a>");
					toClient.println("</body>");
					toClient.close();
		}
	}
}