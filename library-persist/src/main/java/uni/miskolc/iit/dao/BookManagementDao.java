package uni.miskolc.iit.dao;

import uni.miskolc.iit.dao.bean.FilterParameter;
import uni.miskolc.iit.webalk.model.Author;
import uni.miskolc.iit.webalk.model.Book;

import java.util.Date;
import java.util.List;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
public interface BookManagementDao {
    Author addAuthor(String name);

    Book addBook(String author, String title, Date releaseDate);

    Book getBookInstance(String author, String title, Date releaseDate);

    List<Book> getBookList();

    List<Book> getFilteredBookList(FilterParameter filterParameter);

}
