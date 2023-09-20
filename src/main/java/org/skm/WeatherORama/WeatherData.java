package org.skm.WeatherORama;


public class WeatherData implements Subject {
     CurrentConditionDisplay currentConditionDisplay;
     StatisticDisplay statisticDisplay;
     ForecastDisplay forecastDisplay;

    public WeatherData() {
    }

    public float getTempeture(){
        return 0;
    }
    public float getHumidity(){
        return 0;
    }

    public float getPresure(){
        return 0;
    }

    public void measurementChanged(){

    }

    @Override
    public void registerObserver() {

    }

    @Override
    public void removeObserver() {

    }

    @Override
    public void notifyObservers() {

    }
}
