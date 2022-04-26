package HealthBuddy.models;
import HealthBuddy.models.Employee.Employee;
import HealthBuddy.models.Role.SystemAdmin;
import HealthBuddy.models.UserAccount.UserAccountDirectory;
import HealthBuddy.models.UserAccount.UserAccount;

/**
 *
 * @author Dimple Patel
 */
public class ConfigureSystem {
    public static EcoSystem configure()
    {    
        EcoSystem system = EcoSystem.getInstance();
        Employee employee = system.getEmployeeDirectory().addEmployee("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().newUserAccount("sysadmin", "sysadmin", employee,new SystemAdmin());
        
        return system;
    }
}
