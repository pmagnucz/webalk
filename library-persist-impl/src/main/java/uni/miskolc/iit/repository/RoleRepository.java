package uni.miskolc.iit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uni.miskolc.iit.webalk.model.Role;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
