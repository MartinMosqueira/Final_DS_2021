import model.*;

public class Main {

    public static void main(String[] args) {
        NavbarAbstractFactory FactoryDarkIcons = new FactoryDarkIcons();
        Assembly assemblyDark = new Assembly(FactoryDarkIcons);

        NavbarAbstractFactory FactoryLightIcons = new FactoryLightIcons();
        Assembly assemblyLight = new Assembly(FactoryLightIcons);
    }
}