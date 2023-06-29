/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiPeduliSehatFinall;

public class InfoPenyakit implements jenis{
    
    enum penyakit{
        Demam, Flu, Batuk;
    }
    
    penyakit a = penyakit.Demam;
    penyakit b = penyakit.Flu;
    penyakit c = penyakit.Batuk;
    
    @Override
    public void lihatPenyakit() {
        System.out.println("-----Selamat datang di menu informasi-----");
        System.out.println("---------------Peduli Sehat---------------");
        System.out.println("Utamakanlah keselamatan dan kesehatan anda terlebih dahulu");
        System.out.println("Karena semua yang ada didunia ini bisa anda dapatkan jika anda sehat.");
        System.out.println("Sebaliknya jika kondisi kesehatan anda tidak sehat maka semua");
        System.out.println("yang anda dapatkan akan sia sia, karena anda tidak akan menikmatinya");
        System.out.println("Berikut kami sediakan beberapa refrensi penyakit seperti :-----");
        System.out.println("Vaksin " +a+ "," +b+ "dan" +c);
       
    }

}


