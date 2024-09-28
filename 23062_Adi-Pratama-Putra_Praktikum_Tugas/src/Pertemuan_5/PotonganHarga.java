/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_5;
import java.util.Scanner;

/**
 * PERTEMUAN 5 - PEMROGRAMAN BERORIENTASI OBJEK
 * LATIHAN NOMOR 2
 * @author Adi Pratama Putra
 */

public class PotonganHarga {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        System.out.print("TOTAL PEMBELIAN               : "); // INPUT TOTAL HARGA PEMBELIAN
        double harga = input.nextDouble();
        
        // MENENTUKAN DISKON DENGAN MENYESUAIKAN TOTAL HARGA PEMBELIAN
        double diskon;
        // JIKA TOTAL HARGA PEMBELIAN SAMA ATAU DIATAS 50 RIBU MAKA MENDAPATKAN DISKON 20%
        if (harga >= 50000) {
            diskon = (harga * 0.2);
        // JIKA TOTAL HARGA PEMBELIAN DIBAWAH 50 RIBU MAKA MENDAPATKAN DISKON 5%
        } else if (harga > 0 && harga < 50000) {
            diskon = harga * 0.05;
        // HARGA YANG DIINPUT TIDAK VALID
        } else {
            System.out.println("HARGA YANG ANDA INPUT TIDAK VALID");
            return;
        }
        
        // MENGHITUNG HARGA YANG PERLU DIBAYARKAN
        double bayar = harga - diskon;
        
        // OUTPUT NOMINAL TOTAL HARGA SETELAH DIPOTONG DISKON
        System.out.println("JUMLAH DISKON                 : " + diskon);
        // OUTPUT NOMINAL TOTAL HARGA SETELAH DIPOTONG DISKON
        System.out.println("NOMINAL YANG HARUS DIBAYARKAN : " + bayar);
        
        System.out.println(" ");
    }
}

// TERIMA KASIH - THANK YOU //