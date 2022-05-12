/**
 * 
 */
package model;

import java.util.Date;

/**
 * @author martin
 *
 */
public class Logger {
	
	private static Logger log;
	
	private String nombre;
	
	private Logger() {
		
	}
	public static Logger getInstance() {
		if(log == null) {
			log = new Logger();
		}
		return log;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void inicio_sesion() {
		java.util.Date fecha = new Date();
		System.out.println("Inicio de sesion...");
		System.out.println(fecha);
		System.out.println("Usuario: "+this.nombre+"\n");
		
	}
}
