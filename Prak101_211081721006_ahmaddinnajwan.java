/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author LENOVO
 */
public class Prak101_211081721006_ahmaddinnajwan {
    
    public static void main(String[] args) {
       
        Scanner input= new Scanner(System.in).useLocale(Locale.US);
        int bulan;
        String bulanLahir = null;
        
        System.out.print("Masukan Nama Lengkap :");
        String nama= input.nextLine();
        
        System.out.print("Masukan Tempat Lahir :");
        String tempatLahir= input.nextLine();
        
        System.out.print("Masukan Tanggal Lahir :");
        int tanggalLahir= input.nextInt();
        
        System.out.print("Masukan bulan Lahir :");
        bulan= input.nextInt();
        
           if (bulan == 1) bulanLahir = "Januari";
        else if(bulan == 2) bulanLahir = "Februari";
        else if(bulan == 3) bulanLahir = "Maret";
        else if(bulan == 4) bulanLahir = "April";
        else if(bulan == 5) bulanLahir = "Mei";
        else if(bulan == 6) bulanLahir = "Juni";
        else if(bulan == 7) bulanLahir = "Juli";
        else if(bulan == 8) bulanLahir = "Agustus";
        else if(bulan == 9) bulanLahir = "September";
        else if(bulan == 10) bulanLahir = "Oktober";
        else if(bulan == 11) bulanLahir = "November";
        else if(bulan == 12) bulanLahir = "Desember";
        
        System.out.print("Masukan Tahun Lahir :");
        int tahunLahir= input.nextInt();
        
        System.out.print( "Masukan Tinggi Badan :");
        int tinggiLahir= input.nextInt();
        
        System.out.print("Masukan Berat Badan: ");
        float berat= input.nextFloat();
        
        System.out.println("\n");
        
        System.out.println("Data Telah Ditambahkan :");
        
        System.out.println("Nama Lengkap"+" "+ nama+" "+"Lahir di"+" "+tempatLahir
        +" "+"pada Tanggal"+" "+ tanggalLahir+" "+ bulanLahir +" "+ tahunLahir+
         "\n"+"Tinggi Badan"+" "+tinggiLahir+" "+"cm dan Berat Badan"+" "+berat+" "+ "kilogam");
      
        //System.out.format("Nama Lengkap %s, Lahir di %s Pada Tanggal %d %s %d\n",nama, tempatLahir, tanggalLahir, bulanLahir, tahunLahir);
        //System.out.format("Tinggi Badan %dcm dan berat badan %.2fkg",tinggiLahir,berat );
        
        
    }
}
