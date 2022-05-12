package model;

public class FacturaIVAReducido2 extends Factura{

    @Override
    public String get_factura_amount() {
        return "Final amount: "+getAmount()*10.5;
    }
}
