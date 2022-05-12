package model;

public class Impresora {
	private static Impresora impresora = null;
	/*
	Se coloca una variable del mismo tipo que la clase llamada, por convención
	"instance". Aquí reside todo el secreto de este patrón, ya que es dicha variable
	la que se instancia por única vez y se devuelve al cliente.
	*/

	private String documento;

	private Impresora() {
		
	}
	/*
	Se privatiza el constructor para que no se pueda hacer un new Impresora()
	desde otro lugar que no sea dentro de la misma clase.
	*/

	public static Impresora getInstance() {
        if (impresora == null) {
            impresora = new Impresora();
        }
		return impresora;
	}
	/*
	Para utilizar la única instancia de la clase, los clientes deberán convocar
	al método getInstance(). Si observan la condición de if solo sera true
	la primera vez.
	*/
	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public void print() {
		System.out.println("Documento: "+documento);
		System.out.println("Imprimiendo...\n");
	}
}
