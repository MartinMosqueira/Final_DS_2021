package app;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Products> products = new ArrayList<>();

        products.add(new IntegralGallo());
        products.add(new LargoFinoGallo());
        products.add(new MostacholLucchetti());
        products.add(new TirabuzonSanAgustin());

        //OfferArroz offerArroz = new OfferArroz();
        //offerArroz.process(products);

        OfferFideos offerFideos = new OfferFideos();
        offerFideos.process(products);
    }
}
