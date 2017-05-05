package uni.miskolc.iit.service;

import uni.miskolc.iit.service.beans.UpdateUserDetailsRequest;
import uni.miskolc.iit.webalk.model.User;

/**
 * Created by pmagnucz on 2017. 05. 03..
 */
public interface UserManagementService {

    User updateUserDeatails(UpdateUserDetailsRequest updateUserDetailsRequest);

    User findUserByUsername(String username);
}
