package org.example.service;

import org.example.model.Locations;

import java.util.List;
import java.util.UUID;

public interface LocationServices {


    Locations getLocationbyID(UUID id);

    public List<Locations> getAllLocations();
    public void getaddLocation();
    public void getupdateLocation();
    public void getdeleteLocation();
}
