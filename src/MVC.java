/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class MVC {
    
    public void Tambah(){
        tambahView viewTambah = new tambahView();
        tambahModel modelTambah = new tambahModel();
        Controller controller = new Controller(viewTambah, modelTambah);
    }
    
    public void Lihat(){
        lihatView viewLihat = new lihatView();
        lihatModel modelLihat = new lihatModel();
        Controller controller = new Controller(viewLihat, modelLihat);
    }
}
