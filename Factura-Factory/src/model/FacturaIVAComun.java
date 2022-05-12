package model;

public class FacturaIVAComun extends Factura{

    @Override
    public String get_factura_amount() {

        return "Final amount: "+getAmount()*1.27;
    }


}
