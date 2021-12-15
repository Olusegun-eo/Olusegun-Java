package africa.semicolon.jijiApplication.utils;

import africa.semicolon.jijiApplication.data.dtos.request.RegisterListerRequest;
import africa.semicolon.jijiApplication.data.dtos.response.RegisterListerResponse;
import africa.semicolon.jijiApplication.data.models.Lister;

import java.time.format.DateTimeFormatter;

public class ModelMapper {

    public  static Lister map(RegisterListerRequest request){
        Lister lister = new Lister();
        lister.setEmail(request.getEmail());
        lister.setLocation(request.getLocation());
        lister.setPhoneNumber(request.getPhoneNumber());
        lister.setFullName(request.getFullName());

        return lister;
    }

    public static RegisterListerResponse map(Lister lister){
        RegisterListerResponse response = new RegisterListerResponse();
        response.setDBId(lister.getId());
        response.setDateAndTimeCreated(DateTimeFormatter.ofPattern("E, dd/MM/yyy, hh/mm/a").format(lister.getDateListed()));
            return response;
    }
}
