package HealthBuddy.models;
import HealthBuddy.models.Employee.Employee;
import HealthBuddy.models.Role.SysAdmin;
import HealthBuddy.models.User.UserCatalog;
import HealthBuddy.models.User.User;

/**
 *
 * @author Dimple Patel
 */
public class ConfigureSystem {
    public static EcoSystem configure()
    {    
        EcoSystem system = EcoSystem.getInstance();
        Employee employee = system.getEmployeeCatalog().addEmployee("sysadmin");
        User user = system.getUserCatalog().newUser("sysadmin", "sysadmin", employee,new SysAdmin());
        
        return system;
    }
}
