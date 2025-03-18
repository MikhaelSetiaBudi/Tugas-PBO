/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided;

/**
 *
 * @author ACER
 */
public class Cat extends Animal {
    @Override
    public void bark(){
        System.out.println("Meonggg uhuyyy");
    }
    public static void main(String[] args){
        Cat gurame = new Cat();
        gurame.bark();
    }
}
