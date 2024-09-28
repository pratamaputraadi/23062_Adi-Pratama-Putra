/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_5;
import java.util.Scanner;

/**
 * PERTEMUAN 5 - PEMROGRAMAN BERORIENTASI OBJEK
 * LATIHAN NOMOR 1
 * @author Adi Pratama Putra
 */

public class IndeksPrestasi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // INPUT DATA MAHASISWA & NILAI MAHASISWA
        
        System.out.println("----------------- INPUT ------------------");
        
        System.out.print("NPM             : "); // INPUT NPM
        String npm = input.nextLine();
    
        System.out.print("Nama Mahasiswa  : "); // INPUT NAMA
        String nama = input.nextLine();
    
        System.out.print("Nilai Kehadiran : "); // INPUT NILAI KEHADIRAN
        double absen = input.nextDouble();
    
        System.out.print("Nilai Tugas     : "); // INPUT NILAI TUGAS
        double tugas = input.nextDouble();
    
        System.out.print("Nilai UTS       : "); // INPUT NILAI UTS
        double uts = input.nextDouble();
    
        System.out.print("Nilai UAS       : "); // INPUT NILAI UAS
        double uas = input.nextDouble();
        
        System.out.println("------------------------------------------");
        
        // MENGHITUNG NILAI AKHIR ( RATA - RATA )
        double nilaiAkhir = (0.1 * absen) + (0.2 * tugas) + (0.3 * uts) + (0.4 * uas);
        
        // MENENTUKAN GRADE DENGAN MENYESUAIKAN NILAI AKHIR
        char grade;
        if (nilaiAkhir > 75 && nilaiAkhir < 101) { // JIKA NILAI 76-100 MENDAPATKAN GRADE "A"
            grade = 'A';
        } else if (nilaiAkhir > 65 && nilaiAkhir < 76) { // JIKA NILAI 66-75 MENDAPATKAN GRADE "B"
            grade = 'B';
        } else if (nilaiAkhir > 55 && nilaiAkhir < 66) { // JIKA NILAI 56-65 MENDAPATKAN GRADE "C"
            grade = 'C';
        } else if (nilaiAkhir > 45 && nilaiAkhir < 56) { // JIKA NILAI 46-55 MENDAPATKAN GRADE "D"
            grade = 'D';
        } else if (nilaiAkhir >= 0 && nilaiAkhir < 46) { // JIKA NILAI 0-45 MENDAPATKAN GRADE "E"
            grade = 'E';
        } else if (nilaiAkhir > 100 && nilaiAkhir < 0) { // NILAI YANG ANDA INPUT TIDAK VALID
            grade = '?';
        } else { // NILAI YANG ANDA INPUT TIDAK VALID
            grade = '?';
        }
        
        // MENENTUKAN KETERANGAN DENGAN MENYESUAIKAN NILAI AKHIR
        String keterangan;
        if (nilaiAkhir > 75 && nilaiAkhir < 101) { // JIKA NILAI 76-100 MENDAPATKAN KETERANGAN "ISTIMEWA"
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir > 65 && nilaiAkhir < 76) { // JIKA NILAI 66-75 MENDAPATKAN KETERANGAN "BAIK"
            keterangan = "BAIK";
        } else if (nilaiAkhir > 55 && nilaiAkhir < 66) { // JIKA NILAI 56-65 MENDAPATKAN KETERANGAN "CUKUP"
            keterangan = "CUKUP";
        } else if (nilaiAkhir > 45 && nilaiAkhir < 56) { // JIKA NILAI 46-55 MENDAPATKAN KETERANGAN "KURANG"
            keterangan = "KURANG";
        } else if (nilaiAkhir >= 0 && nilaiAkhir < 46) { // JIKA NILAI 0-45 MENDAPATKAN KETERANGAN "KURANG SEKALI"
            keterangan = "KURANG SEKALI";
        } else if (nilaiAkhir > 100 && nilaiAkhir < 0) { // NILAI YANG ANDA INPUT TIDAK VALID
            keterangan = "NILAI YANG ANDA INPUT TIDAK VALID";
        } else { // NILAI YANG ANDA INPUT TIDAK VALID
            keterangan = "NILAI YANG ANDA INPUT TIDAK VALID";
        }
   
        // OUTPUT
        System.out.println("\n\n----------------- OUTPUT -----------------");
        System.out.println("NPM Mahasiswa   : " + npm); // OUTPUT NPM
        System.out.println("Nama Mahasiswa  : " + nama); // OUTPUT NAMA
        System.out.println("Nilai Rata-rata : " + nilaiAkhir); // OUTPUT NILAI AKHIR
        System.out.println("Grade           : " + grade); // OUTPUT GRADE
        System.out.println("Keterangan      : " + keterangan); // OUTPUT KETERANGAN
        System.out.println("------------------------------------------");
    }  
}

// TERIMA KASIH - THANK YOU //