/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthBuddy.models.UserData;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author Nidhi Singh
 */
public class DonorCatalog {
    private ArrayList<DonorData> donorCatalog;
     public DonorCatalog(){
        
        this.donorCatalog = new ArrayList<DonorData>();
    }

    public ArrayList<DonorData> getDonorCatalog() 
    {
        return donorCatalog;
    }

    public void setDonorCatalog(ArrayList<DonorData> donorCatalog) 
    {
        this.donorCatalog = donorCatalog;
    }
    public void deleteDonor(DonorData donor){
        donorCatalog.remove(donor);
    }
    public DonorData addDonor()
    {
        DonorData donor = new DonorData();
        donorCatalog.add(donor);
        return donor;
    }

    public DonorData addDonor(DonorData donorData)
    {

        donorCatalog.add(donorData);
        return donorData;
    }
    
    
    public DonorData getDonor(String username) {
        
        return donorCatalog.stream().filter(donor -> donor.getUsername()
                .equals(username))
                .collect(Collectors.toList()).get(0);
    
    
    }


}
