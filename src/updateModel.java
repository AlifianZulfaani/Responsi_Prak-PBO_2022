/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI1
 */
public class updateModel {
    Connector connector = new Connector(); 
    public int getBanyakData(){
        int jmlData=0;
        try{
            String query = "Select * from karyawan"; 
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query);
            while(resultSet.next()){ 
                jmlData++; 
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
        return jmlData;
    }
    
    public void update(String id, String nama, String usia, String gaji){
        int jumlah=0;
         try {
           String query = "SELECT * FROM karyawan WHERE id=" + id; 
           ResultSet resultSet = connector.statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jumlah++;
            }
           
             if (jumlah==1) {
                query = "UPDATE karyawan SET id='" +id+"', nama='"+nama+"',usia='"+usia+"',gaji='"+gaji+"' WHERE id="+id;
                connector.statement = (Statement) connector.koneksi.createStatement();
                connector.statement.executeUpdate(query); //execute querynya
                System.out.println("Update Successfull");
                JOptionPane.showMessageDialog(null, "Update Successfull");
             }
             else {
                 JOptionPane.showMessageDialog(null, "Data Not Found");
             }
           
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
}
