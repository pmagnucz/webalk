package uni.miskolc.iit.mapper;

import uni.miskolc.iit.webalk.model.LendBookRequest;
import uni.miskolc.iit.webalk.model.LendBookResponse;

import java.util.List;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
public interface RentalMapper {
    /**
     * Create a rent.
     * @param lendBookRequest
     * @return LendBookResponse
     * */
    void create(LendBookRequest lendBookRequest);

    /**
     * Delete a rent.
     * @param lendBookRequest
     * */
    void deleteById(LendBookRequest lendBookRequest);

    /**
     * Get all lendBookRequests
     * @return List<LendBookRequests>
     * */
    List<LendBookRequest> findAll();
}
