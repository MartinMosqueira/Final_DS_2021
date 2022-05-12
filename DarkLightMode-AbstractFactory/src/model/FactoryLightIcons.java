package model;

public class FactoryLightIcons implements IconsAbstractFactory {
    @Override
    public HomeButton createHomeButton() {
        return new HomeLight();
    }

    @Override
    public ContactButton createContactButton() {
        return new ContactLight();
    }
}
