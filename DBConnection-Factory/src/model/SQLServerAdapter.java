package model;

public class SQLServerAdapter extends DBAdapter{

    public SQLServerAdapter(String user, String password, String host, String port, String db) {
        super(user, password, host, port, db);
    }

    @Override
    public String getConnection() {
        String url = "jdbc:sqlserver://${host}:${port};databaseName=${db};"
                .replace("${host}", getHost()).replace("${port}", getPort()).replace("${db}", getDb());

        return "Url: "+url+"\n"+
                "user: "+getUser()+"\n"+
                "password: "+getPassword();
    }
}
