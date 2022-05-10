package model;

import java.util.Scanner;

public class Authentication {
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean read_card(){
        System.out.println("card successfully read");
        return true;
    }
    public String enter_key(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        this.setKey(scanner.next());
        return getKey();
    }
    public boolean check_key(String newKey){
        if(newKey == getKey()){
            return true;
        }
        else {
            return false;
        }
    }
    public Account get_account(){
        return new Account();
    }
    public void fail(){
        System.out.println("Fail authentication transaction");
    }

}
