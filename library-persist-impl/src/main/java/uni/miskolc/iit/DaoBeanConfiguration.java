package uni.miskolc.iit;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import uni.miskolc.iit.dao.BookManagementDao;
import uni.miskolc.iit.dao.RentalManagementDao;
import uni.miskolc.iit.dao.UserManagementDao;
import uni.miskolc.iit.dao.impl.BookManagementDaoImpl;
import uni.miskolc.iit.dao.impl.RentalManagementDaoImpl;
import uni.miskolc.iit.dao.impl.UserManagementDaoImpl;

/**
 * Created by pmagnucz on 2017. 05. 05..
 */
@Configuration
public class DaoBeanConfiguration {

    @Bean
    public BookManagementDao bookManagementDao(){return new BookManagementDaoImpl();}

    @Bean
    public RentalManagementDao rentalManagementDao(){return new RentalManagementDaoImpl();}

    @Bean
    public UserManagementDao userManagementDao(){return new UserManagementDaoImpl();}

}
