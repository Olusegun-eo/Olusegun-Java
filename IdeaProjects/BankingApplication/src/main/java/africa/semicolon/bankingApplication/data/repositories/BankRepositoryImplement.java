package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Bank;
import africa.semicolon.bankingApplication.data.models.Customer;
import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;

public class BankRepositoryImplement implements BankRepository{

    List<Bank> banks = new ArrayList<Bank>();

    @Override
    public Bank save(Bank bank) {
        Bank foundBank = findByCustomerId(bank.getId());
        if(foundBank != null){
            delete(foundBank);
        }
        banks.add(bank);
        return findByCustomerId(bank.getId());
    }

    @Override
    public Bank findByCustomerId(String id) {

        for (Bank bank: banks){
            if (bank.getId().equalsIgnoreCase(id)){
                return bank;
            }
        }
        return null;
    }

    @Override
    public void delete(Bank bank) {
        banks.remove(bank);
    }

    @Override
    public void delete(String id) {
        Bank bank = findByCustomerId(id);
        delete(bank);
    }

    @Override
    public List<Bank> findAll() {
        return banks;
    }
}
