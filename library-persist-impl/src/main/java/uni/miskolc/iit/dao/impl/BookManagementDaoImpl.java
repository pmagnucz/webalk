package uni.miskolc.iit.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uni.miskolc.iit.dao.BookManagementDao;
import uni.miskolc.iit.dao.bean.FilterParameter;
import uni.miskolc.iit.mapper.AuthorMapper;
import uni.miskolc.iit.mapper.BookMapper;
import uni.miskolc.iit.webalk.model.Author;
import uni.miskolc.iit.webalk.model.Book;

import java.util.Date;
import java.util.List;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
@Component
public class BookManagementDaoImpl implements BookManagementDao {
    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public Author addAuthor(String name) {
        Author author = new Author();
        author.setName(name);
        authorMapper.create(author);
        return author;
    }

    @Override
    public Book addBook(String authorName, String title, Date releaseDate) {
        Author author = authorMapper.findByName(authorName);
        if (author == null){
            Author newAuthor = new Author();
            newAuthor.setName(authorName);

            authorMapper.create(newAuthor);
        }
        Book book = new Book();
        book.setAuthor(author);
        book.setTitle(title);
        book.setReleaseDate(releaseDate);
        book.setAvailable(true);

        bookMapper.create(book);
        return book;
    }

    @Override
    public Book getBookInstance(String author, String title, Date releaseDate) {
        return bookMapper.findById(1L);
    }

    @Override
    public List<Book> getBookList() {
        List<Book> result = bookMapper.findAll();
        return result;
    }

    @Override
    public List<Book> getFilteredBookList(FilterParameter filterParameter) {
        List<Book> allBooks = bookMapper.findAll();
       if (filterParameter != null){
            // filter by author
            if (filterParameter.getAuthor() != null){
                for (Book book : allBooks){
                    if (!book.getAuthor().equals(filterParameter.getAuthor().getId())){
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
