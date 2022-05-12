package model;

public class OracleDB implements DBFactory{
    @Override
    public DBAdapter createDBConnection() {
        return new OracleDBAdapter("Oracle.user","Oracle.password","Oracle.host","Oracle.port","Oracle.db");
    }
}
