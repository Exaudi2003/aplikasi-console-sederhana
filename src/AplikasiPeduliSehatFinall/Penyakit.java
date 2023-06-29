package AplikasiPeduliSehatFinall;

public interface Penyakit {
    void getPenyakit(String penyakit);
    
    default void alternatif(){
        System.out.println("aa");
    }
    default void Demam(){
        System.out.println("Nama penyakit\t\t:");
        System.out.println("Demam\n");
        System.out.println("Penjelasan singkat\t\t:");
        System.out.println("Demam merupakan meningkatnya suhu tubuh hingga lebih dari 38 Celcius.");
        System.out.println("Kondisi ini bisa menandakan adanya penyakit atau kondisi tertentu di dalam\n");
        System.out.println("Penanganan\t\t:");
        System.out.println("1. Kenakan pakaian tipis");
        System.out.println("2. Banyak Istirahat");
        System.out.println("3. Minum obat penurun panas");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("\n");
    }
    default void Flu(){
        System.out.println("Nama penyakit\t\t:");
        System.out.println("Flu\n");
        System.out.println("Penjelasan singkat\t\t:");
        System.out.println("merupakan penyakit yang disebabkan oleh infeksi virus yang");
        System.out.println("dapat menyerang hidung, tenggorokan, dan paru-paru. Flu atau influenza");
        System.out.println("ini sangat umum terjadi di musim pancaroba.\n");
        System.out.println("Penanganan\t\t:");
        System.out.println("1. Banyak minum air hangat");
        System.out.println("2. Minum cairan PROBIOTIK");
        System.out.println("3. Tidak mengkonsumsi makanan/minuman dingin");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("\n");
    }
    default void Batuk(){
        System.out.println("Nama penyakit\t\t:");
        System.out.println("Batuk\n");
        System.out.println("Penjelasan singkat\t\t:");
        System.out.println("Batuk merupakan adalah infeksi saluran pernapasan,");
        System.out.println("seperti pilek atau flu. Infeksi saluran pernapasan biasanya disebabkan");
        System.out.println("oleh virus dan dapat berlangsung dari beberapa hari hingga seminggu.\n");
        System.out.println("Penanganan\t\t:");
        System.out.println("1. Banyak minum air mineral");
        System.out.println("2. Berkumur dengan air garam");
        System.out.println("3. Minum obat pereda batuk");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("\n");
    }
}
