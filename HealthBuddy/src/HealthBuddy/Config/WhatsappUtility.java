package HealthBuddy.Config;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.Twilio;
import java.net.URI;
import java.math.BigDecimal;
import com.twilio.type.PhoneNumber;

/**
 *
 * @author Dimpole Patel
 */
public class WhatsappUtility {

    public static void sendWhatsappMessage( String toPhoneNumber, String messageBody) {
        Twilio.init(Config.accountSID, Config.authenticationToken);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("whatsapp:" + toPhoneNumber),
                        new com.twilio.type.PhoneNumber("whatsapp:" + Config.whatsappPhn),
                        messageBody)
                .create();

        System.out.println(message.getSid());
    }
}
