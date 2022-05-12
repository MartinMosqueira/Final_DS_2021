package app;

import model.OracleDB;

public class Main {

    public static void main(String[] args){
        //new Oracle connection
        OracleDB oracle = new OracleDB();
        System.out.println(oracle.createDBConnection().getConnection());

    }
}
