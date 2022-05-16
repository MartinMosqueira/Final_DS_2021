package model;

public class WifiService implements MobileService{
    @Override
    public void start() {
        System.out.println("Wifi service start");
    }

    @Override
    public void close() {
        System.out.println("Wifi service closed");
    }
}
