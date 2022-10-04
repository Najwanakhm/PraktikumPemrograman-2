/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Prak103_2110817210006_ahmaddinnajwan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("masukan angka awal : ");
        int angkaAwal= input.nextInt();
        
        int i=5;
        
        do{
            
           if(angkaAwal %7 !=0){
               System.out.print(angkaAwal+",");
               
               i--;
            angkaAwal--;
           } 
           
        }
        while(i>0);
            
    }
            
}
