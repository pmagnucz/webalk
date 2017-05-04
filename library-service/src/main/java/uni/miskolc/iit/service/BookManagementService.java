package uni.miskolc.iit.service;

import uni.miskolc.iit.service.beans.GetBookRequest;
import uni.miskolc.iit.service.beans.GetFilteredBookListRequest;
import uni.miskolc.iit.webalk.model.Book;

import java.util.List;

/**
 * Created by pmagnucz on 2017. 05. 03..
 */
public interface BookManagementService {

    /***
     * method: getBookInstance
     * param: GetBookRequest
     * return: Book
     * */
    Book getBookInstance(GetBookRequest getBookRequest);

    /***
     * method: getFilteredBookList
     * param: GetFilteredBookListRequest
     * return: List<Book>
     * */
    List<Book> getFilteredBookList(GetFilteredBookListRequest getFilteredBookListRequest);
}
