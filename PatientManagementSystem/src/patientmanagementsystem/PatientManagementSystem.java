/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

import patientmanagementsystem.users.CreateUser;

/**
 *
 * @author jack-
 */
public class PatientManagementSystem {


 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        //Create new User with UniqueID and Role
        String UniqueID = "1234";
        String Role = "Patient";
        
        
        CreateUser objCreateUser = 
            new CreateUser(UniqueID,Role,"Jeff","Smith","Male",23,"24,Whitewood Street");
        
        
        String strMessage = objCreateUser.getSurname();
        System.out.println(strMessage);
    }
    
}
