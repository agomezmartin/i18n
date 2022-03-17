import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  creo un OBJETO con el contenido de la clase LOCALE que me permite
		 *  establecer el idioma que vamos a usar
		 */
		Locale locale_it_IT = new Locale("it", "IT");
		ResourceBundle resourceBundle = ResourceBundle.getBundle("res.bundle", locale_it_IT);
		
		System.out.println(resourceBundle.getString("tryagain"));
		
	}

}
