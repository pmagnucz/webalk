package uni.miskolc.iit.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.util.AbstractUriTemplateHandler;
import uni.miskolc.iit.service.RentalManagementService;
import uni.miskolc.iit.service.beans.GetBookRequest;
import uni.miskolc.iit.service.beans.UpdateUserDetailsRequest;
import uni.miskolc.iit.webalk.model.Author;
import uni.miskolc.iit.webalk.model.Book;
import uni.miskolc.iit.webalk.model.LendBookRequest;
import uni.miskolc.iit.webalk.model.User;

import java.util.Date;

/**
 * Created by pmagnucz on 2017. 05. 11..
 */
public class RentManagementControllerTest {
    private RentalManagementService rentalManagementService;

    @Autowired
    public void setRentalManagementService(RentalManagementService rentalManagementService) {
        this.rentalManagementService = rentalManagementService;
    }

    @Test
    public void listLendBookRequests() throws Exception {
        UpdateUserDetailsRequest updateUserDetailsRequest = new UpdateUserDetailsRequest();
        updateUserDetailsRequest.setFirstName("First Name");
        updateUserDetailsRequest.setLastName("Last Name");
        updateUserDetailsRequest.setEmail("email");
        updateUserDetailsRequest.setUsername("user name");
        updateUserDetailsRequest.setPassword("password");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(updateUserDetailsRequest);

        System.out.println(json);
    }

    @Test
    public void lendBook() throws Exception {

    }

}