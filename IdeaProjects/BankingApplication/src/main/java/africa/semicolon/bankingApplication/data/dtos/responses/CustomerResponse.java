package africa.semicolon.bankingApplication.data.dtos.responses;

import africa.semicolon.bankingApplication.data.models.Customer;
import lombok.Data;

//THIS IS A VIEW FOR THE CUSTOMER
@Data
public class CustomerResponse {
    private String firstName;
    private String lastName;
    private String bvn;
    private int numberOfAccounts;


    public CustomerResponse(Customer customer){
        firstName = customer.getFirstName();
        lastName = customer.getLastName();
        bvn = customer.getBvn();
        numberOfAccounts = customer.getAccounts().size();
    }
}
