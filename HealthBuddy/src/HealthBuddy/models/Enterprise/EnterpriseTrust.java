package HealthBuddy.models.Enterprise;

import HealthBuddy.models.Role.Role;
import HealthBuddy.models.WorkQueue.WorkQueue;
import java.util.ArrayList;
/**
 *
 * @author Dimple Patel
 */
public class EnterpriseTrust {
    public EnterpriseTrust(String name)
    {
        super(name,EnterpriseClassification.Funds);
   
    }
    
     public EnterpriseTrust(String name, String cause)
    {
        super(name,EnterpriseClassification.Funds, cause);
   
    }


    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }     
}
