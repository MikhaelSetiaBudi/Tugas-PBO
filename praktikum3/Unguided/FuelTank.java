/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.Unguided;

/**
 *
 * @author ACER
 */
// Kelas FuelTank merupakan kelas tangki bahan bakar mobil
public class FuelTank {
    private int capacity; // Digunakan untuk menyimpan kapasitas tangki bahan bakar dlam satuan liter

// Konstruktor untuk menginisialisasi kapasitas tangki
    public FuelTank(int capacity) {
        this.capacity = capacity;
    }
    
// Metode untuk mendapatkan kapasitas tangki bahan bakar mobil
    public int getCapacity() {
        return capacity;
    }
}
