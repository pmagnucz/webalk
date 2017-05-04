package uni.miskolc.iit.service.impl;

import org.springframework.stereotype.Service;
import uni.miskolc.iit.service.AuthorizationService;
import uni.miskolc.iit.service.beans.*;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
@Service
public class AuthorizationServiceImpl implements AuthorizationService {
    @Override
    public boolean isAuthorized(AuthorizationRequest authorizationRequest) {
        if (authorizationRequest == null){
            return true;
        }
        return false;
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        return null;
    }

    @Override
    public LogoutResponse logout(LogoutRequest logoutRequest) {
        return null;
    }
}
