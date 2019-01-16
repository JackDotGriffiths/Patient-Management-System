/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.feedback;

/**
 *
 * @author jack-
 */
public class Feedback {
    protected String UID = "UNKNOWN";
    protected String DoctorUIN = "UNKNOWN";
    protected int Rating = 0;
    protected String Feedback = "UNKNOWN";

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        //Assigned by script and therefore doesn't require validation.
        this.UID = UID;
    }

    public String getDoctorUIN() {
        return DoctorUIN;
    }

    public void setDoctorUIN(String DoctorUIN) {
        //Assigned by script and therefore doesn't require validation.
        this.DoctorUIN = DoctorUIN;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        if (Rating > 0){
            this.Rating = Rating;
        }
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String Feedback) {
        this.Feedback = Feedback;
    }
    
    
    
}
