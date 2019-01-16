/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.users;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
        String UserIDNumber = "UNKNOWN";
        UserIDNumber = GenerateUIN();
       
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
        Integer previoususerID = 0;
        BufferedReader br;
        Integer linenumber = 1;
        String last = "", line = "";
        
        try{
            br = new BufferedReader(new FileReader("Users.txt"));       
            while((line = br.readLine()) != null){
                last = line;
                linenumber++;
            }

            br.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e,"ERROR",JOptionPane.OK_CANCEL_OPTION);
        }
        
        
        if (!last.isEmpty()){
            System.out.println(last);
            String[] lastuserFields = last.split(",");
            previoususerID = Integer.valueOf(lastuserFields[0].substring(1,5));
            amount = previoususerID + 1;
        }
        
        
        
        if (amount > 0){          
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
