package uni.miskolc.iit.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uni.miskolc.iit.dao.BookManagementDao;
import uni.miskolc.iit.dao.bean.FilterParameter;
import uni.miskolc.iit.repository.AuthorRepository;
import uni.miskolc.iit.repository.BookRepository;
import uni.miskolc.iit.webalk.model.Author;
import uni.miskolc.iit.webalk.model.Book;

import java.util.Date;
import java.util.List;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
@Component
public class BookManagementDaoImpl implements BookManagementDao {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Autowired
    public void setAuthorRepository(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author addAuthor(String name) {
        Author author = new Author();
        author.setName(name);

        return authorRepository.save(author);
    }

    @Override
    public Book addBook(String authorName, String title, Date releaseDate) {
        Author author = authorRepository.findAuthorByName(authorName);
        if (author == null){
            Author newAuthor = new Author();
            newAuthor.setName(authorName);

            author = authorRepository.save(newAuthor);
        }
        Book book = new Book();
        book.setAuthor(author);
        book.setTitle(title);
        book.setReleaseDate(releaseDate);
        book.setAvailable(true);

        return bookRepository.save(book);
    }

    @Override
    public Book getBookInstance(String author, String title, Date releaseDate) {

        return null;//bookRepository.findOne(author, title, releaseDate);
    }

    @Override
    public List<Book> getFilteredBookList(FilterParameter filterParameter) {
        List<Book> allBooks = bookRepository.findAll();
       if (filterParameter != null){
            // filter by author
            if (filterParameter.getAuthor() != null){
                for (Book book : allBooks){
                    if (!book.getAuthor().equals(filterParameter.getAuthor())){
                        allBooks.remove(book);
                    }
                }
            }

            //filter by title
            if (filterParameter.getTitle() != null){
                for (Book book : allBooks){
                    if (!book.getTitle().equalsIgnoreCase(filterParameter.getTitle())){
                        allBooks.remove(book);
                    }
                }
            }
        }
        return allBooks;
    }
}
