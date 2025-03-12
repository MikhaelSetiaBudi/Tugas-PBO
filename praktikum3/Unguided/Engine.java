/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.Unguided;

/**
 *
 * @author ACER
 */

// kelas Engine merupakan kelas mesin mobilnya 
public class Engine {
    private String type; // Untuk menyimpan tipe mesin mobil dengan tipe data string
    private int horsepower; // Untuk menyimpan besarnya tenaga mesin dengan tipe data integer

// Konstruktor yang digunakan untuk menginisialisasi tipe mesin dan tenaga
    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

// Metode untuk mendapatkan tipe mesin
    public String getType() {
        return type;
    }
    
// Metode untuk mendapatkan tenaga mesin
    public int getHorsepower() {
        return horsepower;
    }

// Metode untuk menyalakan mesin mobilnya
    public void start() {
        System.out.println("Mesin " + type + " dengan " + horsepower + " HP dinyalakan.");
    }
}
