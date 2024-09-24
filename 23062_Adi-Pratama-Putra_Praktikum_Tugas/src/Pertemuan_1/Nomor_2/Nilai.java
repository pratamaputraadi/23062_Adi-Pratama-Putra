/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_1.Nomor_2;

/**
 * LATIHAN NOMOR 2
 * PERTEMUAN 1 - PEMROGRAMAN BERORIENTASI OBJEK
 * @author Adi Pratama Putra
 */

public class Nilai {
    String NIM, nama;
    double absen, tugas, UTS, UAS, akhir;
    
    void Nilai(int inputAbsen, int inputTugas, int inputUTS, int inputUAS, int inputAkhir){
        this.absen = inputAbsen;
        this.tugas = inputTugas;
        this.UTS = inputUTS;
        this.UAS = inputUAS;
        this.akhir = this.absen*(0.1) + this.tugas*(0.2) + this.UTS*(0.3) + this.UAS*(0.4);
    }
    
    void cetakNilai(){
        System.out.println("NIM               : " + this.NIM);
        System.out.println("Nama              : " + this.nama);
        System.out.println("Nilai Absen [10%] : " + this.absen);
        System.out.println("Nilai Tugas [20%] : " + this.tugas);
        System.out.println("Nilai UTS [30%]   : " + this.UTS);
        System.out.println("Nilai UAS [40%]   : " + this.UAS);
        System.out.println("Nilai Akhir       : " + this.akhir);
    }
    
}

// TERIMA KASIH - THANK YOU//