package uni.miskolc.iit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uni.miskolc.iit.service.BookManagementService;
import uni.miskolc.iit.service.beans.AddAuthorRequest;
import uni.miskolc.iit.service.beans.CreateBookInstanceRequest;
import uni.miskolc.iit.service.beans.GetBookRequest;
import uni.miskolc.iit.service.beans.GetFilteredBookListRequest;
import uni.miskolc.iit.webalk.model.Author;
import uni.miskolc.iit.webalk.model.Book;

import java.util.Date;
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
    public ResponseEntity<List<Book>> listBooks() {
        return ResponseEntity.ok(bookManagementService.getBookList());
    }

    @PostMapping("/book")
    public ResponseEntity<Book> getBookInstance(@RequestBody GetBookRequest getBookRequest) {
        return ResponseEntity.ok(bookManagementService.getBookInstance(getBookRequest));
    }

    @PostMapping("/manage/book")
    public ResponseEntity<Book> addBookInstance(@RequestBody CreateBookInstanceRequest createBookInstanceRequest) {
        return ResponseEntity.ok(bookManagementService.addBook(createBookInstanceRequest));
    }

    @PostMapping("/manage/addAuthor")
    public ResponseEntity<Author> addAuthor(@RequestBody AddAuthorRequest addAuthorRequest) {
        return ResponseEntity.ok(bookManagementService.addAuthor(addAuthorRequest));
    }
}
