package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    
    protected List<Observer> observers;

    public Observable() {
        observers = new ArrayList<>();
    }
    
    public abstract void addObserver(Observer observer);
    
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.changeModel();
        }
    }
    
}
