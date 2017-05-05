package uni.miskolc.iit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.miskolc.iit.dao.UserManagementDao;
import uni.miskolc.iit.service.UserManagementService;
import uni.miskolc.iit.service.beans.UpdateUserDetailsRequest;
import uni.miskolc.iit.webalk.model.User;

/**
 * Created by pmagnucz on 2017. 05. 05..
 */
public class UserManagementServiceImpl implements UserManagementService {
    private UserManagementDao userManagementDao;

    @Autowired
    public void setUserManagementDao(UserManagementDao userManagementDao) {
        this.userManagementDao = userManagementDao;
    }

    @Override
    public User updateUserDeatails(UpdateUserDetailsRequest updateUserDetailsRequest) {
        return userManagementDao.changeUserDetails(updateUserDetailsRequest.getId(),
                updateUserDetailsRequest.getUsername(), updateUserDetailsRequest.getPassword(),
                updateUserDetailsRequest.getFirstName(), updateUserDetailsRequest.getLastName(),
                updateUserDetailsRequest.getEmail());
    }

    @Override
    public User findUserByUsername(String username) {
        return userManagementDao.findUserByUsername(username);
    }
}
