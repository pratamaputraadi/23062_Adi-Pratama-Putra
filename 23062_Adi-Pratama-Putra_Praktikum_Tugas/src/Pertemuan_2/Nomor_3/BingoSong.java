/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_2.Nomor_3;

/**
 * LATIHAN NOMOR 3
 * PERTEMUAN 2 - PEMROGRAMAN BERORIENTASI OBJEK
 * @author Adi Pratama Putra
 */

public class BingoSong {

    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            BingoLyrics bingo = new BingoLyrics(i);
            bingo.lyrics();
        }
    }
}

// TERIMA KASIH - THANK YOU//