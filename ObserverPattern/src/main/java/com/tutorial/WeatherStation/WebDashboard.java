package com.tutorial.WeatherStation;

public class WebDashboard implements Observer{
    @Override
    public void update(float temperature) {
        System.out.println("Web Dashboard: Temperature updated to " + temperature + "°C");
    }
}
