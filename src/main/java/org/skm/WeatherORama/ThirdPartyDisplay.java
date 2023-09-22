package org.skm.WeatherORama;


public class ThirdPartyDisplay implements Observer, DisplayElement {
    private float pressure;
    private  WeatherData weatherData;

    public ThirdPartyDisplay(WeatherData weatherData) {
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("THIRD PARTY D:Pressure:"+this.pressure);
    }


    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure=pressure;
        display();
    }
}
