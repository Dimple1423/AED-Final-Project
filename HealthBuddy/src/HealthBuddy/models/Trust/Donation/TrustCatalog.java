package HealthBuddy.models.Trust.Donation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Dimple Patel
 */
public class TrustCatalog {

    private ArrayList<TrustDetails> trustCatalog;

    public TrustCatalog() {
        this.trustCatalog = new ArrayList<TrustDetails>();
    }

    public ArrayList<TrustDetails> getTrustCatalog() {
        return trustCatalog;
    }

    public void seTrustCatalog(ArrayList<TrustDetails> trustCatalog) {
        this.trustCatalog = trustCatalog;
    }

    //Adding new donation
    public TrustDetails newDonation() {
        TrustDetails donation = new TrustDetails();
        trustCatalog.add(donation);
        return donation;
    }

    public List<TrustDetails> getTrustDetailsForADonor(String username) {
        return trustCatalog.stream()
                .filter(TrustDetails -> TrustDetails.getDonor().getUsername().equals(username))
                .collect(Collectors.toList());

    }

    public List<TrustDetails> getTrustDetailsForACharityName(String name) {
        return trustCatalog.stream()
                .filter(TrustDetails -> TrustDetails.geTrustOrgName().equals(name))
                .collect(Collectors.toList());

    }

    public List<TrustDetails> getTrustDetailsForACharityCity(String city) {
        return trustCatalog.stream()
                .filter(TrustDetails -> TrustDetails.geTrustOrgCity().equals(city))
                .collect(Collectors.toList());

    }

    public List<TrustDetails> getTrustDetailsForACharityCause(String cause) {
        return trustCatalog.stream()
                .filter(TrustDetails -> TrustDetails.geTrustCause().equals(cause))
                .collect(Collectors.toList());

    }
}
