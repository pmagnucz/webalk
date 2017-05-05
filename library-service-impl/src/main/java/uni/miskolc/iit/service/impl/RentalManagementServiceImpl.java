package uni.miskolc.iit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.miskolc.iit.dao.RentalManagementDao;
import uni.miskolc.iit.service.RentalManagementService;
import uni.miskolc.iit.webalk.model.LendBookRequest;
import uni.miskolc.iit.webalk.model.LendBookResponse;

import java.util.List;

/**
 * Created by pmagnucz on 2017. 05. 05..
 */

public class RentalManagementServiceImpl implements RentalManagementService {
    private RentalManagementDao rentalManagementDao;

    @Autowired
    public void setRentalManagementDao(RentalManagementDao rentalManagementDao) {
        this.rentalManagementDao = rentalManagementDao;
    }

    @Override
    public List<LendBookRequest> listLendBookRequests() {
        return rentalManagementDao.listLendBookRequests();
    }

    @Override
    public LendBookResponse lendBook(LendBookRequest lendBookRequest) {
        return rentalManagementDao.lendBook(lendBookRequest);
    }
}
