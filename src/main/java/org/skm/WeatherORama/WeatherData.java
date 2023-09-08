package org.skm.WeatherORama;


public class WeatherData {
     currentConditionDisplay currentConditionDisplay;
     statisticDisplay statisticDisplay;

     forecastDisplay forecastDisplay;

    public WeatherData() {
        this.currentConditionDisplay = new currentConditionDisplay();
        this.statisticDisplay = new statisticDisplay();
        this.forecastDisplay = new forecastDisplay();
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

        float temp=getTempeture();
        float humidity=getHumidity();
        float pressure=getPresure();

        this.currentConditionDisplay.update(temp,humidity,pressure);
        this.statisticDisplay.update(temp,humidity,pressure);
        this.forecastDisplay.update(temp,humidity,pressure);

    }
}
