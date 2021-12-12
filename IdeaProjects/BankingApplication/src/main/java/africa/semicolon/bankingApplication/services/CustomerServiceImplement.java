package africa.semicolon.bankingApplication.services;

import africa.semicolon.bankingApplication.data.dtos.responses.CustomerResponse;
import africa.semicolon.bankingApplication.data.models.Customer;
import africa.semicolon.bankingApplication.data.repositories.CustomerRepository;
import africa.semicolon.bankingApplication.data.repositories.CustomerRepositoryImplement;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImplement implements CustomerService{
    private final CustomerRepository customerRepository = new CustomerRepositoryImplement();

    @Override
    public List<CustomerResponse> findAll() {
        List<CustomerResponse> responses = new ArrayList<CustomerResponse>();
        List<Customer> ourRealCustomers = customerRepository.findAll();
        for (Customer customer : ourRealCustomers){
            CustomerResponse customerResponse = new CustomerResponse(); //for everyLoop create a customer Response
//            customerResponse.setFirstName(customer.getFirstName());
//            customerResponse.setLastName(customer.getLastName());
//            customerResponse.setBvn(customer.getBvn());
//            customerResponse.setNumberOfAccounts(customer.getAccounts().size());
            responses.add(new CustomerResponse(customer));

        }
        return responses;
    }

}
