package HealthBuddy.models.Enterprise;

import HealthBuddy.models.Bloodbank.Stock.BloodBankStockDirectory;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Dimple Patel
 */
public class EnterpriseBloodDonorCenter {
    private BloodBankStockDirectory bbinventoryDirectory;
    
    public EnterpriseBloodDonorCenter(String name){
        super(name,EnterpriseClassification.Bloodbank);
        bbinventoryDirectory= new BloodBankStockDirectory();
    }
  
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
