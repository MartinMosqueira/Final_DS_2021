package model;

import java.util.List;

public abstract class ProductsVisitor {
    public abstract void visit_integral_gallo(IntegralGallo arroz);
    public abstract void visit_largoFino_gallo(LargoFinoGallo arroz);
    public abstract void visit_mostachol_lucchetti(MostacholLucchetti fideos);
    public abstract void visit_tirabuzon_sanAgustin(TirabuzonSanAgustin fideos);

    public void process(List<Products> products){
        for(Products product : products){
            product.accept(ProductsVisitor.this);
        }
    }
}
