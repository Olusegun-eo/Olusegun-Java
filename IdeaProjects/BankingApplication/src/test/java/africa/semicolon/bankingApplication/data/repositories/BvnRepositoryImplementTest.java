package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Bvn;
import africa.semicolon.bankingApplication.data.models.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BvnRepositoryImplementTest {

    private BvnRepository bvnRepository;
     CustomerRepository customerRepository;


    @BeforeEach
    void setUp() {
        bvnRepository = new BvnRepositoryImplement();
        customerRepository = new CustomerRepositoryImplement();

    }

    @AfterEach
    void tearDown() {
    }



    @Test
    void save() {
        Customer customer = new Customer();
        Bvn bvn = new Bvn("388403284", customer);
        customer.setBvn(bvn.getId());
        customer.setFirstName("John");
        customer.setLastName("Glad");
        Bvn savedCustomerBvn = bvnRepository.save(bvn);
        assertEquals(customer, savedCustomerBvn);
    }


    @Test
    void findByCustomerId() {
    }

    @Test
    void delete() {
    }

    @Test
    void testDelete() {
    }

    @Test
    void findAll() {
    }

    @Test
    void testSave() {
    }

    @Test
    void testDelete1() {
    }
}