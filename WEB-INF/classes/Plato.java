import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Plato extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
			
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String principal = request.getParameter("principal");
		String tipo= request.getParameter("tipo");
		String acomp = request.getParameter("acompanamiento");
		String mas= request.getParameter("mas");
		String salsa = request.getParameter("salsa");
		String postre=request.getParameter("postre");
		String bebida = request.getParameter("bebida");
		double precio=5.50;
		
		out.println("<html>");
		out.println("<head><title>Pedido</title></head>");
        out.println("<body><p align=center>");
		out.println("<table border=0>");
		out.println("<tr><td><b>Ingrediente principal: </b></td><td>"+principal+" "+tipo+"</td></tr>");
		out.println("<tr><td><b>Acompa&ntildeamiento: </b></td><td>"+acomp+" y "+mas+"</td></tr>");
		out.println("<tr><td><b>Salsa: </b></td><td>"+salsa+"</td></tr>");
		out.println("<tr><td><b>Postre: </b></td><td>"+postre+"</td></tr>");
		out.println("<tr><td><b>Bebida: </b></td><td>"+bebida+"</td></tr>");
		out.println("<tr><td><b>Precio: </b></td><td>"+precio+"euros</td></tr>");
		out.println("<form action=Pago method=get>");
		out.println("<input type=hidden name=precio value="+precio+">");
		out.println("<tr><td align=center><input type=submit value=Siguiente></td></tr>");
		out.println("<tr><td align=center><a href=Inicio.html>Volver al inicio</a></td></tr>");
		out.println("</form>");
		out.println("</table>");
        out.println("</body>");
		out.println("</html>");
	}
}