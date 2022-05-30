/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class tambahView extends JFrame {
    final JTextField fid = new JTextField(50);
    final JTextField fnama = new JTextField(20);
    final JTextField fusia = new JTextField(20);
    final JTextField fgaji = new JTextField(10);
    JLabel ltitle = new JLabel("INPUT KARYAWAN");
    JLabel lid= new JLabel("ID");
    JLabel lnama = new JLabel("Nama");
    JLabel lusia = new JLabel("Usia");
    JLabel lgaji = new JLabel("Gaji");
    JButton btnSubmit = new JButton("Submit");
    JButton btnReset = new JButton("Reset");
    JButton btnKembali = new JButton("Kembali");
    
    public tambahView(){
        setLayout(null);
        setSize(350,200);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("INPUT KARYAWAN");
        setDefaultCloseOperation(3);
  
        add(ltitle);
        add(lid);
        add(fid);
        add(lnama);
        add(fnama);
        add(lusia);
        add(fusia);
        add(lgaji);
        add(fgaji);
        add(btnSubmit);
        add(btnReset);
        add(btnKembali);
        
        ltitle.setBounds(120,0,150,40);
        lid.setBounds(100,30,150,40);
        fid.setBounds(150,40,150,20);
        lnama.setBounds(100,50,150,40);
        fnama.setBounds(150,60,150,20);
        lusia.setBounds(100,70,150,40);
        fusia.setBounds(150,80,150,20);
        lgaji.setBounds(100,90,150,40);
        fgaji.setBounds(150,100,150,20);
        btnSubmit.setBounds(20, 130, 90, 20);
        btnReset.setBounds(125, 130, 80, 20);
        btnKembali.setBounds(220, 130, 100, 20);
        
    }
    
    public JTextField getFid() {
        return fid;
    }

    public JTextField getFnama() {
        return fnama;
    }

    public JTextField getFusia() {
        return fusia;
    }
    
    public JTextField getFgaji() {
        return fgaji;
    }
    
}
