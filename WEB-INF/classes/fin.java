import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class fin extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String uni = request.getParameter("universidad");
		String comentarios = request.getParameter("comentarios");
		String bono = request.getParameter("numbono");
		String hora = request.getParameter("hora");
		int existe=0;
		int num=0;
		String b="";
		String ped="";
		String pedido="";
		out.println("<html>");
		out.println("<head><title>Su pedido</title></head>");
		out.println("<body><p align=center><table border=0>");
		try {
		File file = new File("lista.txt");
		Scanner entrada = new Scanner(file);
		while (entrada.hasNextLine()) {
			b=entrada.nextLine();
			if (bono.equals(b)) {
				existe=1;
			}
		}
		} catch(Exception e) {
				out.println("Error al leer");
			}
		if (existe==1) {
			try {
				File arch = new File("pedidos.txt");
				Scanner in = new Scanner(arch);
				while (in.hasNextLine()) {
					pedido=in.nextLine();
				}
				num=Integer.parseInt(pedido);
				num=num+1;
				ped=Integer.toString(num);
				
				FileWriter escr=new FileWriter(arch,true);
				escr.write("\n"+ped);
				escr.close();
				} catch(Exception e) {
				out.println("Error al escribir");
				}
				out.println("<tr><td><h1>PEDIDO REALIZADO</h1></td></tr>");
				out.println("<tr><td><b>Nombre y apellidos: </b>"+nombre+" "+apellido+"</td></tr>");
				out.println("<tr><td><b>N&uacutemero de pedido: </b>"+ped+"</td></tr>");
				out.println("<tr><td>Ense&ntildear en la cafeter&iacutea junto con el carnet universitario o DNI para recoger.</td></tr>");
		} else {
			out.println("<tr><td><b>No se ha encontrado su n&uacutemero de bono</b></td></tr>");
			}
		out.println("<tr><td align=center><a href=Inicio.html>Volver al inicio</a></td></tr>");
		out.println("</table></p></body></html>");
    }
}