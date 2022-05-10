package model;

import java.util.Random;

public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double check_balance_available(){
        System.out.println("check balance available ...");
        Random random = new Random();
        this.setBalance(random.nextDouble(10000));
        return getBalance();
    }
    public boolean block_account(){
        return false;
    }
    public boolean unlock_account(){
        return true;
    }
    public void extract_balance(int balance){
        if(balance>this.getBalance()){
            System.out.println("quantity not available");
        }
        else {
            this.setBalance(this.getBalance()-balance);
            System.out.println("successful extraction");
        }
    }

    public boolean update_account(){
        System.out.println("account successfully update");
        return true;
    }

    public void fail(){
        System.out.println("Fail account transaction");
    }

}
