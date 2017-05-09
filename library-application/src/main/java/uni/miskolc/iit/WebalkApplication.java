package uni.miskolc.iit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
@SpringBootApplication
@ComponentScan
public class WebalkApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebalkApplication.class, args);
    }
}
