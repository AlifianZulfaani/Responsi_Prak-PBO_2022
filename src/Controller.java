/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Asus
 */
public class Controller {
    tambahModel modelTambah;
    tambahView viewTambah ;
    lihatModel modelLihat;
    lihatView viewLihat;

    Controller(tambahView viewTambah, tambahModel modelAdmin) {
    this.modelTambah = modelTambah;
    this.viewTambah = viewTambah;
    
    
    viewTambah.btnSubmit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) { 
        String id = viewTambah.getFid().getText();
        String nama = viewTambah.getFnama().getText();
        String usia = viewTambah.getFusia().getText();
        String gaji = viewTambah.getFgaji().getText();
        if (id.equals("") || nama.equals("")||usia.equals("")||gaji.equals("")) {
            JOptionPane.showMessageDialog(viewTambah, "Fill the Empty Column !!");
        }else {
            modelAdmin.addData(id,nama,usia,gaji);
        }
        }
    });
    
    
     viewTambah.btnReset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewTambah.fid.setText("");
                viewTambah.fnama.setText("");
                viewTambah.fusia.setText("");
                viewTambah.fgaji.setText("");
            }
        });
     
     viewTambah.btnKembali.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewTambah.dispose();
                Home home = new Home();
            }
        });
    
    }
    
    Controller(lihatView viewLihat, lihatModel modelLihat) {
    this.modelLihat = modelLihat;
    this.viewLihat = viewLihat;
    
    if(modelLihat.getBanyakData() != 0){
            String data[][] = modelLihat.readData();
            viewLihat.tabel.setModel((new JTable(data, viewLihat.namaKolom)).getModel());
        } else{
            JOptionPane.showMessageDialog(null, "Data Kosong!!\nMinta Admin Untuk Menginput Data!!");
        }
    
    viewLihat.btnBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewLihat.dispose();
                Home home = new Home();
            }
        });
    
    viewLihat.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewLihat.tabel.getSelectedRow();
                
                String id = viewLihat.tabel.getValueAt(baris, 0).toString();
                String nama = viewLihat.tabel.getValueAt(baris, 1).toString();
                String usia = viewLihat.tabel.getValueAt(baris, 2).toString();
                String gaji = viewLihat.tabel.getValueAt(baris, 3).toString();
                
                viewLihat.dispose();
                updateView ed = new updateView();
                ed.fid.setText(id);
                ed.fnama.setText(nama);
                ed.fusia.setText(usia);
                ed.fgaji.setText(gaji);
                lihatView lv = new lihatView();
                lv.dispose();
                tambahView tv = new tambahView();
                tv.dispose();
                System.out.println("");
                        
            }
        }
        );
    
    }
    
}
