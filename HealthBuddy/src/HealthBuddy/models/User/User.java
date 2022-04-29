package HealthBuddy.models.User;

import HealthBuddy.models.Employee.Employee;
import HealthBuddy.models.User.*;
import HealthBuddy.models.UserData.DonorData;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.WorkQueue.WorkQueue;
import HealthBuddy.models.UserData.PatientData;

/**
 *
 * @author Bhawna Singh
 */
public class User {
    
    private String username;
    private String password;
    private Employee employee;
    private PatientData patient;
    private DonorData donor;
    private Role role;
    private WorkQueue workQueue;
    private int loginAttempt=0;

    public int getLoginattempt() {
        return loginAttempt;
    }

    public void setLoginattempt(int loginAttempt) {
        this.loginAttempt += loginAttempt;
    }

    public void resetLogin() {
        loginAttempt = 0;

    }

    public User() {
        workQueue = new WorkQueue();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public DonorData getDonor() {
        return donor;
    }

    public void setDonor(DonorData donor) {
        this.donor = donor;
    }
    
    public PatientData getPatient() {
        return patient;
    }

    public void setPatient(PatientData patient) {
        this.patient = patient;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return username;
    }
}
