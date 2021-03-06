package HealthBuddy.Config;

import com.twilio.type.PhoneNumber;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.exception.ApiException;

/**
 *
 * @author Dimple Patel
 */
public class SMSUtility {


    public static void sendSMS(String receiverPhoneNumber, String messageBody) {
        try {
            Twilio.init(Config.accountSID, Config.authenticationToken);
            Message message = Message.creator(new PhoneNumber(receiverPhoneNumber), 
                    new PhoneNumber(Config.healthBuddyPhoneNumber),
                    messageBody).create();
            System.out.println(message.getBody());

        } catch (ApiException apiException) {
            apiException.printStackTrace();
        }


    }



}
