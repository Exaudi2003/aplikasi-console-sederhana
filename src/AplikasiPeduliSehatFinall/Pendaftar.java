/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiPeduliSehatFinall;

/**
 *
 * @author My Laptop
 */

public class Pendaftar<T> extends orang<T>{
    public Pendaftar(T nama) {
        super(nama);
    }
    
    
    @Override
    String cetakProfil(){
        return "Nama : "+getNama();
    }
}
