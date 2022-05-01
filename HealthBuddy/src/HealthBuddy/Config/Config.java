package HealthBuddy.Config;

import java.time.format.DateTimeFormatter;
import javax.swing.JTextField;

/**
 *
 * @author Dimple Patel
 */
public class Config {

    public static final String accountSID = "";
    public static final String authenticationToken = "";
    public static String emailId = "";
    public static String password = "";
    public static final String whatsappPhn = "";
    public static final String healthBuddyPhoneNumber = "";
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");


    public static String getClippedText(JTextField textField) {
            return textField.getText().trim();
    }
    
}
