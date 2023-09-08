package org.skm.WeatherORama;

interface DisplayActions {
    void update();

    void update(float temp, float humidity, float pressure);
}
