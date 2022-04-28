/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthBuddy.models.Trust.Donation;
import java.util.Date;
import HealthBuddy.models.UserData.DonorData;

/**
 *
 * @author Dimple Patel
 */
public class TrustDetails {
    private String trustOrgName;
    private String trustOrgCity;
    private String donation;
    private String frequencyType;
    private String trustCause;
    private Date donationDate;
    private DonorData donor;

    public String geTrustCause() {
        return trustCause;
    }

    public void seTrustCause(String trustCause) {
        this.trustCause = trustCause;
    }

    public String getFrequencyType() {
        return frequencyType;
    }

    public void setFrequencyType(String frequencyType) {
        this.frequencyType = frequencyType;
    }

    public String geTrustOrgName() {
        return trustOrgName;
    }

    public void seTrustOrgName(String trustOrgName) {
        this.trustOrgName = trustOrgName;
    }

    public String geTrustOrgCity() {
        return trustOrgCity;
    }

    public void seTrustOrgCity(String trustOrgCity) {
        this.trustOrgCity = trustOrgCity;
    }

    public String getDonation() {
        return donation;
    }

    public void setDonation(String donation) {
        this.donation = donation;
    }

    public Date getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(Date donationDate) {
        this.donationDate = donationDate;
    }

    public DonorData getDonor() {
        return donor;
    }

    public void setDonor(DonorData donor) {
        this.donor = donor;
    }
        
}
