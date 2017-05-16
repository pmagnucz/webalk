package uni.miskolc.iit.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import uni.miskolc.iit.dao.UserManagementDao;
import uni.miskolc.iit.mapper.UserMapper;
import uni.miskolc.iit.webalk.model.User;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
public class UserManagementDaoImpl implements UserManagementDao {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    @Override
    public User changeUserDetails(Long id, String username, String password, String firstName, String lastName, String email) {
        User user = userMapper.findById(id);
        if (username != null && username.length() != 0){
            user.setUsername(username);
        }
        if (firstName != null && firstName.length() != 0){
            user.setFirstName(firstName);
        }
        if (lastName != null && lastName.length() != 0){
            user.setLastName(lastName);
        }
        if (email != null && email.length() != 0){
            user.setEmail(email);
        }
        if (password != null && password.length() != 0){
            user.setPassword(password);
        }

        userMapper.update(user);

        return user;
    }

}
