package model;

public class GpsService implements MobileService{
    @Override
    public void start() {
        System.out.println("Gps service start");
    }

    @Override
    public void close() {
        System.out.println("Gps service closed");
    }
}
