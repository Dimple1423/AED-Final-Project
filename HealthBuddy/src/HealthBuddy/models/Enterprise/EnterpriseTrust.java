package HealthBuddy.models.Enterprise;

import HealthBuddy.models.Role.Role;
import HealthBuddy.models.WorkQueue.WorkQueue;
import java.util.ArrayList;
/**
 *
 * @author Dimple Patel
 */
public class EnterpriseTrust extends Enterprise{
    public EnterpriseTrust(String name)
    {
        super(name,EnterpriseClassification.Trust);
   
    }
    
     public EnterpriseTrust(String name, String cause)
    {
        super(name,EnterpriseClassification.Trust, cause);
   
    }


    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }     
}
