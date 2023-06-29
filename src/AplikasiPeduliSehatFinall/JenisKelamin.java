/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiPeduliSehatFinall;

/**
 *
 * @author user
 */
  public enum JenisKelamin {
    Laki_Laki("Laki-Laki"), PEREMPUAN("Perempuan");
    private String str;
    JenisKelamin(String jenis){
        this.str = jenis;
    }
    public String toString(){
        return this.str;
    }
    
}