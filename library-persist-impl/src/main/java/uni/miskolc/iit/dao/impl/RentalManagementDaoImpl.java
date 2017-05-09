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

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Autowired
    public void setRentalRepository(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }

    @Override
    public List<LendBookRequest> listLendBookRequests() {
        return rentalRepository.findAll();
    }

    @Override
    public LendBookResponse lendBook(LendBookRequest lendBookRequest) {
        Book book = bookRepository.findOne(lendBookRequest.getBook().getId());//.getAuthor().getName(), lendBookRequest.getBook().getTitle(), lendBookRequest.getBook().getReleaseDate());
        User user = lendBookRequest.getUser();

        LendBookResponse lendBookResponse = new LendBookResponse();
        lendBookResponse.setBook(book);
        lendBookResponse.setUserId(user.getId());

        if (book.isAvailable()) {
            book.setAvailable(false);
            book.setUser(user.getId());
            lendBookResponse.setSuccess(true);

            rentalRepository.save(lendBookRequest);
        } else {
            lendBookResponse.setSuccess(false);
        }
        return lendBookResponse;
    }
}
