package africa.semicolon.bankingApplication.services;

import africa.semicolon.bankingApplication.data.dtos.requests.CreateAccountRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankServiceImplementTest {
    BankService bankService;


    @BeforeEach
    void setUp() {
        bankService = new BankServiceImplement();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createBank() {
        String gtCold = bankService.createBank("GTCO");
        CreateAccountRequest createAccountRequest = new CreateAccountRequest();
        assertEquals("01", gtCold);
    }

    @Test
    void createBankTwo() {
        String gtCold = bankService.createBank("GTCO");
        String firstBank = bankService.createBank("FIRST BANK");
        assertEquals("01", gtCold);
        assertEquals("02", firstBank);
    }

    @Test
    void createTwoBanksRepositoryShouldHaveTwoBanks() {
        String gtCold = bankService.createBank("GTCO");
        String firstBank = bankService.createBank("FIRST BANK");
        assertEquals("01", gtCold);
        assertEquals("01", gtCold);
        assertEquals(2, bankService.findAllBankId().size());
    }

    @Test
    void bankCanBeCreateAccountForCustomer() {
        String gtCold = bankService.createBank("GTCO");
        String accountNumber = bankService.createAccount("01", "Agba", "Mon-suree");

        assertEquals("0100000001", accountNumber);
    }

}