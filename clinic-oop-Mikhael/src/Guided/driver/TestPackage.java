/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided.driver;
import Guided.hargabuku.KelasHarga;
import Guided.hargatoken.KelasToken;

/**
 *
 * @author ACER
 */
public class TestPackage {
    public static void main(String[] args){
        KelasToken token = new KelasToken();
        KelasHarga harga = new KelasHarga();
        token.info();
        harga.info();
    }
}
