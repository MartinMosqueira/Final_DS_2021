package model;

public class FacturaIVAReducido1 extends Factura{

    @Override
    public String get_factura_amount() {
        return "Final amount: "+getAmount()*1.21;
    }
}
