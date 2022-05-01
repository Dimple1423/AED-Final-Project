package HealthBuddy.Config;

import java.time.format.DateTimeFormatter;
import javax.swing.JTextField;

/**
 *
 * @author Dimple Patel
 */
public class Config {

    public static final String accountSID = "ACf3b26aae1a938efde2f03d9190001fc7";
    public static final String authenticationToken = "b2abc8e40ab7c59d3e5d570c6ab588e1";
    public static String emailId = "dimple.patel1408@gmail.com";
    public static String password = "Dimple@1423";
    public static final String whatsappPhn = "+14155238886";
    public static final String healthBuddyPhoneNumber = "+17124236150";
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");


    public static String getClippedText(JTextField textField) {
            return textField.getText().trim();
    }
    
}
