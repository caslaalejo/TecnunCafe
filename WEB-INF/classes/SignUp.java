//Erich Ibarrola Aycart
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SignUp extends HttpServlet {


    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();

        toClient.println("<head>");
        toClient.println("<title>Sign Up</title>");
        toClient.println("<link rel='stylesheet' href='Style.css'>");
        toClient.println("</head>");
		toClient.println("<script>");
        toClient.println("function ShowPassword() {");
		toClient.println("var x = document.getElementById(\"x\");");
		toClient.println("var y = document.getElementById(\"y\");");
		toClient.println("if (x.type === \"password\" && y.type === \"password\") {");
        toClient.println("x.type = \"text\";");
        toClient.println("y.type = \"text\";");
		toClient.println("} else {");
        toClient.println("x.type = \"password\";");
        toClient.println("y.type = \"password\";");
		toClient.println("}");
		toClient.println("}");
        toClient.println("</script>");
        toClient.println("<body>");
        toClient.println("<a href='Inicio.html'>");
        toClient.println("<img class='index' src='unav.jpg' style='width:200px;height:100px;border:0'></a>");
        toClient.println("<p align='center'>");
        toClient.println("<div class='menu'><h1>TECNUNCAFE</h1></div></p>");
        toClient.println("<div class='formulario'><FORM method='GET' action='NewUser'>");
        toClient.println("<P><INPUT type='text' placeholder='Name' name='name'></P>");
        toClient.println("<P><INPUT type='text' placeholder='Surname' name='surname'></P>");
        toClient.println("<P><INPUT type='number' placeholder='Phone number' name='phonenumber'></P>");
        toClient.println("<P><INPUT type='text' placeholder='E-mail' name='email'></P>");
        toClient.println("<P><INPUT type='password' placeholder='Password' name='password' id='x'></P>");
        toClient.println("<P><INPUT type='password' placeholder='Confirm Password' name='confirmpassword' id='y'></P>");
        toClient.println("<P align='center' style='Color:white;width:100%;padding:12px20px;font-size:15px'><INPUT type='submit' value='Sign Up'><input type='checkbox' onclick='ShowPassword()'>Show Password</P>"); // igual esto habria que ponerlo en la forma que puso Amalia
        toClient.println("</FORM>");
        toClient.println("</div>");
        toClient.println("</body>");
        toClient.close();
    }
}