package model;

public class MySQLDBAdapter extends DBAdapter{

    public MySQLDBAdapter(String user, String password, String host, String port, String db) {
        super(user, password, host, port, db);
    }

    @Override
    public String getConnection() {
        String url = "jdbc:mysql://${host}:${port}/${db}?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC&useSSL=false;"
                .replace("${host}", getHost()).replace("${port}", getPort()).replace("${db}", getDb());

        return "Url: "+url+"\n"+
                "user: "+getUser()+"\n"+
                "password: "+getPassword();
    }
}
