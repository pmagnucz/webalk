package uni.miskolc.iit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uni.miskolc.iit.webalk.model.User;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
