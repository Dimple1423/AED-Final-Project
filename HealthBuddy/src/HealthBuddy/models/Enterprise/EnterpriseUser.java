/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthBuddy.models.Enterprise;
import HealthBuddy.models.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author Dimple Patel
 */
public class EnterpriseUser {
    public EnterpriseUser(String name){
        super(name,EnterpriseClassification.User);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }    
}
