import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class PlatoServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String opciones = request.getParameter("opciones");
		System.out.println("eleccion: "+opciones);
		String salida=PlatoHTML.salidaHTML(opciones);
		out.println(salida);
    }
}