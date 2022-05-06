package model;

public class OfferFideos extends ProductsVisitor{
    @Override
    public void visit_integral_gallo(IntegralGallo arroz) {
        return;
    }

    @Override
    public void visit_largoFino_gallo(LargoFinoGallo arroz) {
        return;
    }

    @Override
    public void visit_mostachol_lucchetti(MostacholLucchetti fideos) {
        return;
    }

    @Override
    public void visit_tirabuzon_sanAgustin(TirabuzonSanAgustin fideos) {
        System.out.println(fideos.toString());
        System.out.println("Se aplica descuento 3X2");
    }
}
