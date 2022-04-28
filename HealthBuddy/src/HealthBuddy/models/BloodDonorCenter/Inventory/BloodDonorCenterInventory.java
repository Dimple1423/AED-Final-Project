package HealthBuddy.models.BloodDonorCenter.Inventory;

/**
 *
 * @author Dimple Patel
 */
public class BloodDonorCenterInventory {
    private int bloodVolume;
    private String bloodGroup;

    public enum BloodGroup{
    
         OPositive("O+"),ONegative("O-"),
         APositive("A+"),ANegative("A-"),
         BPositive("B+"),BNegative("B-"),
         ABPositive("AB+"),ABNegative("AB-");
          
         private String val;

        private BloodGroup(String val) {
            this.val = val;
        }

        public String getVal() {
            return val;
        }

        public void setVal(String val) {
            this.val = val;
        }

        public static BloodGroup getBloodGroupOPositive() {
            return OPositive;
        }
        
        public static BloodGroup getBloodGroupONegative() {
            return ONegative;
        }

        public static BloodGroup getBloodGroupAPositive() {
            return APositive;
        }
        
        public static BloodGroup getBloodGroupANegative() {
            return ANegative;
        }

        public static BloodGroup getBloodGroupBPositive() {
            return BPositive;
        }

        
        public static BloodGroup getBloodGroupBNegative() {
            return BNegative;
        }

        public static BloodGroup getBloodGroupABPositive() {
            return ABPositive;
        }
          
        public static BloodGroup getBloodGroupABNegative() {
            return ABNegative;
        }
    }
         
    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    
    public int getBloodVolume() {
        return bloodVolume;
    }

    public void setBloodVolume(int bloodVolume) {
        this.bloodVolume = bloodVolume;
    }

    //We can use Tools | Templates for changing body of generated methods.
    @Override
    public String toString() {
        return bloodGroup; 
    }    
}
