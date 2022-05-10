package model;

public class FacadeCashier {
    private Authentication authentication;
    private Cashier cashier;
    private Account account;

    public FacadeCashier() {
        this.authentication = new Authentication();
        this.cashier = new Cashier();
        this.account = null;
    }


}
