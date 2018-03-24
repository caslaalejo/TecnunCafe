import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Pedido extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
			
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String primero = request.getParameter("primero");
		String segundo = request.getParameter("segundo");
		String bebida = request.getParameter("bebida");
		double precio=6.50;
		
		out.println("<html>");
		out.println("<head><title>Su pedido</title></head>");
        out.println("<body><p align=center>");
		out.println("<table border=0>");
		out.println("<tr><td><b>Primero: </b></td><td>"+primero+"</td></tr>");
		out.println("<tr><td><b>Segundo: </b></td><td>"+segundo+"</td></tr>");
		out.println("<tr><td><b>Bebida: </b></td><td>"+bebida+"</td></tr>");
		out.println("<tr><td><b>Precio: </b></td><td>"+precio+" euros</td></tr>");
		out.println("<form action=Pago method=get>");
		out.println("<input type=hidden name=precio value="+precio+">");
		out.println("<tr><td align=center><input type=submit value=Pedir></td></tr>");
		out.println("<tr><td align=center><a href=Inicio.html>Volver al inicio</a></td></tr>");
		out.println("</form>");
		out.println("</table>");
        out.println("</body>");
		out.println("</html>");
	}
}