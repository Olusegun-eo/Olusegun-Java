package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Bvn;
import africa.semicolon.bankingApplication.data.models.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRepositoryImplementTest {


private CustomerRepository customerRepository;


    @BeforeEach
    void setUp() {
        customerRepository = new CustomerRepositoryImplement();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save(){
        Customer customer = new Customer();
        Bvn bvn = new Bvn("388403284", customer);
        customer.setBvn(bvn.getId());
        customer.setFirstName("John");
        customer.setLastName("Glad");
        Customer savedCustomer = customerRepository.save(customer);
        assertEquals(customer, savedCustomer);
    }

    @Test
    void findByCustomerId(){
        Customer customer = new Customer();
        Bvn bvn = new Bvn("388403284", customer);
        customer.setBvn(bvn.getId());
        customer.setFirstName("Ojo");
        customer.setLastName("Glad");
        customerRepository.save(customer);

        Customer foundCustomer = customerRepository.findByCustomerId("388403284");
        assertEquals(customer, foundCustomer);
    }

    @Test
    void delete(){
        Customer customer = new Customer();
        Bvn bvn = new Bvn("388403284", customer);
        customer.setBvn(bvn.getId());
        customer.setFirstName("Ojo");
        customer.setLastName("Glad");
        customerRepository.save(customer);

        customerRepository.delete(customer);
//        assertEquals(customer, deletedCustomer);
        assertNull(customerRepository.findByCustomerId("388403284"));
    }

    @Test
    void testDelete(){
        Customer customer = new Customer();
        Bvn bvn = new Bvn("388403284", customer);
        customer.setBvn(bvn.getId());
        customer.setFirstName("Ojo");
        customer.setLastName("Glad");
        customerRepository.save(customer);
        assertNotNull(customerRepository.findByCustomerId("388403284"));

        customerRepository.delete("388403284");
        assertNull(customerRepository.findByCustomerId("388403284"));
    }

    @Test
    void findAll(){
        Customer customer = new Customer();
        Bvn bvn = new Bvn("388403284", customer);
        customer.setBvn(bvn.getId());
        customer.setFirstName("Ojo");
        customer.setLastName("Glad");
        customerRepository.save(customer);
        customerRepository.save(customer);
        customerRepository.save(customer);

        assertEquals(3, customerRepository.findAll().size());
    }

}