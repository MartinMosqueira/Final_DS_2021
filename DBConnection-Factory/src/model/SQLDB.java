package model;

public class SQLDB implements DBFactory{
    @Override
    public DBAdapter createDBConnection() {
        return new SQLServerAdapter("SQLServer.user","SQLServer.password","SQLServer.host","SQLServer.port","SQLServer.db");
    }
}
