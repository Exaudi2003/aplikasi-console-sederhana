package AplikasiPeduliSehatFinall;

public class Info_Penyakit implements Penyakit{
    @Override
    public void getPenyakit(String penyakit){
        System.out.println("Penyakit  "+penyakit);
    }
    
    @Override
    public void alternatif(){
        Penyakit.super.alternatif();
    }
    @Override
    public void Demam(){
        Penyakit.super.Demam();
    }
    @Override
    public void Flu(){
        Penyakit.super.Flu();
    }
    @Override
    public void Batuk(){
        Penyakit.super.Batuk();
    }
}
