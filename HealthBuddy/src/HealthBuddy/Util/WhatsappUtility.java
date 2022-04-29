package HealthBuddy.Util;

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
        Twilio.init(Utilities.ACCOUNT_SID, Utilities.AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("whatsapp:" + toPhoneNumber),
                        new com.twilio.type.PhoneNumber("whatsapp:" + Utilities.whatsappPhn),
                        messageBody)
                .create();

        System.out.println(message.getSid());
    }
}
