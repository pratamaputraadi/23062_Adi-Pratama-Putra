/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_7.Nomor_1;

/**
 * PERTEMUAN 7 - PEMROGRAMAN BERORIENTASI OBJEK
 * LATIHAN NOMOR 1A
 * @author Adi Pratama Putra
 */

public class BilPrimaDanNon {
    public static boolean bilanganPrima(int bilangan) {
        
        // ANGKA 0 DAN 1 MERUPAKAN BILANGAN NON-PRIMA
        if (bilangan <= 1) return false;
        // PERULANGAN ANGKA
        for (int b = 2; b < bilangan; b++) {
        // ANGKA YANG DAPAT DIBAGI HABIS OLEH B = NON-PRIMA
            if (bilangan % b == 0) return false;
        }
        return true;
        // ANGKA LAINNYA = PRIMA
    }

    public static void main(String[] args) {
        
        // BILANGAN PRIMA
        System.out.print("BILANGAN DIBAWAH INI : ");
        // PERULANGAN MENAMPILKAN 1-20
        for (int b = 0; b <= 20; b++) {
        // bilanganPrima = BILANGAN PRIMA    
        if (bilanganPrima(b)) System.out.print("\n" + b + " Merupakan Bilangan PRIMA");
        }
        
        // BILANGAN NON-PRIMA
        System.out.print("\n\nBILANGAN DIBAWAH INI : ");
        // PERULANGAN MENAMPILKAN 1-20
        for (int b = 0; b <= 20; b++) { 
        // !bilanganPrima = BILANGAN NON-PRIMA    
        if (!bilanganPrima(b)) System.out.print("\n" + b + " Merupakan Bilangan NON-PRIMA");
        }
        
        System.out.print("\n\n");
    }
}

// TERIMA KASIH - THANK YOU //