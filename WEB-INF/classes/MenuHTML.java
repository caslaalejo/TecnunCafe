public class MenuHTML {
	public static String salidaHTML(String opciones) {
		String out="";
		out +="<html><head><title>Men&uacute</title></head>";
		out +="<body><form action=Pedido method=get><p align=center>";
		out +="<table border=0>";
		if (opciones.equals("tecnun")) {
			out +="<tr><td><h1>TECNUN</h1></td><td><IMG src=http://www4.tecnun.es/asignaturas/Informat3/Apoyo_Clases/Ejemplos_HTML/tecnun.gif border=0></td></tr>";
			out +="<tr><td><b>Primeros:</b></td></tr>";
			out +="<tr><td><input type=radio name=primero value=Pasta>Pasta con salsa de champi&ntilde;ones</td></tr>";
			out +="<tr><td><input type=radio name=primero value=Arroz>Paella</td></tr>";
			out +="<tr><td><input type=radio name=primero value=Ensalada>Ensalada con pollo y cebolla pochada</td></tr>";
			out +="<tr><td><b>Segundos:</b></td></tr>";
			out +="<tr><td><input type=radio name=segundo value=Pescado>Merluza en salsa verde</td></tr>";
			out +="<tr><td><input type=radio name=segundo value=Carne>Filete con patatas</td></tr>";
			out +="<tr><td><input type=radio name=segundo value=Pollo>Pollo asado</td></tr>";
			out +="<tr><td><b>Postre:</b></td></tr>";
			out +="<tr><td><input type=radio name=postre value=Fruta>Fruta del d&iacutea</td></tr>";
			out +="<tr><td><input type=radio name=postre value=Yogur>Yogur</td></tr>";
			out +="<tr><td><input type=radio name=postre value=Dulce>Pastel</td></tr>";
			out +="<tr><td><b>Bebidas:</b></td></tr>";
			out +="<tr><td><input type=radio name=bebida value=Agua>Agua</td></tr>";
			out +="<tr><td><input type=radio name=bebida value=Refresco>Refresco</td></tr>";
			out +="<tr><td><input type=radio name=bebida value=Zumo>Zumo</td></tr>";	
		}
		if (opciones.equals("aulario")) {
			out +="<tr><td><h1>AULARIO</h1></td><td><IMG src=https://www.uik.eus/sites/all/themes/acc_foundation/favicon.ico border=0></td></tr>";
			out +="<tr><td><b>Primeros:</b></td></tr>";
			out +="<tr><td><input type=radio name=primero value=Pasta>Macarrones con tomate</td></tr>";
			out +="<tr><td><input type=radio name=primero value=Legumbres>Lentejas</td></tr>";
			out +="<tr><td><input type=radio name=primero value=Ensalada>Ensalada mixta</td></tr>";
			out +="<tr><td><b>Segundos:</b></td></tr>";
			out +="<tr><td><input type=radio name=segundo value=Pescado>Palitos de pescado</td></tr>";
			out +="<tr><td><input type=radio name=segundo value=Carne>Hamburguesas</td></tr>";
			out +="<tr><td><input type=radio name=segundo value=Pollo>Pechugas de pollo con patatas</td></tr>";
			out +="<tr><td><b>Postre:</b></td></tr>";
			out +="<tr><td><input type=radio name=postre value=Fruta>Fruta del d&iacutea</td></tr>";
			out +="<tr><td><input type=radio name=postre value=Yogur>Yogur</td></tr>";
			out +="<tr><td><input type=radio name=postre value=Dulce>Pastel</td></tr>";
			out +="<tr><td><b>Bebidas:</b></td></tr>";
			out +="<tr><td><input type=radio name=bebida value=Agua>Agua</td></tr>";
			out +="<tr><td><input type=radio name=bebida value=Refresco>Refresco</td></tr>";
			out +="<tr><td><input type=radio name=bebida value=Zumo>Zumo</td></tr>";	
		}
		if (opciones.equals("quimica")) {
			out +="<tr><td><h1>FACULTAD DE QU&IacuteMICA</h1></td></td><td><IMG src=https://image.freepik.com/iconos-gratis/instrumento-de-laboratorio-de-quimica_318-81176.jpg width=16 height=16 border=0></td></tr>";
			out +="<tr><td><b>Primeros:</b></td></tr>";
			out +="<tr><td><input type=radio name=primero value=Pasta>Espaguetis con salsa bolognesa</td></tr>";
			out +="<tr><td><input type=radio name=primero value=Legumbres>Alubias blancas</td></tr>";
			out +="<tr><td><input type=radio name=primero value=Ensalada>Ensalada de tomate y aguacate</td></tr>";
			out +="<tr><td><b>Segundos:</b></td></tr>";
			out +="<tr><td><input type=radio name=segundo value=Pescado>Chipirones en su tinta</td></tr>";
			out +="<tr><td><input type=radio name=segundo value=Carne>Redondo en salsa</td></tr>";
			out +="<tr><td><input type=radio name=segundo value=Pollo>Pollo empanado con pimientos</td></tr>";
			out +="<tr><td><b>Postre:</b></td></tr>";
			out +="<tr><td><input type=radio name=postre value=Fruta>Fruta del d&iacutea</td></tr>";
			out +="<tr><td><input type=radio name=postre value=Yogur>Yogur</td></tr>";
			out +="<tr><td><input type=radio name=postre value=Dulce>Pastel</td></tr>";
			out +="<tr><td><b>Bebidas:</b></td></tr>";
			out +="<tr><td><input type=radio name=bebida value=Agua>Agua</td></tr>";
			out +="<tr><td><input type=radio name=bebida value=Refresco>Refresco</td></tr>";
			out +="<tr><td><input type=radio name=bebida value=Zumo>Zumo</td></tr>";	
		}
		if (opciones.equals("ade")) {
			out +="<tr><td><h1>FACULTAD DE EMPRESARIALES</h1></td><td><IMG src=https://image.freepik.com/iconos-gratis/estadisticas-silueta_318-85090.jpg width=16 height=16></td></tr>";
			out +="<tr><td><b>Primeros:</b></td></tr>";
			out +="<tr><td><input type=radio name=primero value=Arroz>Arroz a la cubana</td></tr>";
			out +="<tr><td><input type=radio name=primero value=Legumbres>Lentejas</td></tr>";
			out +="<tr><td><input type=radio name=primero value=Ensalada>Ensalada mixta</td></tr>";
			out +="<tr><td><b>Segundos:</b></td></tr>";
			out +="<tr><td><input type=radio name=segundo value=Pescado>Salm&oacuten a la plancha</td></tr>";
			out +="<tr><td><input type=radio name=segundo value=Carne>San jacobo con patatas</td></tr>";
			out +="<tr><td><input type=radio name=segundo value=Pollo>Pechugas de pollo rellenas de queso</td></tr>";
			out +="<tr><td><b>Postre:</b></td></tr>";
			out +="<tr><td><input type=radio name=postre value=Fruta>Fruta del d&iacutea</td></tr>";
			out +="<tr><td><input type=radio name=postre value=Yogur>Yogur</td></tr>";
			out +="<tr><td><input type=radio name=postre value=Dulce>Pastel</td></tr>";
			out +="<tr><td><b>Bebidas:</b></td></tr>";
			out +="<tr><td><input type=radio name=bebida value=Agua>Agua</td></tr>";
			out +="<tr><td><input type=radio name=bebida value=Refresco>Refresco</td></tr>";
			out +="<tr><td><input type=radio name=bebida value=Zumo>Zumo</td></tr>";	
		}
		out +="<tr><td><input type=submit value=Enviar></td><td><input type=reset name=limpiar value=Borrar selecci&oacuten></td></tr>";
		out +="<tr><td><a href=Inicio.html>Volver al inicio</a></td></tr>";
		out +="</table></form></body></html>";		
		return out;
	}
}