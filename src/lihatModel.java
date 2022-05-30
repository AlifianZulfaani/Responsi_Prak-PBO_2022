/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class lihatModel {
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
    
    public String[][] readData(){
        try{
            int jmlData = 0;
            String data[][] = new String[getBanyakData()][5];
            String query = "Select * from `karyawan`"; 
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query);
            while(resultSet.next()){
                data[jmlData][0] = resultSet.getString("id");
                data[jmlData][1] = resultSet.getString("nama");
                data[jmlData][2] = resultSet.getString("usia"); 
                data[jmlData][3] = resultSet.getString("gaji");
                jmlData++;     
            }
            return data;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
}
