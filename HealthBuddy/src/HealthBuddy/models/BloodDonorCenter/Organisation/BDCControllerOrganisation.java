package HealthBuddy.models.BloodDonorCenter.Organisation;
import java.util.ArrayList;
import HealthBuddy.models.BloodDonorCenter.Role.BloodDonorCenterController;
import HealthBuddy.models.WorkQueue.WorkQueue;
import HealthBuddy.models.BloodDonorCenter.Inventory.BloodDonorCenterInventoryCatalog;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.Organisation.Organisation;

/**
 *
 * @author Dimple Patel
 */
public class BDCControllerOrganisation extends Organisation{
    private BloodDonorCenterInventoryCatalog bbInventoryCatalog;
    public BDCControllerOrganisation() {
        super(Organisation.Type.BloodDonorCenterController.getValue());
        bbInventoryCatalog= new BloodDonorCenterInventoryCatalog();
       
    }

    public BloodDonorCenterInventoryCatalog getBbStockDirectory() {
        return bbInventoryCatalog;
    }

    public void setBbStockDirectory(BloodDonorCenterInventoryCatalog bbStockDirectory) {
        this.bbInventoryCatalog = bbStockDirectory;
    }
        
    
   
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodDonorCenterController());
        return roles;
    }    
}
