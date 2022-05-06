package model;

public class OfferArroz extends ProductsVisitor{

    @Override
    public void visit_integral_gallo(IntegralGallo arroz) {
        System.out.println(arroz.toString());
        System.out.println("Se aplica descuento 3X2");
    }

    @Override
    public void visit_largoFino_gallo(LargoFinoGallo arroz) {
        System.out.println(arroz.toString());
        System.out.println("Se aplica descuento 20%");
    }

    @Override
    public void visit_mostachol_lucchetti(MostacholLucchetti fideos) {
        return;
    }

    @Override
    public void visit_tirabuzon_sanAgustin(TirabuzonSanAgustin fideos) {
        return;
    }
}
