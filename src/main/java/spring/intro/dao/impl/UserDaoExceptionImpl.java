package spring.intro.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import spring.intro.dao.UserDao;
import spring.intro.model.User;

@Repository
public class UserDaoExceptionImpl implements UserDao {

    @Override
    public void add(User user) {
        throw new RuntimeException("New dao implementation");
    }

    @Override
    public List<User> listUsers() {
        throw new RuntimeException("New dao implementation");
    }
}
