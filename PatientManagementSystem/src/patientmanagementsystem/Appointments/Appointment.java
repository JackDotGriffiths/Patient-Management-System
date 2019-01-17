/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.Appointments;

import java.util.Date;

/**
 *
 * @author jack-
 */
public class Appointment {
    protected String AppointmentID;
    protected String State;
    protected String DoctorID;
    protected String PatientID;
    protected Date DateofAppointment;
    protected String Notes;

    public String getAppointmentID() {
        return AppointmentID;
    }

    public void setAppointmentID(String AppointmentID) {
        this.AppointmentID = AppointmentID;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(String DoctorID) {
        this.DoctorID = DoctorID;
    }

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public Date getDateofAppointment() {
        return DateofAppointment;
    }

    public void setDateofAppointment(Date DateofAppointment) {
        this.DateofAppointment = DateofAppointment;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }
    
    
}
