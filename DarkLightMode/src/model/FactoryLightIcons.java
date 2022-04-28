package model;

public class FactoryLightIcons implements NavbarAbstractFactory{
    @Override
    public HomeButton createHomeButton() {
        return new HomeLight();
    }

    @Override
    public ContactButton createContactButton() {
        return new ContactLight();
    }
}
