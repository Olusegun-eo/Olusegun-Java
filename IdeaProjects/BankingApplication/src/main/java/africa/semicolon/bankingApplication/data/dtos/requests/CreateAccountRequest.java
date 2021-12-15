package africa.semicolon.bankingApplication.data.dtos.requests;

import africa.semicolon.bankingApplication.data.models.AccountType;
import lombok.Data;

@Data
public class CreateAccountRequest {

    private String bankId;
    private AccountType accountType;
    private String firstName;
    private String lastName;
    private String bvn;

}
