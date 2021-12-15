package africa.semicolon.bankingApplication.data.models;


import lombok.Data;

@Data
public class Bvn {
    private final String id;
    private final Customer customer;
}




/*
*  private CustomerRepository customerRepository;
    private Bvn bvn;
    private BvnRepository bvnRepository;
    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer();
        customerRepository = new CustomerRepositoryImplement();
        bvnRepository = new BvnRepositoryImplement();
        bvn = new Bvn("388403284", customer);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
        Customer customer = new Customer();
        customer.setBvn(bvn.getId());
        customer.setFirstName("John");
        customer.setLastName("Glad");
        Customer savedCustomerBvn = bvnRepository.save(customer);
        assertEquals(customer, savedCustomerBvn);
    }
* */