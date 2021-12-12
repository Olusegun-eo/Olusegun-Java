package africa.semicolon.jijiApplication.services;

import africa.semicolon.jijiApplication.data.dtos.request.RegisterListerRequest;
import africa.semicolon.jijiApplication.data.dtos.response.RegisterListerResponse;
import africa.semicolon.jijiApplication.data.exceptions.DuplicateListerException;
import africa.semicolon.jijiApplication.data.models.Lister;
import africa.semicolon.jijiApplication.data.repositories.ListerRepository;
import africa.semicolon.jijiApplication.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ListerServiceImpl implements ListerService {
    @Autowired
    private ListerRepository listerRepository;

    @Override
    public RegisterListerResponse registerLister(RegisterListerRequest request) {
        Optional<Lister> optionalLister= listerRepository.findListerByEmail(request.getEmail());
        if(optionalLister.isPresent()) throw new DuplicateListerException(request.getEmail() + "already exist");

//        Validate user not exist(email)
//                find lister by email, if null
//                  create lister from request
        Lister lister = ModelMapper.map(request);
        Lister savedLister = listerRepository.save(lister);
//                      save lister

        RegisterListerResponse response = ModelMapper.map(savedLister);
//                         create response from saved lister
//                          else throw exception
        return response;
    }
}
