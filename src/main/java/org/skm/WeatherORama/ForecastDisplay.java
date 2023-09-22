package org.skm.WeatherORama;

public class ForecastDisplay implements DisplayElement,Observer {

    private float temperature;
    private float humidity;
    private  WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("FORECAST:Temperature:"+temperature+"-Humidity:"+humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }
}
