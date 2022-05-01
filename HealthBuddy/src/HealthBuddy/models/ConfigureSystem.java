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
        Employee employee = system.getEmployeeCatalog().addEmployee("hbadmin");
        User user = system.getUserCatalog().newUserAccount("hbadmin", "hbadmin", employee,new SysAdmin());
        
        return system;
    }
}
