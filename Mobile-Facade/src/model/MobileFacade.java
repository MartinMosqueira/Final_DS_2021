package model;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class MobileFacade {
    public Mobile on(){
        Battery battery = new Battery();
        battery.on();

        CPU cpu = new CPU();
        cpu.bootLoad();

        MobileService wifi = new WifiService();
        wifi.start();
        MobileService gps = new GpsService();
        gps.start();

        List<MobileService> mobileServices= Arrays.asList(wifi,gps);

        Mobile mobile = new Mobile(battery,cpu,mobileServices);
        return mobile;
    }

    public void off(Mobile mobile){
        for(MobileService service :mobile.getMobileServices()) {
            service.close();
        }
        mobile.getCpu().shutDown();
        mobile.getBattery().off();
    }
}
