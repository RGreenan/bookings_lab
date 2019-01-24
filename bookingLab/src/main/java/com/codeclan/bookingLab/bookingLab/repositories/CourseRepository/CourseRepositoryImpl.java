package com.codeclan.bookingLab.bookingLab.repositories.CourseRepository;

import com.codeclan.bookingLab.bookingLab.models.Course;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseRepositoryImpl  implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> findCoursesWithCustomer(Long id) {
        List<Course> results = null;

        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Course.class);
            cr.createAlias("courseBookings", "bookingAlias");
            cr.add(Restrictions.eq("bookingAlias.customer.id", id));
            results = cr.list();

        }
        catch(HibernateException ex){
            ex.printStackTrace();
        }
        return results;
    }
}
