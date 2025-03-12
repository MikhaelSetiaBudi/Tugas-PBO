/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.Unguided;

/**
 *
 * @author ACER
 */
// kelas Car merepresentasikan mobil secara keseluruhan
public class Car {
  private String brand; // Untuk menyimpan merek mobil
    private Engine engine; // Untuk menyimpan Engine yang dimiliki mobil
    private Transmission transmission; // Untuk menyimpan Transmission pada mobil
    private Wheel wheel; // untuk menyimpan Wheel yang dimiliki mobil
    private FuelTank fuelTank; // Untuk menyimpan FuelTank yang dimiliki oleh mobil
    private AirConditioner airConditioner; // Untuk menyimpan AirConditioner 
    
// konstruktor untuk menginisialisasi mobil dengan semua komponen
    public Car(String brand, Engine engine, Transmission transmission, Wheel wheel, FuelTank fuelTank, AirConditioner airConditioner) {
        this.brand = brand;
        this.engine = engine;
        this.transmission = transmission;
        this.wheel = wheel;
        this.fuelTank = fuelTank;
        this.airConditioner = airConditioner;
    }
    
// Metode untuk menyalakan mobil
     public void startCar() {
        System.out.println("Mobil " + brand + " sedang dinyalakan");
        engine.start();
        airConditioner.turnOn();
        System.out.println("Mobil siap digunakan dengan transmisi " + transmission.getType() + " dan " + transmission.getGears() + " gigi.");
        System.out.println("Mobil menggunakan roda ukuran " + wheel.getSize() + " inci dan memiliki kapasitas bahan bakar " + fuelTank.getCapacity() + " liter.");
    }
}
