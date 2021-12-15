package africa.semicolon.bankingApplication.data.models;

import lombok.*;


import java.math.BigDecimal;

@Data //With this annotation added, It has forced the instances to have setters and getters and toString
//@Getter @Setter//Fields scope: @Getters and Setters

public class Account {
    private final BigDecimal balance = BigDecimal.ZERO;
    private String customerId;
    private String number;
    private  AccountType type;
    private BigDecimal amount = BigDecimal.ZERO;


}
