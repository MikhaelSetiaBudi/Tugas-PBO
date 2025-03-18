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
   private String name;
    private int age;
    private String diagnosis;

    public Patient(String name, int age, String diagnosis) {
        this.name = name;
        this.age = age;
        this.diagnosis = encryptDiagnosis(diagnosis);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return decryptDiagnosis(diagnosis);
    }

    private String encryptDiagnosis(String diagnosis) {
        return new StringBuilder(diagnosis).reverse().toString();
    }

    private String decryptDiagnosis(String diagnosis) {
        return new StringBuilder(diagnosis).reverse().toString();
    }
}
