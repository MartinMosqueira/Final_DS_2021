package model;

public class OracleDBAdapter extends DBAdapter{


    public OracleDBAdapter(String user, String password, String host, String port, String db) {
        super(user, password, host, port, db);
    }

    @Override
    public String getConnection() {
        /*String url = "jdbc:oracle:thin:@$"+getHost()+":$"+getPort()+":$"+getDb();*/
        String url = "jdbc:oracle:thin:@${host}:${port}:${db}"
                .replace("${host}", getHost()).replace("${port}", getPort()).replace("${db}", getDb());

        return "Url: "+url+"\n"+
                "user: "+getUser()+"\n"+
                "password: "+getPassword();
    }
}
