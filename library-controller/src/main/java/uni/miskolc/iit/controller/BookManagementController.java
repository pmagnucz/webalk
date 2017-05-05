package uni.miskolc.iit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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
@RestController
public class BookManagementController {
    private BookManagementService bookManagementService;

    @Autowired
    public void setBookManagementService(BookManagementService bookManagementService) {
        this.bookManagementService = bookManagementService;
    }

    @GetMapping("/books")
    public List<Book> listBooks(){
        return bookManagementService.getFilteredBookList(new GetFilteredBookListRequest());
    }

    @GetMapping("/book")
    public Book getBookInstance(){
        return bookManagementService.getBookInstance(new GetBookRequest());
    }

    @PostMapping("/book")
    public Book addBookInstance(){
        return bookManagementService.addBook(new CreateBookInstanceRequest());
    }

    @PostMapping("/author")
    public Author addAuthor(@RequestBody String authorName){
        return bookManagementService.addAuthor(authorName);
    }
}
