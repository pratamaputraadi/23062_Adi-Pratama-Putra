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
        BingoLyrics zeroClap = new BingoLyrics(5);
        zeroClap.lyrics();
        BingoLyrics firstClap = new BingoLyrics(4);
        firstClap.lyrics();
        BingoLyrics secondClap = new BingoLyrics(3);
        secondClap.lyrics();
        BingoLyrics thirdClap = new BingoLyrics(2);
        thirdClap.lyrics();
        BingoLyrics fourthClap = new BingoLyrics(1);
        fourthClap.lyrics();
        BingoLyrics fifthClap = new BingoLyrics(0);
        fifthClap.lyrics();
        
    }
}
