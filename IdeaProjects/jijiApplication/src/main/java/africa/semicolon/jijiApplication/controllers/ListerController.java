package africa.semicolon.jijiApplication.controllers;

import africa.semicolon.jijiApplication.data.dtos.request.RegisterListerRequest;
import africa.semicolon.jijiApplication.data.exceptions.JiJiApplicationExceptions;
import africa.semicolon.jijiApplication.services.ListerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lister")
public class ListerController {
    @Autowired
    private ListerService listerService;


    public ResponseEntity<?> register(@RequestBody RegisterListerRequest request){

        try {
            return new ResponseEntity<>(listerService.registerLister(request), HttpStatus.CREATED);
            }
        catch(JiJiApplicationExceptions exception){
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
