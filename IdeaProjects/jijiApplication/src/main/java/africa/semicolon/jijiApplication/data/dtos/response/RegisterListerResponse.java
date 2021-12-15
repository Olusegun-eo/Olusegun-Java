package africa.semicolon.jijiApplication.data.dtos.response;


import lombok.Data;


import java.time.LocalDateTime;

@Data
public class RegisterListerResponse {

  private String dBId;
  private String dateAndTimeCreated;
}
