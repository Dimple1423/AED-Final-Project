package HealthBuddy.models.Network;

import HealthBuddy.models.Enterprise.EnterpriseCatalog;
import HealthBuddy.models.WorkQueue.WorkQueue;

/**
 *
 * @author Nidhi Singh
 */
public class Network {

    private String nameOfNetwork;
    private EnterpriseCatalog enterpriseCatalog;
    private WorkQueue fundsRequests;
    private WorkQueue BloodDonorCenterRequests;

    public Network() {
        enterpriseCatalog = new EnterpriseCatalog();
        this.fundsRequests = new WorkQueue();
        this.BloodDonorCenterRequests = new WorkQueue();
    }

    public WorkQueue getFundsRequests() {
        return fundsRequests;
    }

    public void setFundsRequests(WorkQueue fundsRequests) {
        this.fundsRequests = fundsRequests;
    }

    public WorkQueue getBloodDonorCenterRequests() {
        return BloodDonorCenterRequests;
    }

    public void setBloodDonorCenterRequests(WorkQueue BloodDonorCenterRequests) {
        this.BloodDonorCenterRequests = BloodDonorCenterRequests;
    }

    public String getNetworkName() {
        return nameOfNetwork;
    }

    public void setNetworkName(String nameOfNetwork) {
        this.nameOfNetwork = nameOfNetwork;
    }

    public EnterpriseCatalog getEnterpriseCatalog() {
        return enterpriseCatalog;
    }

    @Override
    public String toString() {
        return nameOfNetwork;
    }
}
