package org.skm.WeatherORama;

public class StatisticDisplay implements DisplayElement,Observer {

    private float humidity;
    private  WeatherData weatherData;
    public StatisticDisplay(WeatherData weatherData) {
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("STATISTIC:Humidity:"+this.humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity=humidity;
        display();
    }
}
