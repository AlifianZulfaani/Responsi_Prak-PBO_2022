/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class tambahModel {
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
    
    public void addData(String id,String nama,String usia,String gaji){
        
         try {
            String query = "INSERT INTO karyawan VALUES ('"+id+"','"+nama+"','"+usia+"','"+gaji+"')";  
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);

            JOptionPane.showMessageDialog(null,"Add Data Success !!");
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,"Data Already Exist !!");  
        }
         
    }
}
    