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
        int andi1 = input.nextInt();
        int andi2 = input.nextInt();
        int andi3 = input.nextInt();
        
        
        System.out.print("Kartu Budi: ");
        int budi1 = input.nextInt();
        int budi2 = input.nextInt();
        int budi3 = input.nextInt();
        
        
        int andi = andi1+andi2+andi3;
        int budi = budi1+budi2+budi3;
        
        if(andi>budi){
            System.out.println("Andi");
        }
        else if(andi==budi){
        System.out.println("seri");
        }
        else{System.out.println("budi");}
        
        
        
        
    }
}
