/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.Unguided;

/**
 *
 * @author ACER
 */
// Kelas Main yang digunakan untuk menjalankan program
public class Main {
   public static void main(String[] args) {
        Engine engine = new Engine("4N15", 181); // Membuat objek mesin
        Transmission transmission = new Transmission("Automatic", 6); // Membuat objek transmisi
        Wheel wheel = new Wheel(18); // Membuat objek roda
        FuelTank fuelTank = new FuelTank(68); // Membuat objek tangki bahan bakar
        AirConditioner airConditioner = new AirConditioner(); //Membuat objek AC mobil
        // Membuat objek mobildengan semua komponen
        Car myCar = new Car("Pajero Sports", engine, transmission, wheel, fuelTank, airConditioner);
        
        // Menyalakan mobil
        myCar.startCar();
    }
}