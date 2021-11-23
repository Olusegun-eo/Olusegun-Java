package africa.semicolon.jijiApplication.data.dtos.request;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RegisterListerRequest {
    private String fullName;
    private String phoneNumber;
    private String email;
    private LocalDateTime dateListed = LocalDateTime.now();
    private String location;
}
