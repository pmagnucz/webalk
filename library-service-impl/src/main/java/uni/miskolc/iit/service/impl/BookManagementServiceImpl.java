package uni.miskolc.iit.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.miskolc.iit.dao.BookManagementDao;
import uni.miskolc.iit.dao.bean.FilterParameter;
import uni.miskolc.iit.service.BookManagementService;
import uni.miskolc.iit.service.beans.CreateBookInstanceRequest;
import uni.miskolc.iit.service.beans.GetBookRequest;
import uni.miskolc.iit.service.beans.GetFilteredBookListRequest;
import uni.miskolc.iit.webalk.model.Author;
import uni.miskolc.iit.webalk.model.Book;

import java.util.List;

/**
 * Created by pmagnucz on 2017. 05. 05..
 */
@Service
public class BookManagementServiceImpl implements BookManagementService {
    private BookManagementDao bookManagementDao;

    @Autowired
    public void setBookManagementDao(BookManagementDao bookManagementDao) {
        this.bookManagementDao = bookManagementDao;
    }

    @Override
    public Author addAuthor(String name) {
        return bookManagementDao.addAuthor(name);
    }

    @Override
    public Book addBook(CreateBookInstanceRequest request) {
        return bookManagementDao.addBook(request.getAuthor(), request.getTitle(), request.getReleaseDate());
    }

    @Override
    public Book getBookInstance(GetBookRequest request) {
        return bookManagementDao.getBookInstance(request.getAuthor(), request.getTitle(), request.getReleaseDate());
    }

    @Override
    public List<Book> getFilteredBookList(GetFilteredBookListRequest getFilteredBookListRequest) {
        FilterParameter filterParameter = new FilterParameter();
        BeanUtils.copyProperties(getFilteredBookListRequest, filterParameter);
        return bookManagementDao.getFilteredBookList(filterParameter);
    }
}
