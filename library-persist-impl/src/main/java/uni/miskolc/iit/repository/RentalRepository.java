package uni.miskolc.iit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uni.miskolc.iit.webalk.model.LendBookRequest;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
public interface RentalRepository extends JpaRepository<LendBookRequest, Long> {
}
