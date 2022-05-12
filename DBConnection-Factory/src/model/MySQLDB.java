package model;

public class MySQLDB implements DBFactory{
    @Override
    public DBAdapter createDBConnection() {
        return new MySQLDBAdapter("MySQL.user","MySQL.password","MySQL.host","MySQL.port","MySQL.db");
    }
}
