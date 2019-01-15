/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.users;

/**
 *
 * @author jack-
 */
public class User {
    protected String UID = "UNKNOWN";
    protected String Role = "UNKNOWN";
    protected String Name = "UNKNOWN";
    protected String Surname = "UNKNOWN";
    protected String Gender = "UNKNOWN";
    protected String DoB = "UNKNOWN";
    protected String Address = "UNKNOWN";
    protected String Password = "UNKNOWN";

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        // Assigned by Script and therefore doesn't require validation.
        this.UID = UID;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        // Assigned by Script and therefore doesn't require validation.
        this.Role = Role;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        if(Name != null && !Name.isEmpty()){
            this.Name = Name;
        }
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        if(Surname != null && !Surname.isEmpty()){
            this.Surname = Surname;
        }
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        if(Gender != null && !Gender.isEmpty() ){
            this.Gender = Gender;
        }
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String DoB) {
        if(DoB != null && !DoB.isEmpty()){
            this.DoB = DoB;
        }
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        if(Address != null && !Address.isEmpty()){
           this.Address = Address; 
        }
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    
}
