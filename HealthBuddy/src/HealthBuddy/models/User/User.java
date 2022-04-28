package HealthBuddy.models.User;

import HealthBuddy.models.User.*;
import HealthBuddy.models.Employee.Employee;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.UserData.DonorData;
import HealthBuddy.models.UserData.PatientData;
import HealthBuddy.models.WorkQueue.WorkQueue;

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
    private int loginattempt=0;

    public int getLoginattempt() {
        return loginattempt;
    }

    public void setLoginattempt(int loginattempt) {
        this.loginattempt += loginattempt;
    }

    public void resetLogin() {
        loginattempt = 0;

    }

    public User() {
        workQueue = new WorkQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public PatientData getPatient() {
        return patient;
    }

    public void setPatient(PatientData patient) {
        this.patient = patient;
    }

    public DonorData getDonor() {
        return donor;
    }

    public void setDonor(DonorData donor) {
        this.donor = donor;
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
