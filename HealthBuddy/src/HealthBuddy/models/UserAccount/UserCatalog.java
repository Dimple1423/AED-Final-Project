package HealthBuddy.models.UserAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import HealthBuddy.models.Employee.Employee;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.UserData.DonorData;
import HealthBuddy.models.UserData.PatientData;

/**
 *
 * @author Bhawna Singh
 */
public class UserCatalog {
    
    private ArrayList<UserAccount> userCatalog;

    public UserCatalog() {
        this.userCatalog = new ArrayList();
    }

    public ArrayList<UserAccount> getUserCatalog() {
        return userCatalog;
    }
    
    //To create new user account
    public UserAccount newUserAccount(String username, String password, Employee employee, Role role){
        UserAccount ua = new UserAccount();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setEmployee(employee);
        ua.setRole(role);
        userCatalog.add(ua);
        return ua;
    }
    
     //To create new donor account
    public UserAccount newDonorAccount(String username, String password, DonorData donor, Role role)
    {
        UserAccount ua = new UserAccount();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setDonor(donor);
        ua.setRole(role);
        userCatalog.add(ua);
        return ua;
    }
    
    //To create new patient account
    public UserAccount newPatientAccount(String username, String password, PatientData patient, Role role)
    {
        UserAccount ua = new UserAccount();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setPatient(patient);
        ua.setRole(role);
        userCatalog.add(ua);
        return ua;
    }
    
    //Validate if username is unique
    public boolean ifUniqueUsername(String username){
        for (UserAccount ua : userCatalog){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
   //To authenticate user
   public UserAccount authenticateUserAccount(String username, String password){
       List<UserAccount> useraccList = userCatalog.stream().filter(acc -> acc.getUsername().equals(username) && acc.getPassword().equals(password))
                .collect(Collectors.toList());
       List<UserAccount> useraccList1 = userCatalog.stream().filter(acc -> acc.getUsername().equals(username))
               .collect(Collectors.toList());

       boolean isUsernamePresent = userCatalog.stream().filter(acc -> acc.getUsername().equals(username))
               .collect(Collectors.toList()).size() > 0;
       boolean isSuccess = useraccList.size() > 0;

       if (isSuccess) {
           useraccList.get(0).resetLogin();
           return useraccList.get(0);
       } else if (isUsernamePresent && !isSuccess){
           useraccList1.get(0).setLoginattempt(1);
           if (useraccList1.get(0).getLoginattempt() > 3) {
               userCatalog.remove(useraccList1.get(0));
               JOptionPane.showMessageDialog(null, "You exceeded maximum number of login attempts. \nYour Account has been removed from DB please create new One!");
           }
           return null;
       }

       
        return null;
        
    }
   
   public boolean isUserNameUnique(String username) {
       List<UserAccount> useraccList = userCatalog.stream().filter(acc -> acc.getUsername().equals(username))
                .collect(Collectors.toList());
       
       return useraccList.size() == 0; 
   }
   
   //To remove user
    public void removeUserAccount(String username){
        for(UserAccount ua :userCatalog){
            if(ua.getUsername().equals(username))
            {
                userCatalog.remove(ua);
                break;
            }
        }
    }
    
    //to return the user on the basis of userName for login attempt functionality:
    public UserAccount getUser(String username){
        System.out.println(userCatalog.size());
       return userCatalog.stream().filter(acc -> acc.getUsername().equals(username))
         .collect(Collectors.toList()).get(0);
    }

}