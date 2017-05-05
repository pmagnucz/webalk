package uni.miskolc.iit.webalk.model;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
public class LendBookResponse {
    private boolean success;
    private Long userId;
    private Book book;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
