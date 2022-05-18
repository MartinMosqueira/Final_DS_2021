package model;

public class Log {
    private static Log log=null;
    private String name;
    private String password;

    private Log() {
    }

    public static Log getLog() {
        return log;
    }

    public static void setLog(Log log) {
        Log.log = log;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Log get_instance(){
        if(log == null){
            log = new Log();
        }
        return log;
    }

    public static Log get_logout(){
        return log=null;
    }

    public void get_log_user(){
        System.out.println("successful login ...");
        System.out.println("User: "+getName()+"\n Password: ******");
    }
}
