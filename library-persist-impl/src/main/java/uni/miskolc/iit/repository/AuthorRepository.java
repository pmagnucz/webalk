package uni.miskolc.iit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uni.miskolc.iit.webalk.model.Author;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author findAuthorByName(String name);
}
