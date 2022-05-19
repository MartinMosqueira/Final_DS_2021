package model;

import java.util.ArrayList;
import java.util.List;

public class System {
    private List<Observer> observers = new ArrayList<Observer>();

    public void addSystem(Observer o){
        this.observers.add(o);
    }
    public void deleteSystem(Observer o){
        this.observers.remove(o);
    }
    public void notifySystem(){
        for(Observer observer: observers){
            observer.enter();
        }
    }

}
