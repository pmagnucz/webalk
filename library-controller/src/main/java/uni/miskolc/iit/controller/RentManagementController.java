package uni.miskolc.iit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uni.miskolc.iit.service.RentalManagementService;
import uni.miskolc.iit.webalk.model.Book;
import uni.miskolc.iit.webalk.model.LendBookRequest;
import uni.miskolc.iit.webalk.model.LendBookResponse;
import uni.miskolc.iit.webalk.model.User;

import java.util.List;

/**
 * Created by pmagnucz on 2017. 05. 09..
 */
@RestController
public class RentManagementController {
    private RentalManagementService rentalManagementService;

    @Autowired
    public void setRentalManagementService(RentalManagementService rentalManagementService) {
        this.rentalManagementService = rentalManagementService;
    }

    @GetMapping("/rents")
    public ResponseEntity<List<LendBookRequest>> listLendBookRequests(){
        return ResponseEntity.ok(rentalManagementService.listLendBookRequests());
    }

    @PostMapping("/rent")
    public ResponseEntity<LendBookResponse> lendBook(@RequestBody LendBookRequest lendBookRequest){
        return ResponseEntity.ok(rentalManagementService.lendBook(lendBookRequest));
    }

}
