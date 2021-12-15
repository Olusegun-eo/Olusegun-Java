package africa.semicolon.bankingApplication.services;

import africa.semicolon.bankingApplication.data.dtos.requests.CreateAccountRequest;
import africa.semicolon.bankingApplication.data.models.Bank;
import africa.semicolon.bankingApplication.data.repositories.BankRepository;
import africa.semicolon.bankingApplication.data.repositories.BankRepositoryImplement;

import java.util.Collection;
import java.util.List;

public class BankServiceImplement implements BankService {
    private final BankRepository bankRepository = new BankRepositoryImplement();
//    private static int lastBankIdCreated = 0;

    @Override
    public String createBank(String bankName){

        String bankId = generateBankId();
        Bank bank = new Bank(bankId);
        bank.setName(bankName);
        Bank savedBank = bankRepository.save(bank);
        return savedBank.getId();
    }

    @Override
    private String generateBankId(){
        int lastBankIdCreated = findAllBankId().size();
        return String.format("%02d", ++lastBankIdCreated);
    }

    @Override
    private List<Bank> findAllBankId() {
        return bankRepository.findAll();
    }

    @Override
    public String createAccount(CreateAccountRequest createAccountRequest){

        String accountSuffix = String.format("%08d", lastAccountId);
    }

    
}
