package app;

import model.Impresora;

public class Main {

	public static void main(String[] args) {
		//Impresora impresora1 = new Impresora();
		/*
		Asi no, recordemos que privatizamos el constructor y
		ya no es posible instanciar la clase de esta manera.
		De esta forma nos aseguramos que se instance 1 sola vez llamando
		al método getInstance().
		*/

		Impresora impresora1 = Impresora.getInstance();
		Impresora impresora2 = Impresora.getInstance();

		impresora1.setDocumento("Montañas.pdf");
		impresora2.print();
		/*
		si cambiamos el valor de la variable documento de la clase, nos
		vamos a encontrar que se cambia en ambas clases ya que son la misma
		clase, de esa forma solo puede haber una sola instancia.
		*/
	}

}
