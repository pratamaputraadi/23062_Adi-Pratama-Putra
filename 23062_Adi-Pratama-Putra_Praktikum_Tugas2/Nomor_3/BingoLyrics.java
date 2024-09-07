/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_2.Nomor_3;

/**
 * LATIHAN NOMOR 3
 * PERTEMUAN 2 - PEMROGRAMAN BERORIENTASI OBJEK
 * @author Adi Pratama Putra
 */

public class BingoLyrics {
    String bingo;
    
   public BingoLyrics(int clapHands) {
        if (clapHands == 5) {
            this.bingo = "B-I-N-G-O \n"; // NO CLAP
        } else if (clapHands == 4) {
            this.bingo = "(clap)-I-N-G-O \n"; // SATU CLAP
        } else if (clapHands == 3) {
            this.bingo = "(clap)-(clap)-N-G-O \n"; // DUA CLAP
        } else if (clapHands == 2) {
            this.bingo = "(clap)-(clap)-(clap)-G-O \n"; // TIGA CLAP
        } else if (clapHands == 1) {
            this.bingo = "(clap)-(clap)-(clap)-(clap)-O \n"; // EMPAT CLAP
        } else if (clapHands == 0) {
            this.bingo = "(clap)-(clap)-(clap)-(clap)-(clap) \n"; // LIMA CLAP
        }
    }

    public void lyrics() {
        System.out.println("There was a farmer who had a dog,\n" +
        "And Bingo was his name-o.\n" +
        this.bingo + // LOOP BINGO CLAP 3X
        this.bingo +
        this.bingo +
        "And Bingo was his name-o.\n");
    }
}

// TERIMA KASIH - THANK YOU//