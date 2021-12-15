package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Customer;

import java.util.List;

//Services uses interface to relate With the MODEL, Hence We need a INTERFACE CLASS for it
//HENCE, Service must implement all the method in the INTERFACE
//We choose this over normal concrete class Because, Whatever Changes occur here in any of the methodwill not affac

public interface CustomerRepository {
    Customer save(Customer customer);
    Customer findByCustomerId(String id);
    void delete(Customer customer);
    void delete(String id);
    List<Customer> findAll();
}
