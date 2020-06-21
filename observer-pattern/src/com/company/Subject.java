package com.company;

import java.util.ArrayList;
import java.util.List;

// Subject is also called Observable.
public class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(var observer : observers) {
            observer.update();
        }
    }

 }
