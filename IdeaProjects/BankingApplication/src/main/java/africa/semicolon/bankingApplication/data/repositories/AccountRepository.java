package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;
import africa.semicolon.bankingApplication.data.models.Bank;

import java.util.List;

public interface AccountRepository {

    Account save(Account account);
    Account findByCustomerId(String id);
    void delete(Account account);
    void delete(String id);
    List<Account> findAll();
}
