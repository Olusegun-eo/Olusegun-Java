package africa.semicolon.logisticApplication.utils;

import africa.semicolon.logisticApplication.data.dtos.requests.AddTrackingInfoRequest;
import africa.semicolon.logisticApplication.data.dtos.requests.RegisterSenderRequest;
import africa.semicolon.logisticApplication.data.dtos.responses.AddTrackingInfoResponse;
import africa.semicolon.logisticApplication.data.dtos.responses.RegisterSenderResponse;
import africa.semicolon.logisticApplication.data.models.Package;
import africa.semicolon.logisticApplication.data.dtos.requests.AddPackageRequest;
import africa.semicolon.logisticApplication.data.dtos.responses.AddPackageResponse;
import africa.semicolon.logisticApplication.data.models.Sender;
import africa.semicolon.logisticApplication.data.models.TrackingData;

public class ModelMapper {

    public static Package map(AddPackageRequest addPackageRequest){
        Package aPackage = new Package();
        aPackage.setName(addPackageRequest.getReceiverName());
        aPackage.setSenderEmail(addPackageRequest.getSenderEmail());
        aPackage.setDeliveryAddress(addPackageRequest.getDeliveryAddress());
        aPackage.setReceiverPhone(addPackageRequest.getReceiverName());
        aPackage.setReceiverPhone(addPackageRequest.getReceiverPhone());
//        aPackage.setNetWeight(addPackageRequest.getNetWeight());
        return aPackage;
    }

    public static AddPackageResponse map(Package savedPackage){
        AddPackageResponse response = new AddPackageResponse();
        response.setPackageName(savedPackage.getName());
        response.setPackageWeight(savedPackage.getNetWeight());
        response.setReceiverPhone(savedPackage.getReceiverPhone());
        response.setTrackingNumber(savedPackage.getId());
        return response;
    }

    public static Sender map(RegisterSenderRequest registerSenderRequest){
        Sender sender  = new Sender();
        sender.setSenderName(registerSenderRequest.getSenderName());
        sender.setEmailAddress(registerSenderRequest.getSenderEmail());
        sender.setPhoneNumber(registerSenderRequest.getPhoneNumber());
        return sender;
    }

    public static RegisterSenderResponse map(Sender sender){
        RegisterSenderResponse response = new RegisterSenderResponse();
        response.setSenderEmail(sender.getEmailAddress());
        return response;
    }

    public static AddTrackingInfoResponse map(TrackingData trackingData, AddTrackingInfoRequest addTrackingInfoRequest){
        AddTrackingInfoResponse addTrackingInfoResponse = new AddTrackingInfoResponse();
        addTrackingInfoResponse.setDateTime(trackingData.getDateTimeOfEvent());
        addTrackingInfoResponse.setEvent(trackingData.getEvent());
        addTrackingInfoResponse.setPackageId(addTrackingInfoResponse.getPackageId());
        return addTrackingInfoResponse;
    }


}



/*
package africa.semicolon.cheetah.utils;
import africa.semicolon.cheetah.data.models.Package;
import africa.semicolon.cheetah.data.models.Sender;
import africa.semicolon.cheetah.data.models.TrackingData;
import africa.semicolon.cheetah.dtos.requests.AddPackageRequest;
import africa.semicolon.cheetah.dtos.requests.RegisterSenderRequest;
import africa.semicolon.cheetah.dtos.responses.AddPackageResponse;
import africa.semicolon.cheetah.dtos.responses.AddTrackingInfoResponse;
import africa.semicolon.cheetah.dtos.responses.RegisterSenderResponse;

public class ModelMapper {
    public static Package map(AddPackageRequest addPackageRequest){
        Package aPackage = new Package();
        aPackage.setName(addPackageRequest.getPackageDescription());
        aPackage.setDeliveryAddress(addPackageRequest.getDeliveryAddress());
        aPackage.setSenderEmail(addPackageRequest.getSenderEmail());
        aPackage.setReceiverPhone(addPackageRequest.getReceiverPhone());
        aPackage.setReceiverName(addPackageRequest.getReceiverName());
        aPackage.setNetWeight(addPackageRequest.getPackageWeight());
        return  aPackage;

    }


    public static AddPackageResponse map(Package savedPackage){
        AddPackageResponse response = new AddPackageResponse();
        response.setPackageName(savedPackage.getName());
        response.setPackageWeight(savedPackage.getNetWeight());
        response.setReceiverName(savedPackage.getReceiverName());
        response.setTrackingNumber(savedPackage.getId());
        response.setReceiverPhone(savedPackage.getReceiverPhone());
//        return converted response;
        return response;
    }
    public static Sender map(RegisterSenderRequest registerSenderRequest) {
        Sender sender = new Sender();
        sender.setSenderName(registerSenderRequest.getSenderName());
        sender.setEmailAddress(registerSenderRequest.getSenderEmail());
        sender.setPhoneNumber(registerSenderRequest.getPhoneNumber());

        return sender;
    }
    public static RegisterSenderResponse map(Sender sender){
        RegisterSenderResponse response = new RegisterSenderResponse();
        response.setSenderEmail(sender.getEmailAddress());

        return response;
    }
//AddTrackingInfoRequest addTrackingInfo
    public static AddTrackingInfoResponse map(TrackingData trackingData, Integer packageId) {
        AddTrackingInfoResponse addTrackingInfoResponse = new AddTrackingInfoResponse();
        addTrackingInfoResponse.setDateTime(trackingData.getDateTimeOfEvent());
        addTrackingInfoResponse.setEvent(trackingData.getEvent());
//        (addtrackingInfo.getPackageId());
        addTrackingInfoResponse.setPackageId(packageId);
        return addTrackingInfoResponse;
    }
}
 */