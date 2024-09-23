/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_4.Nomor_1;

/**
 * LATIHAN NOMOR 1
 * PERTEMUAN 4 - PEMROGRAMAN BERORIENTASI OBJEK
 * @author Adi Pratama Putra
 */

public class BangunRuang {
    int volume(int panjang, int lebar, int tinggi){
    return panjang * lebar * tinggi ;
    }
    
    int volume(int sisi){
    return sisi * sisi * sisi ;
    }
    
    int luasPermukaan(int panjang, int lebar, int tinggi){
    return 2 * ( panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
    
    int luasPermukaan(int sisi){
    return 6 * ( sisi * sisi );
    }
    
}
// TERIMA KASIH - THANK YOU //
