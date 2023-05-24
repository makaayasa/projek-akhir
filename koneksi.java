/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author MAKAYASA
 */
public class koneksi {
    /**
     *
     */
    private Connection koneksi;
    public Connection connect(){    
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    System.out.println("Koneksi berhasil");
                }
                catch(ClassNotFoundException ex){
                    System.out.println("Koneksi berhasil");
                }
                     String url ="jdbc:mysql://localhost/buku";
               try{
                    koneksi = DriverManager.getConnection(url,"root","");
                    System.out.println("Koneksi Database berhasil");
                }
                catch(SQLException ex){
                    System.out.println("koneksi database gagal"+ex);
                }
               return koneksi;
    }
}
