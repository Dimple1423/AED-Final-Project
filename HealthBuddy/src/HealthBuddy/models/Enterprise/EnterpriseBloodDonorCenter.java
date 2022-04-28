package HealthBuddy.models.Enterprise;

import HealthBuddy.models.BloodDonorCenter.Inventory.BloodDonorCenterInventoryCatalog;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Dimple Patel
 */
public class EnterpriseBloodDonorCenter extends Enterprise{
    private BloodDonorCenterInventoryCatalog bbinventoryCatalog;
    
    public EnterpriseBloodDonorCenter(String name){
        super(name,EnterpriseClassification.BloodDonorCenter);
        bbinventoryCatalog= new BloodDonorCenterInventoryCatalog();
    }
  
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
