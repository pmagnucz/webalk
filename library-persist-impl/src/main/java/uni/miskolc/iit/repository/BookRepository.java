package uni.miskolc.iit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uni.miskolc.iit.webalk.model.Book;

import java.util.Date;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findOne(String author, String title, Date releaseDate);
}
