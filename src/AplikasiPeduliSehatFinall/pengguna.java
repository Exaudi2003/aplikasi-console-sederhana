/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiPeduliSehatFinall;

/**
 *
 * @author My Laptop
 */
abstract class orang<T> {
    private T nama; 

    public T getNama() {
        return nama;
    }

    public void setNama(T nama) {
        this.nama = nama;
    }

    
    
    public orang(T nama) {
        this.nama = nama;
    }

        
    abstract String cetakProfil();
}

