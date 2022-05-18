package app;

import model.Mobile;
import model.MobileFacade;

public class Main {
    public static void main(String[] args){
        MobileFacade mobileFacade = new MobileFacade();
        Mobile mobile = mobileFacade.on();

        System.out.println("----------------");

        mobileFacade.off(mobile);
    }
}
