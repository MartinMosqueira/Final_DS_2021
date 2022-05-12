package model;

import java.util.Scanner;

public class CalcularIVANombre implements FabricaCalcularIVA {

    @Override
    public Factura calculate_IVA(String name) {
        if(name == "comun"){
            return new FacturaIVAComun();
        }
        else if (name == "reducido 1"){
            return new FacturaIVAReducido1();
        }
        else if (name == "reducido 2") {
            return new FacturaIVAReducido2();
        }

        return null;
    }
}
