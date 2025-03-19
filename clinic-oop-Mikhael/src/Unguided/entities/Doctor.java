/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ACER
 */
public class Doctor {
    // Atribut untuk menyimpan nama dokter
    private String name;
    // Atribut untuk menyimpan spesialisasi dokter
    private String specialization;
    // Daftar janji temu yang dimiliki oleh dokter
    private List<Appointment> appointments;

    // Konstruktor untuk membuat objek Doctor dengan nama dan spesialisasi tertentu.
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.appointments = new ArrayList<>(); // Inisialisasi daftar janji temu
    }

    // Mengembalikan nama dokter
    public String getName() {
        return name;
    }

    // Mengembalikan spesialisasi dokter.
    public String getSpecialization() {
        return specialization;
    }

    // Menambahkan janji temu ke daftar janji temu dokter.
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
    
    // Mengembalikan daftar janji temu dokter.
    public List<Appointment> getAppointments() {
        return appointments;
    }
}
