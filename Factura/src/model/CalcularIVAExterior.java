package model;

public class CalcularIVAExterior implements FabricaCalcularIVA{
    @Override
    public Factura calculate_IVA(String name) {
        return new FacturaIVAComun();
    }
}
