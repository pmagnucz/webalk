package uni.miskolc.iit.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import uni.miskolc.iit.webalk.model.Book;

import java.util.Date;
import java.util.List;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
public interface BookMapper {

    /**
     * Create a new Book instance.
     * @param book
     * @return Book
     * */
    void create(Book book);

    /**
     * Find Book by title.
     * @param title
     * @return Book
     * */
    Book findByTitle(String title);

    /**
     * Find Book by id.
     * @param id
     * @return Book
     * */
    Book findById(Long id);

    /**
     * Find Book by author, title, release date.
     * @param author
     * @param title
     * @param releaseDate
     * @return Book
     * */
    Book find(String author, String title, Date releaseDate);

    /**
     * Find all books.
     * @return List<Book>
     * */
    List<Book> findAll();

    /**
     * Update book details.
     * @param book
     * */
    void update(Book book);

    /**
     * Delete Book instance.
     * @param id
     * */
    void deleteById(Long id);
}
