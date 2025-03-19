/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author ACER
 */
public class DiagnosisCounter {
    // Map untuk menyimpan jumlah kemunculan setiap diagnosis.
    private static Map<String, Integer> diagnosisCount = new HashMap<>();

    // Metode untuk menambahkan jumlah kemunculan suatu diagnosis.
    public static void incrementDiagnosis(String diagnosis) {
        // Membalik string diagnosis sebelum menyimpannya dalam Map.
        diagnosis = new StringBuilder(diagnosis).reverse().toString(); 
        // Menambahkan atau memperbarui jumlah diagnosis dalam Map
        diagnosisCount.put(diagnosis, diagnosisCount.getOrDefault(diagnosis, 0) + 1);
    }
    
    // Metode untuk mendapatkan jumlah kemunculan suatu diagnosis.
    public static int getDiagnosisCount(String diagnosis) {
        return diagnosisCount.getOrDefault(diagnosis, 0) + 1;
    }
 
}
