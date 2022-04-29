package model;

public class Assembly {

    public Assembly(IconsAbstractFactory navbar) {
        navbar.createHomeButton();
        navbar.createContactButton();
    }
}
