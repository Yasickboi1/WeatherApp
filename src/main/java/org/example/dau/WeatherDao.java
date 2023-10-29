package org.example.dau;

import org.example.model.Locations;
import org.example.model.WeatherData;

import java.util.List;
import java.util.UUID;

public interface WeatherDao {
    WeatherData findbyID (UUID i) ;
    List<WeatherData> findbylocation(Locations locations);
    void save (WeatherData weatherData);
    void update (WeatherData weatherData);
    void delete(WeatherData weatherData);
}
