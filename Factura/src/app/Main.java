package app;

import model.CalcularIVANombre;

import model.Factura;

public class Main {
    public static void main(String[] args){
        try {
            Factura calcularIVA = new CalcularIVANombre().calculate_IVA("reducido 1");
            calcularIVA.setNumberClient(23225913);
            calcularIVA.setAmount(2700.98);
            System.out.println(calcularIVA.get_factura_amount());
        }catch (NullPointerException exception){
            System.out.println("name incorrect");
        }
    }
}
