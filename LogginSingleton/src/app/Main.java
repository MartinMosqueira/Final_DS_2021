/**
 * 
 */
package app;

import model.Logger;

/**
 * @author martin
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Logger log1 = Logger.getInstance();
		Logger log2 = Logger.getInstance();
		
		log1.setNombre("Martin");
		log1.inicio_sesion();
		log2.inicio_sesion();
		
	}

}
