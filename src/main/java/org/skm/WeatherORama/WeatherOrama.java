package org.skm.WeatherORama;

public class WeatherOrama {

    WeatherData weatherData=new WeatherData();

    public void run(){
        weatherData.measurementChanged();
    }

}
