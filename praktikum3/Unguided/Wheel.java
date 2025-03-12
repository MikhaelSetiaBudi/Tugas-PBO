/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.Unguided;

/**
 *
 * @author ACER
 */
//Kelas Wheel digunakan untuk merepresentasikan roda mobil
public class Wheel {
     private int size; // Untuk menyimpan ukuran roda dalam bentuk inci

// Konstruksi untuk menginisialisasi ukuran roda
    public Wheel(int size) {
        this.size = size;
    }

// Metode untuk mendapatkan ukuran roda
    public int getSize() {
        return size;
    }
}
