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
    private static Map<String, Integer> diagnosisCount = new HashMap<>();

    public static void incrementDiagnosis(String diagnosis) {
        diagnosis = new StringBuilder(diagnosis).reverse().toString(); 
        diagnosisCount.put(diagnosis, diagnosisCount.getOrDefault(diagnosis, 0) + 1);
    }

    public static int getDiagnosisCount(String diagnosis) {
        return diagnosisCount.getOrDefault(diagnosis, 0) + 1;
    }
 
}
