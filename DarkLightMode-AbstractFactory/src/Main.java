import model.*;

public class Main {

    public static void main(String[] args) {

        //NOTE Dark icons
        /*
        IconsAbstractFactory FactoryDarkIcons = new FactoryDarkIcons();
        Assembly assemblyDark = new Assembly(FactoryDarkIcons);
        */

        //NOTE Light icons
        IconsAbstractFactory FactoryLightIcons = new FactoryLightIcons();
        Assembly assemblyLight = new Assembly(FactoryLightIcons);
    }
}