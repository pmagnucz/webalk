package uni.miskolc.iit.webalk.model;

import javax.persistence.*;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
@Entity
@Table(name = "lend_requests")
public class LendBookRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private User userId;
    private Book bookId;

    public User getUser() {
        return userId;
    }

    public void setUser(User userId) {
        this.userId = userId;
    }

    public Book getBook() {
        return bookId;
    }

    public void setBook(Book bookId) {
        this.bookId = bookId;
    }
}
