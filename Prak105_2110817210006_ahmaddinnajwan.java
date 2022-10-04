/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;
/**
 *
 * @author LENOVO
 */
public class Prak105_2110817210006_ahmaddinnajwan {
    
    public static void main(String[] args) {
        
 
        double jari, tinggi, hasil;
        
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("#.###");
        
        System.out.print("Masukkan jari-jari : ");
        jari = keyboard.nextDouble();
        
        System.out.print("Masukkan tinggi : ");
        tinggi = keyboard.nextDouble();
        
        hasil = 3.14 * jari * jari * tinggi;
        
        System.out.println("Volume tabung dengan jari-jari " + jari + " cm ");
        System.out.println("dan tinggi " + tinggi + " cm ");
        System.out.println("adalah " + df.format(hasil) + " m3");
    
    }
}
