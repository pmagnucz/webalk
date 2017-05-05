package uni.miskolc.iit.service;

import uni.miskolc.iit.webalk.model.LendBookRequest;
import uni.miskolc.iit.webalk.model.LendBookResponse;

import java.util.List;

/**
 * Created by pmagnucz on 2017. 05. 03..
 */
public interface RentalManagementService {

    List<LendBookRequest> listLendBookRequests();

    LendBookResponse lendBook(LendBookRequest lendBookRequest);
}
