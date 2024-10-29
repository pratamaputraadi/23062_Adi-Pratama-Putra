/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_8;
import java.util.Scanner;

/**
 * PERTEMUAN 8 - PEMROGRAMAN BERORIENTASI OBJEK
 * LATIHAN NOMOR 1
 * @author Adi Pratama Putra
 */

public class TokoSerbaAda {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // DATA KODE BARANG, NAMA BARANG, HARGA BARANG
        String[] kodeItem = {"a001", "a002", "a003"};
        String[] namaItem = {"Buku  ", "Pensil", "Pulpen"};
        int[] hargaItem = {3000, 4000, 5000};
        
        
        // OUTPUT BAGIAN JUDUL
        System.out.println("==============================================");
        System.out.println("=============== TOKO SERBA ADA ===============");
        System.out.println("==============================================");
        
        // INPUT JUMLAH ITEM YANG INGIN DIBELI
        System.out.print("\nMASUKKAN ITEM BARANG : ");
        int jumlahBarang = input.nextInt();
        
        // ARRAY PENYIMPAN DATA KODE BARANG DAN JUMLAH BELI
        String[] kodeBarang = new String[jumlahBarang];
        int[] jumlahBeli = new int[jumlahBarang], totalHarga = new int[jumlahBarang];
        
        // INPUT KODE & JUMLAH PEMBELIAN
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("\n> DATA KE-" + (i + 1));
            System.out.print("> MASUKKAN KODE        : ");
            kodeBarang[i] = input.next();
            System.out.print("> MASUKKAN JUMLAH BELI : ");
            jumlahBeli[i] = input.nextInt();
        }

        // OUTPUT TABEL
        System.out.println("\n==============================================");
        System.out.println("NO  KODE    NAMA      HARGA   JUMLAH   TOTAL");
        System.out.println("==============================================");
        
        int totalBayar = 0;
        
        // MENAMPILKAN & MENGHITUNG BARANG YANG DIBELI
        for (int i = 0; i < jumlahBarang; i++) {
            String kode = kodeBarang[i];
            String nama = "";
            int harga = 0;
            
            //  MENENTUKAN HARGA DAN NAMA BARANG SESUAI KODE BARANG
            if (kode.equals(kodeItem[0])) {
                nama = namaItem[0];
                harga = hargaItem[0];
            } else if (kode.equals(kodeItem[1])) {
                nama = namaItem[1];
                harga = hargaItem[1];
            } else if (kode.equals(kodeItem[2])) {
                nama = namaItem[2];
                harga = hargaItem[2];
                
            // JIKA ADA KODE YANG INVALID
            } else {
                System.out.println("> INVALID KODE : " + kode);
            }
            
            // MENGHITUNG TOTAL HARGA PER-ITEM DAN TOTAL HARGA SELURUH ITEM
            totalHarga[i] = harga * jumlahBeli[i];
            totalBayar += totalHarga[i];
            
            // OUTPUT DATA PER-ITEM = KODE, NAMA, HARGA, JUMLAH ITEM, TOTAL HARGA PER-ITEM
            System.out.println((i + 1) + "   " + kode + "    " + nama + "    " + harga + "      " + jumlahBeli[i] + "      " + totalHarga[i]);
        }
        
        // OUTPUT TOTAL BAYAR
        System.out.println("==============================================");
        System.out.println("> TOTAL BAYAR                        : " + totalBayar);
        System.out.println("==============================================");
    }
}

// TERIMA KASIH - THANK YOU //