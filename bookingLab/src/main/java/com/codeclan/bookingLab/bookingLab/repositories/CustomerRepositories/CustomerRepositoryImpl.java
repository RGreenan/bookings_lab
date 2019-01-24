package com.codeclan.bookingLab.bookingLab.repositories.CustomerRepositories;

import com.codeclan.bookingLab.bookingLab.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findCustomersWithCourse(Long courseId){
        List<Customer> results = null;

        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("customerBookings", "bookingAlias");
            cr.add(Restrictions.eq("bookingAlias.course.id", courseId));
            results = cr.list();
        }
        catch(HibernateException ex){
            ex.printStackTrace();
        }
        return results;
    }

    @Transactional
    public List<Customer> findCustomersWithCourseAndTown(Long courseId, String town){
        List<Customer> results = null;

        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("customerBookings", "bookingAlias");
            cr.add(Restrictions.eq("bookingAlias.course.id", courseId));
            cr.add(Restrictions.ilike("town", town));
            results = cr.list();
        }
        catch(HibernateException ex){
            ex.printStackTrace();
        }
        return results;
    }

    @Transactional
    public List<Customer> findCustomersWithCourseAndTownAndOverAge(Long courseId, String town, int age){
        List<Customer> results = null;

        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("customerBookings", "bookingAlias");
            cr.add(Restrictions.eq("bookingAlias.course.id", courseId));
            cr.add(Restrictions.ilike("town", town));
            cr.add(Restrictions.ge("age", age));
            results = cr.list();
        }
        catch(HibernateException ex){
            ex.printStackTrace();
        }
        return results;
    }
}
