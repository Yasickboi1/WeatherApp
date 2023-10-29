package org.example.dau;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.example.model.Locations;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.UUID;


public class LocationDataImpli implements LocationDao{
    private SessionFactory sessionFactory;
    public LocationDataImpli(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    @Override
    public Locations findByID(UUID id) {

        Session session = sessionFactory.getCurrentSession();
        return session.get(Locations.class, id);
    }



    @Override
    public List<Locations> findall() {
       try (Session session=sessionFactory.openSession()){
           CriteriaBuilder builder= session.getCriteriaBuilder();
           CriteriaQuery<Locations>query = builder.createQuery(Locations.class);
           Root<Locations>root = query.from(Locations.class);
           query.select(root);
           Query<Locations> q = session.createQuery(query);
           return q.getResultList();
       }
    }
    /*try (Session session = sessionFactory.openSession()) {
        String hql = "FROM Location"; // Define the HQL query
        Query<Location> query = session.createQuery(hql, Location.class); // Create a query object
        return query.list(); // Execute the query and return the results
    }*/
    @Override
    public void save(Locations location) {
        Session session= sessionFactory.getCurrentSession();
        session.save(location);
    }
    @Override
    public void update(Locations location) {{
        Session session = sessionFactory.getCurrentSession();
        session.update(location);
    }
    }
    @Override
    public void delete(Locations location) {
        {
            Session session = sessionFactory.getCurrentSession();
            session.delete(location);
        }
    }
}