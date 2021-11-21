package africa.semicolon.bankingApplication.services;

import africa.semicolon.bankingApplication.data.dtos.responses.CustomerResponse;
import africa.semicolon.bankingApplication.data.models.Customer;

import java.util.List;

public interface CustomerService {
   List<CustomerResponse> findAll();

   
}
