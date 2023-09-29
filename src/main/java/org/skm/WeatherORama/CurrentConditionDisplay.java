package org.skm.WeatherORama;

public class CurrentConditionDisplay implements Observer,DisplayElement {

    private float temperature;
    private  WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CURRENT CONDITION:"+this.temperature);

    }

    @Override
    public void update() {
        this.temperature= weatherData.getTemperature();
        display();
    }
}
