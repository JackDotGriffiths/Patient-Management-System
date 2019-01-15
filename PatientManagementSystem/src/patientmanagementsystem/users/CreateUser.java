/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.users;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author jack-
 */
public class CreateUser extends User{
    
    public String path = "Users.txt";
    private boolean append_to_file = true;
    
    public CreateUser(String Role,String name,String surname,String gender,String dob,String address,String password){
        this.Name = name;
        this.Surname = surname;
        this.Gender = gender;
        this.DoB = dob;
        this.Address = address; 
        this.Password = password;
        
        
        //Retrieve UserID and Format Correctly.
        String UserIDNumber = GenerateUIN();
        String UserID = Role.charAt(0) + UserIDNumber;
        
        //Formats the UserID Correctly.   
        String entireEntry = UserID + "," + Role + "," + this.Name  + "," + this.Surname  + "," + this.Gender  + "," + this.DoB  + "," + this.Address + "," + this.Password;
        
        //Saves Data to .txt File.
        try {
                SaveToFile(entireEntry);
            }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        JOptionPane.showMessageDialog(null, "User Saved. User ID = " + UserID,"User Saved",JOptionPane.OK_CANCEL_OPTION);
    }
    public String GenerateUIN(){
        //Counts the amount of lines in the file, giving an UID for the new user.
        long amount = 0;
        String UIN ="";
        
        try{
            amount = Files.lines(Paths.get(path)).count();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        
        if (amount > 0){
            System.out.println(amount);
            
            DecimalFormat df = new DecimalFormat("0000");
            
            UIN = df.format(amount);
            
            
        }
        else
        {
            UIN = "0000";
        }
        return UIN;
    }
    public void SaveToFile(String text) throws IOException{
        //Saves the text that's passed in to the Text File.
        FileWriter write = new FileWriter(path,append_to_file);
        PrintWriter print_line = new PrintWriter(write);
        
        print_line.printf("%s" + "%n", text);
        
        print_line.close();
      
    }
    
}
