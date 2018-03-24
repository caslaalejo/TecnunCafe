public class PlatoHTML {
		public static String salidaHTML(String opciones) {
			String out="";
			out +="<html>";
			out +="<head><title>Su plato</title></head>";
			out +="<body><form action=Plato method=get><p align=center>";
			out +="<table border=0>";
			if (opciones.equals("tecnun")) {
				out +="<tr><td><h1>TECNUN</h1></td></tr>";
			} if (opciones.equals("aulario")) {
				out +="<tr><td><h1>AULARIO</h1></td></tr>";
			} if (opciones.equals("quimica")) {
				out +="<tr><td><h1>FACULTAD DE Q&IacuteMICA</h1></td></tr>";
			} if (opciones.equals("ade")) {
				out +="<tr><td><h1>FACILTAD DE EMPRESARIALES</h1></td></tr>";
			}			
			out +="<tr><td><b>Ingrediente principal:</b></td></tr>";
			out +="<tr><td><input type=radio name=principal value=Pollo>Pollo  ";
			out +="<select name=tipo>";
			out +="<option value=rebozado>Rebozado</option>";
			out +="<option value=asado>Asado</option>";
			out +="<option value=plancha>A la plancha</option></td></tr>";
			out +="<tr><td><input type=radio name=principal value=Carne>Carne  ";
			out +="<select name=tipo>";
			out +="<option value=rebozada>Rebozada</option>";
			out +="<option value=hamburguesa>Hamburguesa</option>";
			out +="<option value=plancha>A la plancha</option></td></tr>";
			out +="<tr><td><input type=radio name=principal value=Pescado>Pescado  ";
			out +="<select name=tipo>";
			out +="<option value=rebozado>Rebozado</option>";
			out +="<option value=horno>Al horno</option>";
			out +="<option value=plancha>A la plancha</option></td></tr>";
			out +="<tr><td><b>Acompa&ntildeamiento:</b></td></tr>";
			out +="<tr><td>Elija 1:</td></tr>";
			out +="<tr><td><input type=radio name=acompanamiento value=Verduras>Verduras</td></tr>";
			out +="<tr><td><input type=radio name=acompanamiento value=Patatas fritas>Patatas fritas</td></tr>";
			out +="<tr><td><input type=radio name=acompanamiento value=Patatas al horno>Patatas al horno</td></tr>";
			out +="<tr><td><input type=radio name=acompanamiento value=Ensalada>Ensalada</td></tr>";
			out +="<tr><td>Elija 1:</td></tr>";
			out +="<tr><td><input type=radio name=mas value=Revuelto de hongos>Revuelto de hongos</td></tr>";
			out +="<tr><td><input type=radio name=mas value=Arroz>Arroz</td></tr>";
			out +="<tr><td><input type=radio name=mas value=Pasta>Pasta</td></tr>";
			out +="<tr><td><input type=radio name=mas value=Huevos fritos>Huevos fritos</td></tr>";
			out +="<tr><td><input type=radio name=mas value=Croquetas>Croquetas</td></tr>";				
			out +="<tr><td><b>Salsa:</b></td></tr>";
			out +="<tr><td><input type=radio name=salsa value=Roquefort>Roquefort</td></tr>";
			out +="<tr><td><input type=radio name=salsa value=De hongos>De hongos</td></tr>";
			out +="<tr><td><input type=radio name=salsa value=Tomate>Tomate</td></tr>";
			out +="<tr><td><input type=radio name=salsa value=Sin salsa>Sin salsa</td></tr>";
			out +="<tr><td><b>Postre:</b></td></tr>";
			out +="<tr><td><input type=radio name=postre value=Fruta>Fruta del d&iacutea</td></tr>";
			out +="<tr><td><input type=radio name=postre value=Yogur>Yogur</td></tr>";
			out +="<tr><td><input type=radio name=postre value=Dulce>Pastel</td></tr>";
			out +="<tr><td><b>Bebida: </b></td></tr>";
			out +="<tr><td><input type=radio name=bebida value=Agua>Agua</td></tr>";
			out +="<tr><td><input type=radio name=bebida value=Refresco>Refresco</td></tr>";
			out +="<tr><td><input type=radio name=bebida value=Zumo>Zumo</td></tr>";
			out +="<tr><td><input type=submit name=Enviar></td><td><input type=reset name=limpiar value=Borrar selecci&oacuten></td></tr>";
			out +="<tr><td align=center><a href=Inicio.html>Volver al inicio</a></td></tr>";
			out +="</table></p></form></body></html>";
			return out;
		}
}