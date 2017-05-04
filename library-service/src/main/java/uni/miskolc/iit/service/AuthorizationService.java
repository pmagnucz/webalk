package uni.miskolc.iit.service;

import uni.miskolc.iit.service.beans.*;

/**
 * Created by pmagnucz on 2017. 05. 03..
 */
public interface AuthorizationService {

    /***
     * method: isAuhorized
     * param: AuthorizationRequest
     * return: boolean
     * */
    boolean isAuthorized(AuthorizationRequest authorizationRequest);

    /***
     * method: login
     * param: LoginRequest
     * return: LoginResponse
     * */
    LoginResponse login(LoginRequest loginRequest);

    /***
     * method: logout
     * param: LogoutRequest
     * return: LogoutResponse
     * */
    LogoutResponse logout(LogoutRequest logoutRequest);
}
