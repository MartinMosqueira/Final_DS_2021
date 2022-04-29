package model;

public class Assembly {

    public Assembly(NavbarAbstractFactory navbar) {
        navbar.createHomeButton();
        navbar.createContactButton();
    }
}
