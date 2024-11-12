/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Pertemuan_11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * PERTEMUAN 11 - PEMROGRAMAN BERORIENTASI OBJEK
 * LATIHAN NOMOR 1
 * @author Adi Pratama Putra
 */

/**
 * USERNAME : ADI PRATAMA PUTRA
 * PASSWORD : 23062
 */

public class Connect {
   private static Connection Connect;

    public static Connection configDB() throws SQLException, ClassNotFoundException {
        try {
            if (Connect == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dabes", 
                        "root", "");
                System.out.println("Koneksi berhasil!");
            }
            return Connect;
        } catch (SQLException e) {
            System.err.println("Error : Koneksi tidak berhasil! " + e.getMessage());
            throw e;
        }
    }
}

// TERIMA KASIH - THANK YOU//