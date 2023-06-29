package AplikasiPeduliSehatFinall;

public interface Alternatif {
    void getAlternatif(String alt);
    
    default void Diet(){
        System.out.println("Obesitas adalah kondisi ketika lemak yang menumpuk di dalam tubuh  Jika tidak segera ditangani,");
        System.out.println("sangat banyak akibat kalori masuk lebih banyak dibandingkan yang dibakar.");
        System.out.println("obesitas dapat meningkatkan risiko terjadinya penyakit jantung, hipertensi, hingga diabetes.\n");
        System.out.println("untuk menangani permasalahan tersebut kami menyarankan anda untuk melakukan pola diet sebagai berikut ini:\t\t:");
        System.out.println("Bahan yang anda butuhkan\t\t:\n");
        System.out.println("1. 1 buah lemon");
        System.out.println("2. 1/2 sendok gula");
        System.out.println("3. 1 sendok teh kopi");
        System.out.println("Cara pembuatan\t\t:\n");
        System.out.println("1. Langkah pertama cuci jeruk nipis lemon hingga bersih untuk menghindari\n debu dan menjaga agar minuman tetap sehat");
        System.out.println("2. Iris tipis jeruk nipis/lemon, pastikan tidak terlalu tebal");
        System.out.println("3. Setelah itu masukkan madu ke dalam gelas");
        System.out.println("4. Masukkan jeruk nipis dan air, lalu aduk pelan dan diamkan selama 1-2 jam di dalam kulkas");
        System.out.println("5. Setelah air dirasa cukup asam, lemon madu siap dinikmati.");
        System.out.println("6. Minum air lemon secara teratur dapat mengurangi berat badan hingga 3-5kg dalam seminggu, disertai pola makan sehat dan berolahraga.");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("\n");
    }
    default void Biduran(){
        System.out.println("Reaksi di kulit yang ditandai dengan munculnya bentol berwarna kemerahan dan disertai rasa gatal.");
        System.out.println("Biduran bisa muncul di area kulit mana saja, termasuk wajah, leher, telinga, hingga seluruh tubuh.");
        System.out.println("Pada umumnya, biduran tergolong ringan dan sembuh dengan sendirinya setelah beberapa jam atau setelah mengonsumsi obat-obatan. ");
        System.out.println("Namun, pada beberapa kasus, biduran dapat berlangsung selama beberapa minggu dan ");
        System.out.println("terjadi berulang. Kondisi ini dapat disebut sebagai biduran kronis.");
        System.out.println("untuk menangani permasalahan tersebut kami menyarankan anda untuk melakukan pola diet sebagai berikut ini:\t\t:");
        System.out.println("1. Kompres dingin");
        System.out.println("2. Mandi dengan larutan anti-gatal");
        System.out.println("3. Oleskan lidah buaya");
        System.out.println("4. Kenakan pakaian longgar");
        System.out.println("5. Jaga kelembapan kulit");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("\n");
    }
}
