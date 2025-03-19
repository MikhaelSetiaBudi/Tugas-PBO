/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author ACER
 */
public class Patient {
   // Atribut untuk menyimpan nama pasien
    private String name;
   // Atribut untuk menyimpan usia pasien
    private int age;
   // Atribut untuk menyimpan diagnosis pasien (dalam bentuk terenkripsi)
    private String diagnosis;

   //Konstruktor untuk membuat objek Patient dengan nama, usia, dan diagnosis tertentu.
    public Patient(String name, int age, String diagnosis) {
        this.name = name;
        this.age = age;
        this.diagnosis = encryptDiagnosis(diagnosis);
    }
   
   // Mengembalikan nama pasien.
    public String getName() {
        return name;
    }

   // Mengembalikan usia pasien.
    public int getAge() {
        return age;
    }

   // Mengembalikan diagnosis pasien setelah didekripsi.
    public String getDiagnosis() {
        return decryptDiagnosis(diagnosis);
    }

   // Metode untuk mengenkripsi diagnosis dengan cara membalik string.
    private String encryptDiagnosis(String diagnosis) {
        return new StringBuilder(diagnosis).reverse().toString();
    }

   // Metode untuk mendekripsi diagnosis dengan cara membalik string kembali ke bentuk aslinya.
    private String decryptDiagnosis(String diagnosis) {
        return new StringBuilder(diagnosis).reverse().toString();
    }
}
