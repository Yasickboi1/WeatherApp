package org.example.service;


import org.example.dau.LocationDao;
import org.example.model.WeatherData;

import java.util.List;

public interface WeatherDataServices {

        public WeatherData getWeatherDatabyID();
        public List<WeatherData> getWeatherDataForLocation();
        public WeatherData getWeatherData();
        public WeatherData getupdateWeatherData();
        public WeatherData getdeleteWeatherData();
        }
