/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author ACER
 */
public class Appointment {
    // Atribut untuk menyimpan informasi dokter yang terlibat dalam janji temu
    private Doctor doctor;
    // Atribut untuk menyimpan informasi pasien yang terlibat dalam janji temu
    private Patient patient;
    // Atribut untuk menyimpan tanggal janji temu dalam format string
    private String date;
    
    // Konstruktor untuk membuat objek Appointment dengan dokter, pasien, dan tanggal tertentu.
    public Appointment(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }
    
    // Mengembalikan dokter yang terlibat dalam janji temu.
    public Doctor getDoctor() {
        return doctor;
    }
    
    // Mengembalikan pasien yang terlibat dalam janji temu.
    public Patient getPatient() {
        return patient;
    }
    
    // Mengembalikan tanggal janji temu.
    public String getDate() {
        return date;
    }
}
