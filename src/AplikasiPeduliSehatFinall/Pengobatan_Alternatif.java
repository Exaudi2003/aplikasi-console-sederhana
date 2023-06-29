package AplikasiPeduliSehatFinall;

public class Pengobatan_Alternatif implements Alternatif{
    @Override
    public void getAlternatif(String alt){
        System.out.println("Jenis Permasalahan Kesehatan : "+alt);
    }
    
    @Override
    public void Diet(){
        Alternatif.super.Diet();
    }
    @Override
    public void Biduran(){
        Alternatif.super.Biduran();
    }
    
//    @Override
//    public void Flu(){
//        Penyakit.super.Flu();
//    }
//    @Override
//    public void Batuk(){
//        Penyakit.super.Batuk();
//    }
}
