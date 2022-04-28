package HealthBuddy.models.Enterprise;
import HealthBuddy.models.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author Dimple Patel
 */
public class EnterpriseUser extends Enterprise{
    public EnterpriseUser(String name){
        super(name,EnterpriseClassification.User);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }    
}
