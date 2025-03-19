/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.main;

import Unguided.entities.Appointment;
import Unguided.entities.DataChecker;
import Unguided.entities.DiagnosisCounter;
import Unguided.entities.Doctor;
import Unguided.entities.Patient;

/**
 *
 * @author ACER
 */
public class Main {
      public static void main(String[] args) {
      // Membuat objek dokter dengan nama dan spesialisasi
        Doctor doctor1 = new Doctor("Dr. John Doe", "Cardiology");
        Patient patient1 = new Patient("Bruno Smith", 30, "Heart Arrhythmia");
      // Membuat objek pasien dengan nama, usia, dan diagnosis
        Doctor doctor2 = new Doctor("Dr. Mike Reu", "Endocrine");
        Patient patient2 = new Patient("Kevin Brown", 40, "Diabetes");

      // Memeriksa validitas umur pasien sebelum membuat janji temu
        if (DataChecker.validatePatientAge(patient1.getAge())) {
            // Membuat janji temu antara dokter dan pasien dengan tanggal tertentu
            Appointment appointment1 = new Appointment(doctor1, patient1, "2025-03-18");
            doctor1.addAppointment(appointment1);
            Appointment appointment2 = new Appointment(doctor2, patient2, "2025-05-1");
            doctor2.addAppointment(appointment2);
              
            // Menampilkan informasi rumah sakit
            System.out.println("Data Rumah Sakit:");
            // Menampilkan informasi dokter pertama dan pasiennya
            System.out.println("Doctor: " + doctor1.getName() + " | Specialization: " + doctor1.getSpecialization());
            System.out.println("Patient: " + patient1.getName() + " | Age: " + patient1.getAge() + " | Diagnosis: " + patient1.getDiagnosis());
            System.out.println("Appointment Date: " + appointment1.getDate());
            System.out.println("Diagnosis Count for 'Heart Arrhythmia': " + DiagnosisCounter.getDiagnosisCount("Heart Arrhythmia"));

            // Menampilkan informasi dokter kedua dan pasiennya
            System.out.println("\n");
            System.out.println("Doctor: " + doctor2.getName() + " | Specialization: " + doctor2.getSpecialization());
            System.out.println("Patient: " + patient2.getName() + " | Age: " + patient2.getAge() + " | Diagnosis: " + patient2.getDiagnosis());
            System.out.println("Appointment Date: " + appointment2.getDate());
            System.out.println("Diagnosis Count for 'Diabetes': " + DiagnosisCounter.getDiagnosisCount("Diabetes"));
        } 
    }
}
