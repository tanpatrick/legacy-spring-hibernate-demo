package demo.dao;

import demo.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<User> getUsers() {
        return getSession().createCriteria(User.class).list();
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
