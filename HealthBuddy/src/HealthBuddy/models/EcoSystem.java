package HealthBuddy.models;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.UserData.PatientDirectory;
import HealthBuddy.models.UserData.DonorDirectory;
import HealthBuddy.models.Healthcare.Appointment.AppointmentCatalog;
import HealthBuddy.models.Trust.Donation.TrustCatalog;
import java.util.ArrayList;


/**
 *
 * @author Dimple Patel
 */
public class EcoSystem extends Organisation {
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private PatientDirectory patientDir;
    private DonorDirectory donorDir;
    private AppointmentCatalog appointmentCatalog;
    private TrustCatalog trustCatalog;
    
    public static EcoSystem getInstance()
    {
        if(business==null)
        {
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork()
    {
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    private EcoSystem()
    {
        super(null);
        networkList=new ArrayList<>();
        this.patientDir = new PatientDirectory();
        this.donorDir = new DonorDirectory();
        this.appointmentCatalog = new AppointmentCatalog();
        this.trustCatalog = new TrustCatalog();
    }

    public AppointmentCatalog getAppointmentCatalog() {
        return appointmentCatalog;
    }

    public void setAppointmentCatalog(AppointmentCatalog appointmentCatalog) {
        this.appointmentCatalog = appointmentCatalog;
    }

    public TrustCatalog getDonationDirectory() {
        return trustCatalog;
    }

    public void setDonationDirectory(TrustCatalog donationDirectory) {
        this.trustCatalog = donationDirectory;
    }

    public PatientDirectory getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(PatientDirectory patientDir) {
        this.patientDir = patientDir;
    }

    public DonorDirectory getDonorDir() {
        return donorDir;
    }

    public void setDonorDir(DonorDirectory donorDir) {
        this.donorDir = donorDir;
    }

    public ArrayList<Network> getNetworkList() 
    {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) 
    {
        this.networkList = networkList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
