package res;

import java.util.ListResourceBundle;

public class Bundle extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return new Object[][] {
			
			/* este tipo de CLASE PAQUETE permite las EXTRACCIÓN de contenido
			 * no solo de cadenas, sino de otros tipos de datos.
			 * CADENAS
			 * ARRAYS
			 * ETC.
			 */
			{"hello", "Hello"},
			{"welcome","Welcome to my app"},
			{"ok","OK"},
			{"cancel","Cancel"},
			{"tryagain","Please try again"},
			{"next", new int[] {1,4,5,7,5,3,7}},
			/* 
			 * A continuación un array de cadenas
			 */
			{"ourfeatures", new String [] {"Collaborative translation",
					"Localization Workflow Management",
					"Localization Process Automation"}}
			/*
			 * Probablemente desde el punto de vista de desarrollo de software, esta opción sea la más versátil,
			 * sin embargo, presenta retos a la hora de crear PARSERS que extraigan el contenido
			 * para traducir con herramientras de traducción.
			 */
			
			
		};
	}
}
