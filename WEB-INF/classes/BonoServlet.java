import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BonoServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
			
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String com = request.getParameter("comidas");
		int comidas=Integer.parseInt(com);
		int num=0;
		int k=0;
		String bono="";
		String linea="";
		try {
		File file = new File("lista.txt");
		Scanner entrada = new Scanner(file);
		while (entrada.hasNextLine()) {
			linea=entrada.nextLine();
		}
		num=Integer.parseInt(linea);
		num=num+1;
		bono=Integer.toString(num);
		FileWriter escribir=new FileWriter(file,true);
		escribir.write("\n"+bono);
		escribir.close();
		out.println("<html>");
		out.println("<head><title>Su bono</title></head>");
		out.println("<body><p align=center>");
		out.println("<b>Su n&uacutemero de bono es: </b>"+bono+"<br><br>");
		out.println("<table border=1>");
		out.println("<tr>");
		for (int i=0;i<comidas;i++) {
			k=i+1;
			out.println("<td width=50 height=50 align=center> "+k+" </td>");
		}
		out.println("</tr>");
		out.println("</table>");
		out.println("<br><br><i>Imprima esta p&aacutegina y pres&eacutentela al recoger su pedido</i>");
		out.println("<br><br><a href=Inicio.html>Volver al inicio</a>");
		out.println("</p></body></html>");
		} catch(Exception e) {
		out.println("Error al escribir");
		}
	}
}