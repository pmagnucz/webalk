package uni.miskolc.iit.dao;

import uni.miskolc.iit.webalk.model.User;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
public interface UserManagementDao {
    User findUserByUsername(String username);

    User changeUserDetails(Long id, String username, String password, String firstName, String lastName, String email);
}
