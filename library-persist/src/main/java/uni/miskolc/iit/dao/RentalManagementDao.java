package uni.miskolc.iit.dao;

import uni.miskolc.iit.webalk.model.LendBookRequest;
import uni.miskolc.iit.webalk.model.LendBookResponse;

import java.util.List;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
public interface RentalManagementDao {
    List<LendBookRequest> listLendBookRequests();

    LendBookResponse lendBook(Long userId, Long bookId);
}
