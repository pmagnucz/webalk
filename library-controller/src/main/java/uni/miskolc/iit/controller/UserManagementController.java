package uni.miskolc.iit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uni.miskolc.iit.service.UserManagementService;
import uni.miskolc.iit.service.beans.UpdateUserDetailsRequest;
import uni.miskolc.iit.webalk.model.User;

/**
 * Created by pmagnucz on 2017. 05. 09..
 */
@RestController
public class UserManagementController {
    private UserManagementService userManagementService;

    @Autowired
    public void setUserManagementService(UserManagementService userManagementService) {
        this.userManagementService = userManagementService;
    }

    @PostMapping("/user/details")
    public ResponseEntity<User> updateUserDeatails(@RequestBody UpdateUserDetailsRequest updateUserDetailsRequest){
        return ResponseEntity.ok(userManagementService.updateUserDeatails(updateUserDetailsRequest));
    }

}
