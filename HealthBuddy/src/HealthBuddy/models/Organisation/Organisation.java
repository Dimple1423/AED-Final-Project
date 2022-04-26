/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthBuddy.models.Organisation;

import HealthBuddy.models.Employee.EmployeeCatalog;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.UserAccount.UserAccountCatalog;
import HealthBuddy.models.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Nidhi Singh
 */
public abstract class Organisation {
    private String name;
    private WorkQueue workQueue;
    private EmployeeCatalog employeeCatalog;
    private UserAccountCatalog userAccountCatalog;
    private String organizationID;
    private String cause;
//    private static int counter=0;
    
    public enum Type{
        HospitalAdmin("Hospital Admin Organisation"), 
        Doctor("Doctor Organisation"), 
        Assistant("Assistant Organisation"),
        Attendant("Attendant Organisation"),
        Patient("Patient Organisation"),
        Donor("Donor Organisation"),
        FunderAdmin("Funder Admin Organisation"),
        Manager("Manager Organisation"),
        Volunteer("Volunteer Organisation"),
        BloodbankAdmin("BloodBank Admin Organisation"),
        BloodBankHead("BloodBankHead");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        public static Type getHospitalAdmin() {
            return HospitalAdmin;
        }

        public static Type getDoctor() {
            return Doctor;
        }

        public static Type getReceptionist() {
            return Assistant;
        }

        public static Type getNurse() {
            return Attendant;
        }

        public static Type getPatient() {
            return Patient;
        }

        public static Type getDonor() {
            return Donor;
        }

        public static Type getCharityAdmin() {
            return FunderAdmin;
        }

        public static Type getManager() {
            return Manager;
        }

        public static Type getVolunteer() {
            return Volunteer;
        }

        public static Type getBloodbankAdmin() {
            return BloodbankAdmin;
        }

        public static Type getBloodBankIncharge() {
            return BloodBankHead;
        }
        
    }

    public Organisation(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeCatalog = new EmployeeCatalog();
        userAccountCatalog = new UserAccountCatalog();
        organizationID = UUID.randomUUID().toString();
//        ++counter;
    }

     public Organisation(String name, String cause) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeCatalog = new EmployeeCatalog();
        userAccountCatalog = new UserAccountCatalog();
        organizationID = UUID.randomUUID().toString();
        this.cause=cause;
//        ++counter;
    }
    public abstract ArrayList<Role> getSupportedRole();

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
    
    
    public UserAccountCatalog getUserAccountCatalog() {
        return userAccountCatalog;
    }

    public String getOrganizationID() {
        return organizationID;
    }

    public EmployeeCatalog getEmployeeCatalog() {
        return employeeCatalog;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
   
}