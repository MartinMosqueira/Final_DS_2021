package main;

import model.Log;

public class Main {
    public static void main(String[] args){
        Log log1 = Log.get_instance();
        Log log2 = Log.get_instance();

        log1.setName("Martin Mosqueira");
        log2.setPassword("1234");

        log2.get_log_user();
    }
}
