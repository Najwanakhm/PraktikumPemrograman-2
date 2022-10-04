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
public class Prak102_2110817210006_ahmaddinnajwan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int bilangan;
        
        System.out.println("Masukan angka awal :");
        int angkaAwal= input.nextInt();
        
        int i =6 ;
        while(i>=0){
          if( angkaAwal%2==0){
             bilangan= (angkaAwal/2) -1;
              
          }
          else{ bilangan=angkaAwal;
          }
          
         i--;
          angkaAwal++;
          
          if (i==7){
              System.out.print(bilangan);
          }
          else{System.out.print(bilangan+",");
          }
          
           
          }
        
        
        
    }
            
}
