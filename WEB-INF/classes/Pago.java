import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Pago extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String precio = request.getParameter("precio");
		System.out.println("precio: "+precio);
		String salida=PagoHTML.salidaHTML(precio);
		out.println(salida);
    }
}