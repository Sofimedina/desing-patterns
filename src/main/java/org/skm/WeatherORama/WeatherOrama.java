package org.skm.WeatherORama;

import org.skm.EnumPatterns;

public class WeatherOrama {
    public static void main(String[] args) {
        System.out.println("-------"+ EnumPatterns.PATTERN_OBSERVER+"--------");
        WeatherData weatherData=new WeatherData();
        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);
        ThirdPartyDisplay thirdPartyDisplay=new ThirdPartyDisplay(weatherData);
        StatisticDisplay statisticDisplay=new StatisticDisplay(weatherData);
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(5,3,9);
        weatherData.setMeasurements(0,0,0);
        weatherData.removeObserver(thirdPartyDisplay);
        weatherData.setMeasurements(1,2,3);
        weatherData.removeObserver(forecastDisplay);
        weatherData.removeObserver(statisticDisplay);
        weatherData.removeObserver(currentConditionDisplay);
        weatherData.setMeasurements(2,3,5);
    }
}
