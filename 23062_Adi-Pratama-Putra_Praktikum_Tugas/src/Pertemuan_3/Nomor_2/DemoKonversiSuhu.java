/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_3.Nomor_2;

/**
 *
 * @author Adi Pratama Putra
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();

        int cToF = konversi.celciusToFahrenheit (20);
        int cToR = konversi.celciusToReamur(20);
        int fToR = konversi.fahrenheitToReamur(20);
        
        System.out.println("Konversi : 20 C to F = " + cToF);
        System.out.println("Konversi : 20 C to R = " + cToR);
        System.out.println("Konversi : 20 F to R = " + fToR);
        
    }
}