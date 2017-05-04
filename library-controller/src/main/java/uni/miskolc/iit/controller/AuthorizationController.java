package uni.miskolc.iit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.miskolc.iit.service.AuthorizationService;
import uni.miskolc.iit.service.beans.LoginRequest;
import uni.miskolc.iit.service.beans.LoginResponse;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
@RestController
public class AuthorizationController {
        private AuthorizationService authorizationService;

        @Autowired
        public void setAuthorizationService(AuthorizationService authorizationService) {
            this.authorizationService = authorizationService;
        }

        @GetMapping("/login")
        public LoginResponse login(String userName, String password) {
            LoginRequest loginRequest = new LoginRequest();
            return authorizationService.login(loginRequest);
        }
}
