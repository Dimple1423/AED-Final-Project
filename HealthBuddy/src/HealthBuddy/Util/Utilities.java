package HealthBuddy.Util;

import javax.swing.JTextField;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Dimple Patel
 */
public class Utilities {
    public static String email = "";
    public static String password = "";
    public static final String ACCOUNT_SID = "";
    public static final String AUTH_TOKEN = "";
    public static final String mediStopPhoneNumber = "";
    public static final String whatsappPhn = "";


    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");


    public static String getTrimmedText(JTextField textField) {
            return textField.getText().trim();
    
    }
    
}
