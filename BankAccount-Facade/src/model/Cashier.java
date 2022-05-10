package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Cashier {
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int enter_quantity(){
        Random random = new Random();
        this.setQuantity(random.nextInt(10000));
        return this.getQuantity();
    }

    public boolean has_binance(int binance){
        if(binance>this.getQuantity()){
            return false;
        } else {
            return true;
        }
    }

    public int send_money(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Money to send: ");
        int money=scanner.nextInt();
        this.setQuantity(this.getQuantity()-money);
        return this.getQuantity();
    }

    public String print_ticket(){
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        return "-----TICKET-----\n" +
                "Operation: "+dateTime.format(LocalDateTime.now());
    }
}
