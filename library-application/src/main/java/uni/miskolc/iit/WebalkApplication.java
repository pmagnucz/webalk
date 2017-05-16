package uni.miskolc.iit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
@SpringBootApplication
@ComponentScan
@MapperScan("uni.miskolc.iit.mapper")
public class WebalkApplication extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("borrower").password("password").roles("BORROWER")
                .and()
                .withUser("librarian").password("password").roles("LIBRARIAN");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/manage/**").hasRole("LIBRARIAN")
                .and().httpBasic().realmName("REALM").authenticationEntryPoint(new CustomBasicAuthenticationEntryPoint())
                .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

    public static void main(String[] args) {
        SpringApplication.run(WebalkApplication.class, args);
    }
}
