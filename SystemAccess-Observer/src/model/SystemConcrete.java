package model;

import java.util.List;

public class SystemConcrete {
    private List<Observer> observers;

    public void addSystem(Observer o){
        this.observers.add(o);
    }
    public void deleteSystem(Observer o){
        this.observers.remove(o);
    }
    public void notifySystem(){
        for(Observer observer: observers){
            observer.update();
        }
    }

}
