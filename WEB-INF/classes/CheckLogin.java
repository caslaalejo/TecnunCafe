//Erich Ibarrola Aycart
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

@SuppressWarnings("serial")
public class CheckLogin extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config); 
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
		res.setContentType("text/html");
		PrintWriter toClient = res.getWriter();
		
        String email = req.getParameter("emailogin");
		//System.out.println("El Email es:" + email);
        String passwordlogin = req.getParameter("passwordlogin");
        String confpasswordlogin = req.getParameter("confirmpasswordlogin");
		//System.out.println("Password:" + passwordlogin);
		//System.out.println("Conf Password:" + confpasswordlogin);

		if (passwordlogin.equals(confpasswordlogin)) {
			//System.out.println("Aqui 1");
			CheckLoginData userlogin= null;;
			try{
				userlogin = CheckLoginData.getLogin(connection, email);
				//System.out.println("Userlogin1 email:"+userlogin.emailLogin);
				//System.out.println("Userlogin1 password:"+userlogin.passwordLogin);
			}catch(NullPointerException e){
				userlogin= new CheckLoginData(" "," "," "," ");
				//System.out.println("Userlogin1 email:"+userlogin.emailLogin);
				//System.out.println("Userlogin1 password:"+userlogin.passwordLogin);
			}
			CheckLoginData userlogin2=new CheckLoginData(
					null,
					email,
					passwordlogin,
					null
					);
			//System.out.println("Userlogin2 email:"+userlogin2.emailLogin);
			//System.out.println("Userlogin2 password:"+userlogin2.passwordLogin);
			

				if (userlogin.emailLogin.equals(userlogin2.emailLogin) && userlogin.passwordLogin.equals(userlogin2.passwordLogin)) {
					//System.out.println("Aqui 2");
					HttpSession session = req.getSession(true);
					session.setAttribute("userId",userlogin.userId);
					
					//System.out.println(session.getAttribute("userId"));
					if(email.equals("admin@admin.com")){
							//System.out.println("Aqui 3");
							toClient.println("<head>");
							toClient.println("<title>Admin Log In</title>");
							toClient.println("<link rel='stylesheet' href='Style.css'>");
							toClient.println("</head>");
							toClient.println("<body>");
							toClient.println("<a href='Inicio.html'>");
							toClient.println("<img class='index' src='unav.jpg' style='width:200px;height:100px;border:0'></a>");
							toClient.println("<p align='center'>");
							toClient.println("<div class='menu'><h1>TECNUNCAFE</h1></div></p>");
							toClient.println("<p align='center'><div class='menu'><h1> Welcome. You´re logged in as an administrator. </h1></div></p>");
							//toClient.println("<a href='Inicio.html'><div class='image'></div></a>");
							toClient.println("<a href='InicioUsuario.html'><p style='font-size:30px;position:absolute;top:8px;right:30px;font-size:18px;padding:9px 10px;color:white;background-color:#92342b'>Go to administration index</p></a>");
							toClient.println("</body>");
							toClient.close();
					}else{
							//System.out.println("Aqui 4");
							toClient.println("<head>");
							toClient.println("<title>Check Log In</title>");
							toClient.println("<link rel='stylesheet' href='Style.css'>");
							toClient.println("</head>");
							toClient.println("<body>");
							toClient.println("<a href='Inicio.html'>");
							toClient.println("<img class='index' src='unav.jpg' style='width:200px;height:100px;border:0'></a>");
							toClient.println("<p align='center'>");
							toClient.println("<div class='menu'><h1>TECNUNCAFE</h1></div></p>");
							toClient.println("<p align='center'><div class='menu'><h1> CONGRATS! You are now logged in. </h1></div></p>");
							//toClient.println("<a href='Inicio.html'><div class='image'></div></a>");
							toClient.println("<a href='InicioUsuario.html'><p style='font-size:30px;position:absolute;top:8px;right:30px;font-size:18px;padding:9px 10px;color:white;background-color:#92342b'>Go to user page</p></a>");
							toClient.println("</body>");
							toClient.close();
					}		
				}else{
							//System.out.println("Aqui 5"); //aqui es cuando han sido metidos mal los datos por el usuario
							toClient.println("<head>");
							toClient.println("<title>Check Log In</title>");
							toClient.println("<link rel='stylesheet' href='Style.css'>");
							toClient.println("</head>");
							toClient.println("<body>");
							toClient.println("<a href='Inicio.html'>");
							toClient.println("<img class='index' src='unav.jpg' style='width:200px;height:100px;border:0'></a>");
							toClient.println("<p align='center'>");
							toClient.println("<div class='menu'><h1>TECNUNCAFE</h1></div></p>");
							toClient.println("<p align='center'><div class='menu'><h1> Oops! Something went wrong. </h1></div></p>");
							toClient.println("<p align='center' style='Color:white;width:100%;padding:12px20px;font-size:15px'>Looks like the values you put in were not correct.</p>");
							toClient.println("<p align='center' style='Color:white;width:100%;padding:12px20px;font-size:15px'>Are you sure you are already signed up? If not, click <a href='SignUp'>here</a></p>");
							//toClient.println("<a href='Inicio.html'><div class='image'></div></a>");
							toClient.println("<a href='LogIn'><p style='font-size:30px;position:absolute;top:8px;right:30px;font-size:18px;padding:9px 10px;color:white;background-color:#92342b'>Try to log in again</p></a>");
							toClient.println("</body>");
							toClient.close();
					
				}
		}else{
			//System.out.println("Something is wrong"); //aqui es cuando la confpassword no coincide con la password
							toClient.println("<head>");
							toClient.println("<title>Check Log In</title>");
							toClient.println("<link rel='stylesheet' href='Style.css'>");
							toClient.println("</head>");
							toClient.println("<body>");
							toClient.println("<a href='Inicio.html'>");
							toClient.println("<img class='index' src='unav.jpg' style='width:200px;height:100px;border:0'></a>");
							toClient.println("<p align='center'>");
							toClient.println("<div class='menu'><h1>TECNUNCAFE</h1></div></p>");
							toClient.println("<p align='center'><div class='menu'><h1> Oops! Something went wrong. </h1></div></p>");
							toClient.println("<p align='center' style='Color:white;width:100%;padding:12px20px;font-size:15px'>Looks like the passwords you put in were not correct.</p>");
							//toClient.println("<a href='Inicio.html'><div class='image'></div></a>");
							toClient.println("<a href='LogIn'><p style='font-size:30px;position:absolute;top:8px;right:30px;font-size:18px;padding:9px 10px;color:white;background-color:#92342b'>Try again</p></a>");
							toClient.println("</body>");
							toClient.close();
		}
    }
}