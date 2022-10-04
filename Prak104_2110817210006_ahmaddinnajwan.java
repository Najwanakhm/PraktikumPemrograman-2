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
public class Prak104_2110817210006_ahmaddinnajwan {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.print("Kartu Andi:");
        int A1 = input.nextInt();
        int A2 = input.nextInt();
        int A3 = input.nextInt();
        
        
        System.out.print("Kartu Budi: ");
        int B1 = input.nextInt();
        int B2 = input.nextInt();
        int B3 = input.nextInt();
        
        
        int andi = A1+A2+A3;
        int budi = B1+B2+B3;
        
        if(andi>budi){
            System.out.println("Andi");
        }
        else if(andi==budi){
        System.out.println("seri");
        }
        else{System.out.println("budi");}
        
        
        
        
    }
}
