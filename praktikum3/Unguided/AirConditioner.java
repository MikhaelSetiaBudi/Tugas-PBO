/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.Unguided;

/**
 *
 * @author ACER
 */
// Kelas AirConditioner merepresentasikan sistem AC didalam mobil
public class AirConditioner {
    private boolean isOn; // Untuk menyimpan status AC
    
// Konstruktor untuk menginisialisasi AC dalam keadaan mati
    public AirConditioner() {
        this.isOn = false;
    }
    
// Metode untuk menyalakan AC
    public void turnOn() {
        isOn = true;
        System.out.println("AC mobil dinyalakan.");
    }
    
// Metode untuk mematikan AC
    public void turnOff() {
        isOn = false;
        System.out.println("AC mobil dimatikan.");
    }
}