package org.example.service;

import org.example.dau.LocationDao;
import org.example.model.Locations;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.UUID;

import static org.example.util.HibernateUtil.sessionFactory;

public class LocationServicesImpli implements LocationServices {
    private LocationDao locationDao;


    @Override
    public Locations getLocationbyID(UUID id) {
        return locationDao.findByID(id);
    }


    @Override
    public List<Locations> getAllLocations() {
        return locationDao.findall();
    }

    @Override
    public  void getaddLocation() {

        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(locationDao);
            transaction.commit();
        } catch (Exception e) {
            if (transaction == null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }


    }

    @Override
    public  void getupdateLocation() {
        locationDao.update((Locations) locationDao);

    }

    @Override
    public void getdeleteLocation() {
        locationDao.delete((Locations) locationDao);

    }
}
