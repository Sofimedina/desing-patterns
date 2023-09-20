package org.skm.WeatherORama;

public interface Subject {
    void registerObserver();
    void removeObserver();
    void notifyObservers();
}
