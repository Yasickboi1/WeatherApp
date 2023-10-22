package org.example.model;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
@Table(name="WeatherData")
public class WeatherData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Date;
    private double temperature;
    private double humidity;
    private double pressure;
    private double windspeed;
    private double winddirection;

    public WeatherData(int date, double temperature, double humidity, double pressure, double windspeed, double winddirection) {
        Date = date;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windspeed = windspeed;
        this.winddirection = winddirection;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(double windspeed) {
        this.windspeed = windspeed;
    }

    public double getWinddirection() {
        return winddirection;
    }

    public void setWinddirection(double winddirection) {
        this.winddirection = winddirection;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "Date=" + Date +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", windspeed=" + windspeed +
                ", winddirection=" + winddirection +
                '}';
    }
}
