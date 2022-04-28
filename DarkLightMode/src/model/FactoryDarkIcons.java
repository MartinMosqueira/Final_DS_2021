package model;

public class FactoryDarkIcons implements NavbarAbstractFactory{
    @Override
    public HomeButton createHomeButton() {
        return new HomeDark();
    }

    @Override
    public ContactButton createContactButton() {
        return new ContactDark();
    }
}
