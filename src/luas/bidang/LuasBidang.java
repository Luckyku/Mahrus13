/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luas.bidang;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class LuasBidang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int persegi; int lingkaran; int segitiga;
        int pilihan; int hasil; int luas; int alas; int tinggi; int lebar, panjang; 
        int jari; double hasil2;
        
        
        System.out.println("Luas Bidang Apakah yang ingin kamu hitung?");
        System.out.println("Pilihan : 1 Persegi, 2 Segitiga, 3 Lingkaran.");
        Scanner scan = new Scanner(System.in);
        
        pilihan = scan.nextInt();
        if (pilihan == 1){
        System.out.println("Berapa Panjangnya?");
        panjang = scan.nextInt();
        System.out.println("Berapa Lebarnya?");
        lebar =scan.nextInt();
        hasil = panjang*lebar;              
        System.out.println("Luas Persegi = " + hasil);}
        
        if  (pilihan == 2){
        System.out.println("Berapa Alasnya?");
        alas=scan.nextInt();
        System.out.println("Berapa tingginya?");
        tinggi=scan.nextInt();
         
        hasil2=  alas * tinggi * 0.5;
        System.out.println("Hasilnya  = "+ hasil2);}
        
                
                     
     
    }
    
}
