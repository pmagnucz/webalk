package uni.miskolc.iit.webalk.model;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
public class LendBookRequest {
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
