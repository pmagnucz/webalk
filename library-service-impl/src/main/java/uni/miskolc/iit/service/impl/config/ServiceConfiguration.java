package uni.miskolc.iit.service.impl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uni.miskolc.iit.service.BookManagementService;
import uni.miskolc.iit.service.RentalManagementService;
import uni.miskolc.iit.service.UserManagementService;
import uni.miskolc.iit.service.impl.BookManagementServiceImpl;
import uni.miskolc.iit.service.impl.RentalManagementServiceImpl;
import uni.miskolc.iit.service.impl.UserManagementServiceImpl;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
@Configuration
public class ServiceConfiguration {

    @Bean
    public RentalManagementService rentalManagementService() {return  new RentalManagementServiceImpl();}

    @Bean
    public UserManagementService userManagementService() { return new UserManagementServiceImpl(); }

    @Bean
    public BookManagementService bookManagementService() { return  new BookManagementServiceImpl(); }
}
