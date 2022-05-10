package app;

import model.FacadeCashier;

public class Main {
    public static void main(String[] args){
        FacadeCashier cashier = new FacadeCashier();
        cashier.enter_credentials();
        cashier.extract_money();
    }
}
