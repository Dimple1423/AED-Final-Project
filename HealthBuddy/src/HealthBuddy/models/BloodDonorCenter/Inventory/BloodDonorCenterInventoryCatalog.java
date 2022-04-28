package HealthBuddy.models.BloodDonorCenter.Inventory;
import HealthBuddy.models.BloodDonorCenter.Inventory.BloodDonorCenterInventory.BloodGroup;

import java.util.ArrayList;

/**
 *
 * @author Dimple Patel
 */
public class BloodDonorCenterInventoryCatalog {
        private ArrayList<BloodDonorCenterInventory> bloodInventory;

    public BloodDonorCenterInventoryCatalog() {
        this.bloodInventory =new ArrayList<BloodDonorCenterInventory>();
    }
    
    public ArrayList<BloodDonorCenterInventory> getStock() 
    {
        return bloodInventory;
    }

    public void setStock(ArrayList<BloodDonorCenterInventory> bloodInventory) 
    {
        this.bloodInventory = bloodInventory;
    }
    
    
    //Adding new stock
    public BloodDonorCenterInventory stockBlood() 
    {
        BloodDonorCenterInventory stockObj = new BloodDonorCenterInventory();
        bloodInventory.add(stockObj);
        return stockObj;
    }
    
    //Finding particular blood group available in the stock
    public BloodDonorCenterInventory findBloodGroup(BloodGroup bloodType)
    {
        boolean result = true;
        for(BloodDonorCenterInventory stock : this.bloodInventory)
        {
            if(stock.getBloodGroup() != null)
            {
                if(!stock.getBloodGroup().equals(bloodType.getVal()))
                {
                     result = true;
                }
                else
                {
                    result = false;
                    return stock;
                }
            }    
            else
            {
                result = true;
            }
        }
        
        if(result == true)
        {
            BloodDonorCenterInventory stockObj = stockBlood();
            return stockObj;
        }
        
        return null; 
    }
    
    
    //Checking the quantity of blood available for a particular blood group
    public boolean checkBloodQuantity(String bloodGroup, int bloodRequired)
    {   
        for(BloodDonorCenterInventory stockObj : this.bloodInventory)
        {
            if(stockObj.getBloodGroup().equalsIgnoreCase(bloodGroup))
            {
                int bloodAvailable = stockObj.getBloodVolume();
                
                if(bloodAvailable > bloodRequired )
                {
                    bloodAvailable -= bloodRequired;
                    stockObj.setBloodVolume(bloodAvailable);
                    return true;
                   
                }
                else
                {
                     return false;
                }
            }
        }
        return false;
    }
    
}
