package HealthBuddy.models.WorkQueue;

/**
 *
 * @author Bhawna Singh
 */
public class BloodControllerAttendantWQ extends WorkRequest {
    
    private String nameOfPatient;
    private String whichTypeOfBlood;
    private int unitsOfBlood;
   
    public String getNameOfPatient() {
        return nameOfPatient;
    }

    public void setNameOfPatient(String nameOfPatient) {
        this.nameOfPatient = nameOfPatient;    
    }
    
    public String getTypeOfBlood() {
        return whichTypeOfBlood;
    }

    public void setTypeOfBlood(String whichTypeOfBlood) {
        this.whichTypeOfBlood = whichTypeOfBlood;
    }
    
    public int getUnitsOfBlood() {
        return unitsOfBlood;
    }

    public void setUnitsOfBlood(int unitsOfBlood) {
        this.unitsOfBlood = unitsOfBlood;
    }
    
    @Override
    public String toString(){
        return nameOfPatient;
    }
}
