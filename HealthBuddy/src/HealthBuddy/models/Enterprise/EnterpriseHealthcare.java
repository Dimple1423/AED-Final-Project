package HealthBuddy.models.Enterprise;
import HealthBuddy.models.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author Dimple Patel
 */
public class EnterpriseHealthcare {
    public EnterpriseHealthcare(String name){
        super(name,EnterpriseClassification.Hospital);
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
