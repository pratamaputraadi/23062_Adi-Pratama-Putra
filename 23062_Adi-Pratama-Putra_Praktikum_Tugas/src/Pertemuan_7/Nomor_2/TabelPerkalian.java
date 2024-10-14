/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_7.Nomor_2;
import java.util.Scanner;

/**
 * PERTEMUAN 7 - PEMROGRAMAN BERORIENTASI OBJEK
 * LATIHAN NOMOR 2
 * @author Adi Pratama Putra
 */

public class TabelPerkalian {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // INPUT NILAI N = 1-10
        System.out.print("SILAHKAN INPUT NILAI" + " N" + " : ");
        int n = input.nextInt();
        
        // OUTPUT DARI N YANG DIMINTA
        System.out.print("\nNILAI N = " + n);
        System.out.print("\n");
        
        // JIKA N BUKAN DIANTARA 1-10
        if (n > 10 || n < 1) {
        System.out.println("INPUT INVALID!, NILAI N HARUS DIANTARA 1 HINGGA 10");
        
        // JIKA N DIANTARA 1-10
        } else {
            // MEMBUAT TABEL PERKALIAN
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t"); // \t ADALAH TAB AGAR TABEL LEBIH RAPIH
                }
            }
        }        
                
        System.out.print("\n\n");
    }
}

// TERIMA KASIH - THANK YOU //