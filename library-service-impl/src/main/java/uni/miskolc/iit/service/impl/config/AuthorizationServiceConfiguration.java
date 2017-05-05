package uni.miskolc.iit.service.impl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uni.miskolc.iit.dao.BookManagementDao;
import uni.miskolc.iit.service.AuthorizationService;
import uni.miskolc.iit.service.impl.AuthorizationServiceImpl;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
@Configuration
public class AuthorizationServiceConfiguration {

    @Bean
    public AuthorizationService authorizationService(){
        return new AuthorizationServiceImpl();
    }
}
