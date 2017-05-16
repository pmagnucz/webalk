package uni.miskolc.iit.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import uni.miskolc.iit.dao.RentalManagementDao;
import uni.miskolc.iit.mapper.AuthorMapper;
import uni.miskolc.iit.mapper.BookMapper;
import uni.miskolc.iit.mapper.RentalMapper;
import uni.miskolc.iit.webalk.model.*;

import java.util.List;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
public class RentalManagementDaoImpl implements RentalManagementDao {
    @Autowired
    private RentalMapper rentalMapper;

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public List<LendBookRequest> listLendBookRequests() {
        return rentalMapper.findAll();
    }

    @Override
    public LendBookResponse lendBook(LendBookRequest lendBookRequest) {
        Author author = authorMapper.findById(lendBookRequest.getBook().getAuthor().getId());
        Book book = bookMapper.find(author.getName(), lendBookRequest.getBook().getTitle(),
                lendBookRequest.getBook().getReleaseDate());
        User user = lendBookRequest.getUser();

        LendBookResponse lendBookResponse = new LendBookResponse();
        lendBookResponse.setBook(book);
        lendBookResponse.setUserId(user.getId());

        if (book.isAvailable()) {
            book.setAvailable(false);
            lendBookResponse.setSuccess(true);

            bookMapper.update(book);
            rentalMapper.create(lendBookRequest);
        } else {
            lendBookResponse.setSuccess(false);
        }
        return lendBookResponse;
    }
}
