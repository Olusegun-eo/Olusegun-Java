package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepositoryImplement implements AccountRepository{
    List<Account> accounts = new ArrayList<Account>();

    @Override
    public Account save(Account account) {
        accounts.add(account);
        return findByCustomerId(account.getCustomerId());
    }

    @Override
    public Account findByCustomerId(String id) {

        for(Account account: accounts){
            if(account.getCustomerId().equalsIgnoreCase(id)){
                return account;
            }
        }
        return null;
    }

    @Override
    public void delete(Account account) {
        accounts.remove(account.getCustomerId());
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Account> findAll() {
        return accounts;
    }
}
