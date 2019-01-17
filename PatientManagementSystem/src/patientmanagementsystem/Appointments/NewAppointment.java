/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.Appointments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jack-
 */
public class NewAppointment extends Appointment{
    
    public String path = "Appointments.txt";
    
    public NewAppointment(String state,String doctorid,String patientid,Date dateofAppointment,String notes){
        this.AppointmentID = "X" + GenerateUIN();
        this.State = state;
        this.DoctorID = doctorid;
        this.PatientID = patientid;
        this.DateofAppointment = dateofAppointment;
        this.Notes = notes;
        
        String Entry = this.AppointmentID + "," + this.State + "," + this.DoctorID + "," + this.PatientID + "," + this.DateofAppointment + "," + this.Notes;
        
        try {
                SaveToFile(Entry);
            }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        
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
            br = new BufferedReader(new FileReader(path));       
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
        FileWriter write = new FileWriter(path,true);
        PrintWriter print_line = new PrintWriter(write);
        
        print_line.printf("%s" + "%n", text);
        
        print_line.close();
      
    }
}
