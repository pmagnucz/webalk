package uni.miskolc.iit.service;

import uni.miskolc.iit.service.beans.CreateBookInstanceRequest;
import uni.miskolc.iit.service.beans.GetBookRequest;
import uni.miskolc.iit.service.beans.GetFilteredBookListRequest;
import uni.miskolc.iit.webalk.model.Author;
import uni.miskolc.iit.webalk.model.Book;

import java.util.List;

/**
 * Created by pmagnucz on 2017. 05. 03..
 */
public interface BookManagementService {

    Author addAuthor(String name);

    Book addBook(CreateBookInstanceRequest createBookInstanceRequest);

    Book getBookInstance(GetBookRequest getBookRequest);

    List<Book> getFilteredBookList(GetFilteredBookListRequest getFilteredBookListRequest);
}
