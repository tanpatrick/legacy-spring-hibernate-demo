package demo.service;

import demo.dao.UserDao;
import demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = true)
    public List<User> getUsers() {
        return this.userDao.getUsers();
    }
}
