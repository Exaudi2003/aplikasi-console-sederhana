/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiPeduliSehatFinall;

/**
 *
 * @author My Laptop
 */

public class user extends Pengunjung {


    private String alamat,nama;
    private int id;
    private JenisKelamin jk;
    public user(String username, String password, int id, JenisKelamin jk) {
        super.setUsername(username);
        super.setPassword(password);
        this.alamat = alamat;
        this.nama = nama;
        this.id = id;
        this.jk = jk;
    }

    user(String user, String user0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void biodata() {
        System.out.println();
        System.out.println("Nama : " + this.getNama());
        System.out.println("Alamat : " + this.getAlamat());
        System.out.println("Jenis Kelamin : " + this.getJk().toString());
        System.out.println();
    }

    @Override
    public boolean authentikasi(String username, String password) {
        if(this.getUsername().equals(username) && this.getPassword().equals(password)){
            return true;
        }
        return false;
    }

    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public JenisKelamin getJk() {
        return jk;
    }

    public void setJk(JenisKelamin jk) {
        this.jk = jk;
    }
    
}
  
