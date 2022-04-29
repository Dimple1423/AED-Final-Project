package HealthBuddy.Util;

/**
 *
 * @author Dimpole Patel
 */
public class OTPUtility {

   public static String generateOTP(int otpLength)
    {
        String charDirectory = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int n = charDirectory.length();

        String OTP="";

        for (int i = 1; i <= otpLength; i++)
            OTP += (charDirectory.charAt((int) ((Math.random()*10) % n)));

        System.out.println(OTP);

        return(OTP);
    }


}
