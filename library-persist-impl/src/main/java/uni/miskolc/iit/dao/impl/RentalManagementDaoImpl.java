package uni.miskolc.iit.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import uni.miskolc.iit.dao.RentalManagementDao;
import uni.miskolc.iit.repository.BookRepository;
import uni.miskolc.iit.repository.RentalRepository;
import uni.miskolc.iit.repository.UserRepository;
import uni.miskolc.iit.webalk.model.Book;
import uni.miskolc.iit.webalk.model.LendBookRequest;
import uni.miskolc.iit.webalk.model.LendBookResponse;
import uni.miskolc.iit.webalk.model.User;

import java.util.List;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
public class RentalManagementDaoImpl implements RentalManagementDao {
    private RentalRepository rentalRepository;
    private BookRepository bookRepository;
    private UserRepository userRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Autowired
    public void setRentalRepository(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<LendBookRequest> listLendBookRequests() {
        return rentalRepository.findAll();
    }

    @Override
    public LendBookResponse lendBook(Long userId, Long bookId) {
        Book book = bookRepository.findOne(bookId);
        User user = userRepository.findOne(userId);

        LendBookResponse lendBookResponse = new LendBookResponse();
        lendBookResponse.setBook(book);
        lendBookResponse.setUserId(userId);

        if (book.isAvailable()){
            book.setAvailable(false);
            book.setUser(user);
            lendBookResponse.setSuccess(true);

            LendBookRequest lendBookRequest = new LendBookRequest();
            lendBookRequest.setUser(user);
            lendBookRequest.setBook(book);
            rentalRepository.save(lendBookRequest);
        } else {
            lendBookResponse.setSuccess(false);
        }
        return lendBookResponse;
    }
}
