package org.example.model;

import javax.persistence.*;

@Entity
@Table(name="Locations")
public class Locations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double latitude;
    private double lognitude;
    private String region;
    private String country;


    public Locations(int id, double latitude, double lognitude, String region, String country) {
        this.id = id;
        this.latitude = latitude;
        this.lognitude = lognitude;
        this.region = region;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLognitude() {
        return lognitude;
    }

    public void setLognitude(double lognitude) {
        this.lognitude = lognitude;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
