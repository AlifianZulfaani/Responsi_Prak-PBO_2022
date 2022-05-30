/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class lihatView extends JFrame{
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID","Nama","Usia","Gaji"};
    JButton btnBack = new JButton("Kembali");
    public lihatView(){
        tableModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
        setLayout(null);
        setSize(475,500);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("DATA KARYAWAN");
        setDefaultCloseOperation(3);
        add(btnBack);
        add(scrollPane);
        
        scrollPane.setBounds(10,35,450,345);
        btnBack.setBounds(0,440,475,20);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
}
