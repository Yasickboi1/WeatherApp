package org.example.dau;

import org.example.model.Locations;

import java.util.List;
import java.util.UUID;

public interface LocationDao {
    Locations  findByID (UUID id);
    List<Locations>findall();
    void save (Locations locations);
    void update (Locations locations);
    void delete(Locations locations);
}
