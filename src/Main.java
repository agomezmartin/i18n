import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  creo un OBJETO con el contenido de la clase LOCALE que me permite
		 *  establecer el CÓDIGO del idioma que vamos a usar
		 */
		Locale locale = new Locale("");		
		Locale locale_es_ES = new Locale("es", "ES");		
		Locale locale_it_IT = new Locale("it", "IT");		
		
		/*
		 * Con resourceBundle se selecciona el archivo PROPERTIES + código de idioma
		 */
		ResourceBundle resourceBundle = ResourceBundle.getBundle("res.bundle", locale_it_IT);

		/*
		 * imprime por pantalla el contenido usando las llaves		
		 */

		System.out.println(resourceBundle.getString("tryagain"));
		
	}

}
