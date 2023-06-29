package AplikasiPeduliSehatFinall;

public class PengobatanAlternatif implements Alternatif_inter{
    
    enum penyakit{
        Diet, Biduran;
    }
    
    penyakit a = penyakit.Diet;
    penyakit b = penyakit.Biduran;
    
    @Override
    public void lihatAlternatif() {
        System.out.println("-----Selamat datang di menu informasi-----");
        System.out.println("-----------Pengobatan Alternatif----------");
        System.out.println("Kami menyediakan bebera[a informasi yang dapat anda jadikan");
        System.out.println("pengobatan alternatif disaat anda tidak sempat untuk berkonsultasi langsung dengan dokter");
        System.out.println("Kami telah menyediakan beberapa informasi seperti "+a+" dan "+b+"" );
    }

}