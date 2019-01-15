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
public class CreateUser extends User{
    
    public CreateUser(String uid, String Role,String name,String surname,String gender,Integer age,String address){
        this.Name = name;
        this.Surname = surname;
        this.Gender = gender;
        this.Age = age;
        this.Address = address;
        
    }
}
