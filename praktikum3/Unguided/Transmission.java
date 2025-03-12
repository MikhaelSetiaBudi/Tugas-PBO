/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.Unguided;

/**
 *
 * @author ACER
 */
// Kelas Transmission merupakan kelas sistem transmisi mobil
public class Transmission {
    private String type; // Untuk menyimpan jenis transmisi dengan tipe data string
    private int gears; // Untuk  menyimpan jumlah gigi transmisi dengan tipe data integer

// Konstruktor untuk menginisialisasi tipe transmisi dan jumlah gigi mobilnya
    public Transmission(String type, int gears) {
        this.type = type;
        this.gears = gears;
    }

// Metode untuk mendapatkan tipe transmisi
    public String getType() {
        return type;
    }
    
// Metode untuk mendapatkan jumlah gigi transmisi
    public int getGears() {
        return gears;
    }
}

