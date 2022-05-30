/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class Connector {
    String DBurl = "jdbc:mysql://localhost/karyawan";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;
    public Connector() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Connection Successfull");
        }catch(Exception ex){
            System.out.println("Connection Failed");
        }
    }
}
