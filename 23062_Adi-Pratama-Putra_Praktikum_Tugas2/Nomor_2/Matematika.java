/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_2.Nomor_2;

/**
 * PERTEMUAN 2 - PEMROGRAMAN BERORIENTASI OBJEK
 * LATIHAN NOMOR 2
 * @author Adi Pratama Putra
 */

public class Matematika implements InterfaceMatematika {
    
    public int pertambahan(int a, int b) { //METHOD PENJUMLAHAN
        return a + b; // MENGEMBALIKAN NILAI HASIL PERTAMBAHAN A DAN B
    }

    public int pengurangan(int a, int b) { //METHOD PENGURANGAN
        return a - b; // MENGEMBALIKAN NILAI HASIL PENGURANGAN A DAN B
    }
    
    public int perkalian(int a, int b) { //METHOD PERKALIAN
        return a * b; // MENGEMBALIKAN NILAI HASIL PERKALIAN A DAN B
    }

    public int pembagian(int a, int b) { //METHOD PEMBAGIAN
        return a / b; // MENGEMBALIKAN NILAI HASIL PEMBAGIAN A DAN B
    }
}

// TERIMA KASIH - THANK YOU//