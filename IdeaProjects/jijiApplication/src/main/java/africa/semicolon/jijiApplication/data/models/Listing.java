package africa.semicolon.jijiApplication.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("Listings")
@Data
public class Listing {

    @Id
    private String id;
    private String name;
    private String shortDescription;
    private String longDescription;
    private LocalDateTime dateListed = LocalDateTime.now();
    Condition condition;
    @DBRef
    private Lister lister;
    private String type;
    private String subType;
    private  int numberOfViews;
}
