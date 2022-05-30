/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Home home = new Home();
    }
}
    //Halaman Utama
    class Home extends JFrame {
    Menu menu;
    
    JLabel mainMenu = new JLabel("MAIN MENU");
    JButton btnAdmin = new JButton("TAMBAH KARYAWAN");
    JButton btnTamu = new JButton("LIHAT KARYAWAN");
    
    Home(){
        setTitle("KARYAWAN");
	setSize(350,140);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
        
        add(mainMenu);
        add(btnAdmin);
        add(btnTamu);
        
        setVisible(true);
        mainMenu.setBounds(130,0,150,40);
        btnAdmin.setBounds(10,40,150,40);
        btnTamu.setBounds(170,40,150,40);
        
         btnAdmin.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  dispose();
                  MVC mvc = new MVC();
                  mvc.Tambah();      
              }
         });
         
         btnTamu.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  dispose();
                  MVC mvc = new MVC();
                  mvc.Lihat();
              }
         });
     
   }
}

