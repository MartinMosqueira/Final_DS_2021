package model;

public abstract class DBAdapter {
    private String user;
    private String password;
    private String host;
    private String port;
    private String db;

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public String getDb() {
        return db;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public DBAdapter(String user, String password, String host, String port, String db) {
        setUser(user);
        setPassword(password);
        setHost(host);
        setPort(port);
        setDb(db);
    }

    public abstract String getConnection();
}
