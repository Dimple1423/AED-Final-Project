/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthBuddy.models.Healthcare.Organisation;

//import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;
import java.util.ArrayList;
import HealthBuddy.models.Healthcare.Role.HealthcareAssistant;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.WorkQueue.WorkQueue;

/**
 *
 * @author Nidhi Singh
 */

public class HealthcareOrganisationAssistant extends Organisation {

    private WorkQueue fundsReceived;
    private WorkQueue incomingPatients;
    private WorkQueue fundApplicationQueue;

    public HealthcareOrganisationAssistant() {
    super(Organisation.Type.Assistant.getValue());
        incomingPatients = new WorkQueue();
        fundApplicationQueue = new WorkQueue();
        fundsReceived = new WorkQueue();
    }

    public WorkQueue getFundsReceived() {
        return fundsReceived;
    }

    public void setFundsReceived(WorkQueue fundsReceived) {
        this.fundsReceived = fundsReceived;
    }

    public WorkQueue getIncomingPatients() {
        return incomingPatients;
    }

    public void setIncomingPatients(WorkQueue incomingPatients) {
        this.incomingPatients = incomingPatients;
    }

    public WorkQueue getFundApplicationQueue() {
        return fundApplicationQueue;
    }
    
     public WorkQueue getFundApplicationQueueWithAccMesg() {
        return fundApplicationQueue;
    }

    public void setFundApplicationQueue(WorkQueue fundApplicationQueue) {
        this.fundApplicationQueue = fundApplicationQueue;
    }  
      
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HealthcareAssistant());
        return roles;
    }   
}

