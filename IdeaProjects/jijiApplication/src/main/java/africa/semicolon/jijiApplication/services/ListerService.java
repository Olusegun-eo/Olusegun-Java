package africa.semicolon.jijiApplication.services;

import africa.semicolon.jijiApplication.data.dtos.request.RegisterListerRequest;
import africa.semicolon.jijiApplication.data.dtos.response.RegisterListerResponse;

public interface ListerService {
     RegisterListerResponse registerLister(RegisterListerRequest request);
}
