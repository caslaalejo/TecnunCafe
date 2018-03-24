public class PagoHTML {
	public static String salidaHTML(String precio) {
		String out="";
		out +="<html>";
		out +="<head><title>Datos</title></head>";
		out +="<body><form action=fin method=get>";
		out +="<p align=center><table border=0>";
		out +="<tr><td><h1>Sus datos: </h1></td></tr>";
		out +="<tr><td><b>*Nombre: </b></td><td><input type=text name=nombre required></td></tr>";
		out +="<tr><td><b>*Apellido: </b></td><td><input type=text name=apellido required></td></tr>";
		out +="<tr><td><b>*Estudiante de: </b></td><td><input type=text name=universidad required></td></tr>";
		out +="<tr><td><b>Comentarios: </b></td><td><input type=text name=comentarios size=30></td></tr>";
		out +="<tr><td><b>*Hora de recogida: </b><select name=hora>";
		out +="<option value=12>12:00h</option>";
		out +="<option value=12.30>12:30h</option>";
		out +="<option value=13>13:00h</option>";
		out +="<option value=13.30>13:30h</option>";
		out +="<option value=14>14:00h</option>";
		out +="<option value=14.30>14:30h</option>";
		out +="<option value=15>15:00h</option>";
		out +="<option value=15.30>15:30h</option></select></td></tr>";
		out +="<tr><td><b>N&uacutemero de bono: </b></td><td><input type=text name=numbono size=3></td></tr>";
		out +="<tr><td><input type=checkbox name=llevar><b>Para llevar </b></td></tr>";
		out +="<tr><td><b>Precio: </b>"+precio+" euros</td></tr>";
		out +="<tr><td><input type=submit value=Pedir><td><input type=reset name=limpiar value=Borrar todo></td></td></tr>";
		out +="<tr><td><a href=Inicio.html>Volver al inicio</a></td></tr>";
		out +="</table></p></form></body></html>";
		return out;
	}
}