/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_7.Nomor_1;

/**
 * PERTEMUAN 7 - PEMROGRAMAN BERORIENTASI OBJEK
 * LATIHAN NOMOR 1B
 * @author Adi Pratama Putra
 */

public class BilGanjilDanGenap {
     public static void main(String[] args) {
         
        // BILANGAN GANJIL
        System.out.print("BILANGAN DIBAWAH INI : ");
        // PERULANGAN MENAMPILKAN BILANGAN 1-20
        for (int g = 0; g <= 20; g++) {
        
        // JIKA TIDAK HABIS DIBAGI 2 = GANJIL
        if (g % 2 != 0) { 
        System.out.print("\n" + g + " Merupakan Bilangan GANJIL");
        }
        
        // JIKA HABIS DIBAGI 2 = GENAP
        else {
        System.out.print("\n" + g + " Merupakan Bilangan GENAP");  
        }

        } 
    
     System.out.print("\n");   
     }
}

// TERIMA KASIH - THANK YOU //
