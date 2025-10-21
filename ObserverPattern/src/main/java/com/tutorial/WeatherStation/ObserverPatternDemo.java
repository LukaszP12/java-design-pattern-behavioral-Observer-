package com.tutorial.WeatherStation;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer phone = new PhoneDisplay();
        Observer web = new WebDashboard();

        station.registerObserver(phone);
        station.registerObserver(web);

        station.setTemperature(25.5f);
        station.setTemperature(30.0f);
    }
}
