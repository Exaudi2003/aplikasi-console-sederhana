package AplikasiPeduliSehatFinall;

 import AplikasiPeduliSehatFinal.Data_Informasi.Mengelola_Informasi_Penyakit;
 import AplikasiPeduliSehatFinal.Data_Informasi.Mengelola_Referensi;
 import AplikasiPeduliSehatFinal.Data_Informasi.Feedback;
 import AplikasiPeduliSehatFinal.Data_Informasi.Kontak_Darurat;
 import AplikasiPeduliSehatFinal.Data_Informasi.Tampilkan_Informasi;
 import AplikasiPeduliSehatFinal.Data_Informasi.Tampilkan_Kontak_Darurat;
 import AplikasiPeduliSehatFinal.Data_Informasi.methodTambahan;


 import java.io.IOException;
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.LinkedList;
 import java.util.Scanner;

public class AplikasiPeduliSehatFinal{
 
    public String Nama;
    public static InfoPenyakit penyakit = new InfoPenyakit();
    public static PengobatanAlternatif alt = new PengobatanAlternatif();
//    public static lihatProsedur x = new lihatProsedur();
    int hasil;
    

    public static void main(String[] args) throws IOException {
        ArrayList<Pendaftar> pendaftaran = new ArrayList<>();
        HashMap<Integer, String> tes = new HashMap<>();
        LinkedList<user> User = new LinkedList<user>();
        Scanner input = new Scanner(System.in);        
        Scanner scanString = new Scanner(System.in);
        Scanner scanNumber = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);

        //Default akun user
        admin admin =new admin("Admin", "Admin");

        //Default akun pengguna
        User.add(new user("user", "user",1,JenisKelamin.Laki_Laki));
        user tempuser = null;
        int loop = 1;
        int pilihanUser;
        int inputt;
        int role = 0;
        boolean login = false;
        double hasilKal;
        
        while(loop == 1){
            if(login){
            if(role==1){
                while(true){
                    

        Scanner adminInput = new Scanner(System.in);
        String pilihanAdmin;
        boolean lanjutkan = true;

        while (lanjutkan){
            System.out.println("\n=========Menu Admin=========\n");
            System.out.println("1. \tInformasi Konsultasi ");
            System.out.println("2. \tMengelola Informasi Refrensi ");
            System.out.println("3. \tMengelola Feedback");
            System.out.println("4. \tMengelola Kontak Darurat");
            System.out.println("5. \tKeluar");           
            System.out.print("\nTuliskan Pilihan Menu : ");
            pilihanAdmin = adminInput.next();

            switch (pilihanAdmin){
                case"1":
                        
                System.out.println("\n======================================");
                    penyakit.lihatPenyakit();

                    Info_Penyakit type = new Info_Penyakit();
                    System.out.println("\nJenis Penyakit yang mungkin anda alami :");
                    type.getPenyakit("1. Demam");
                    type.getPenyakit("2. Flu");
                    type.getPenyakit("3. Batuk");

                    System.out.print("\nPilih Informasi Penyakit yang anda ingin ketahui: ");
                    int pilihan = input.nextInt();

                    if(pilihan == 1){
                        System.out.println("");
                        type.getPenyakit("Demam");
                        type.alternatif();
                        type.Demam();
                    }else if(pilihan == 2){
                        System.out.println("");
                        type.getPenyakit("Flu");
                        type.alternatif();
                        type.Demam();
                    }else if(pilihan == 3){
                        System.out.println("");
                        type.getPenyakit("Batuk");
                        type.alternatif();
                        type.Demam();                    
                    }else if(pilihan == 10){
                        role = 1;
                    }
                    
                    break;
                case "2":
                    System.out.println("===Menu Refrensi penyakit===\n");
                    System.out.println("1. \tTampilkan Refrensi");
                    System.out.println("2. \tTambah Refrensi");
                    System.out.println("3. \tHapus Refrensi");

                    System.out.print("\nTuliskan Pilihan Menu : ");

                    String pilihanRefrensi = adminInput.next();

                    switch (pilihanRefrensi){
                        case "1":
                            Mengelola_Referensi.tampilkan_Referensi();
                            break;
                        case "2":
                            Mengelola_Referensi.TambahReferensi();
                            break;
                        case "3":
                            Mengelola_Referensi.deleteReferensi();
                            break;
                        default:
                            System.err.println("\nInput yang anda tuliskan tidak ditemukan\nSilahkan pilih sesuai menu yang ditampilkan [1-5]");
                    }
                    lanjutkan = methodTambahan.YaTidak("Apakah anda ingin melakukan pengeditan ");
                    break;
                case "3":
                    System.out.println("=========Feedback=========\n");
                    System.out.println("1. \tTampilkan feedback");
                    System.out.println("2. \tTanggapi Feedback");

                    System.out.print("\nTuliskan Pilihan Menu : ");

                    String Feedbackinput = adminInput.next();

                    switch (Feedbackinput){
                        case "1":
                            Feedback.tampilkanFeedback();
                            break;
                        case "2":
                            Feedback.tambahfeedback();
                            break;
                        default:
                            System.err.println("\nInput yang anda tuliskan tidak ditemukan\nSilahkan pilih sesuai menu yang ditampilkan [1-5]");
                    }
                    lanjutkan = methodTambahan.YaTidak("Apakah anda ingin melakukan pengeditan ");
                    break;
                    case "4":
                        System.out.println("===KONTAK DARURAT===\n");
                        System.out.println("1. \tKumpulan Kontak Darurat");
                        System.out.println("2. \tTambah Kontak Darurat");
                        
                        System.out.print("\nTuliskan Pilihan Menu : ");
                        String Kontakinput = adminInput.next();

                    switch (Kontakinput){
                        case "1":
                            Kontak_Darurat.tampilkan_Data_Kontak();
                            break;
                        case "2":
                            Kontak_Darurat.TambahKontak();
                            break;
                        default:
                            System.err.println("\nInput yang anda tuliskan tidak ditemukan\nSilahkan pilih sesuai menu yang ditampilkan [1-5]");
                    }
                    lanjutkan = methodTambahan.YaTidak("Apakah anda ingin melakukan pengeditan ");
                    break;
                    case "5":
                        login = false;
                        System.out.println("\nTerimakasih sudah mengunjungi aplikasi Peduli Sehat");
                        System.out.println("--------Selalu peduli terhadap kesehatan anda--------");
                        System.out.println("-------Lebih baik mencegah, daripada mengobati-------");
                    
                 
            
                    String refrensi = adminInput.next();

                    switch (refrensi){
                        case "1":
                            Kontak_Darurat.tampilkan_Data_Kontak();
                            break;
                        case "2":
                            Kontak_Darurat.TambahKontak();
                            break;
                        default:
                            System.err.println("\nInput yang anda tuliskan tidak ditemukan\nSilahkan pilih sesuai menu yang ditampilkan [1-5]");
                    }
                    lanjutkan = methodTambahan.YaTidak("Apakah anda ingin melakukan pengeditan ");
                    break;
            }
        }


                }
            }else if(role==2){
            System.out.println("\n\n=====Selamat Datang DiAplikasi Peduli Sehat=====");
            System.out.println("\nSilahkan gunakan fitur yang telah tersedia:");
            System.out.println("\t1. Kalkulator BB ");
            System.out.println("\t2. Konsultasi Penyakit Umum");
            System.out.println("\t3. Refrensi kesehatan");
            System.out.println("\t4. Kontak Darurat");
            System.out.println("\t5. Berikan Feedback");
            System.out.println("\t6. Info Pengobatan Alternatif");
            System.out.println("\t7. Kembali");
            System.out.print("\t\tPilihan Anda : ");
            pilihanUser = input.nextInt();

             switch(pilihanUser)
             {
                 case 1:
                   System.out.println("Masukan Tinggi Badan\t:");
                            double Tinggi = input.nextDouble();
                            Tinggi/=100;
                            System.out.println("masukna Berat Badan\t:");
                            int Berat = input.nextInt();
                            hasilKal = Berat/(Tinggi*Tinggi);
                            System.out.println("hasil inputan anda adalah : "+hasilKal);   
                            if(hasilKal < 18){
                                System.out.println("Tinggi anda adalah" +Tinggi+ "dan berat badan anda adalah" +Berat);
                                System.out.println("Indeks BMI anda adalah\t: "+hasilKal);
                                System.out.println("Level status Indeks BMI anda tidak normal/Kekurangan bobot !");
                                System.out.println("Perbanyak mengkonsumsi makanan berserat dan rajin berolahraga !!");
                            }else if(hasilKal < 24){
                                System.out.println("Tinggi anda adalah" +Tinggi+ "dan berat badan anda adalah" +Berat);
                                System.out.println("Indeks BMI anda adalah\t: "+hasilKal);
                                System.out.println("Level status Indeks BMI anda Sehat !");
                                System.out.println("Pertahankan mengkonsumsi makanan berserat dan rajin berolahraga !!");
                            }else if(hasilKal < 23 ){
                                System.out.println("Tinggi anda adalah" +Tinggi+ "dan berat badan anda adalah" +Berat);
                                System.out.println("Indeks BMI anda adalah\t: "+hasilKal);
                                System.out.println("Level status Indeks BMI anda Kelebihan bobot !");
                                System.out.println("Kurangin mengkonsumsi makanan berminyak dan rajin berolahraga !!");
                            }else if(hasilKal < 30 ){
                                System.out.println("Tinggi anda adalah" +Tinggi+ "dan berat badan anda adalah" +Berat);
                                System.out.println("Indeks BMI anda adalah\t: "+hasilKal);
                                System.out.println("Level status Indeks BMI anda Obesitas tingkat 1 !");
                                System.out.println("Kurangin mengkonsumsi makanan berminyak dan rajin berolahraga !!");
                            }else{
                                System.out.println("Tinggi anda adalah" +Tinggi+ "dan berat badan anda adalah" +Berat);
                                System.out.println("Indeks BMI anda adalah\t: "+hasilKal);
                                System.out.println("Level status Indeks BMI anda Obesitas tingkat 2 !");
                                System.out.println("Segera konsultasi dengan dokter ahli!!");
                            }break;    
  
                case 2:
                   System.out.println("\n======================================");
                    penyakit.lihatPenyakit();

                    Info_Penyakit type = new Info_Penyakit();
                    System.out.println("\nJenis Penyakit yang mungkin anda alami :");
                    type.getPenyakit("1. Demam");
                    type.getPenyakit("2. Flu");
                    type.getPenyakit("3. Batuk");

                    System.out.print("\nPilih Informasi Penyakit yang anda ingin ketahui: ");
                    int pilihan = input.nextInt();

                    if(pilihan == 1){
                        System.out.println("");
                        type.getPenyakit("Demam");
                        
                        type.Demam();
                    }else if(pilihan == 2){
                        System.out.println("");
                        type.getPenyakit("Flu");
                        
                        type.Flu();
                    }else if(pilihan == 3){
                        System.out.println("");
                        type.getPenyakit("Batuk");
                        
                        type.Batuk();                    
                    }else if(pilihan == 10){
                        role = 2;
                    }
                    
                    break;

                case 3:
                  Tampilkan_Informasi.tampilkan_informasi();
                break;
                case 4:
                  Tampilkan_Kontak_Darurat.tampilkan_Data_Kontak();
                break;
                
                case 5:
                    System.out.println("=========Feedback=========\n");
                    System.out.println("1. \tTampilkan feedback");
                    System.out.println("2. \tTanggapi Feedback");

                    System.out.print("\nTuliskan Pilihan Menu : ");

                    pilihanUser = input.nextInt();

                    switch (pilihanUser){
                        case 1:
                            Feedback.tampilkanFeedback();
                            break;
                        case 2:
                            Feedback.tambahfeedback();
                            break;
                        default:
                            System.err.println("\nInput yang anda tuliskan tidak ditemukan\nSilahkan pilih sesuai menu yang ditampilkan [1-5]");
                    }
                    break;
                    
                    case 6:
                    System.out.println("\n======================================");
                    alt.lihatAlternatif();

                    Pengobatan_Alternatif alter = new Pengobatan_Alternatif();
                    System.out.println("\nJenis Penyakit yang mungkin anda alami :");
                    alter.getAlternatif("1. Obesitas");
                    alter.getAlternatif("2. Biduran");

                    System.out.print("\nPilih Informasi Penyakit yang anda ingin ketahui: ");
                    int alternatif = input.nextInt();

                    if(alternatif == 1){
                        System.out.println("");
                        alter.getAlternatif("Obesitas");
                        alter.Diet();
                    }else if(alternatif == 2){
                        System.out.println("");
                        alter.getAlternatif("Biduran");
                        alter.Biduran();
                    break; 
//                        type.Flu();
//                    }else if(pilihan == 3){
//                        System.out.println("");
//                        type.getPenyakit("Batuk");
//                        
//                        type.Batuk();                    
                    }else if(alternatif == 10){
                        role = 2;
                    }
                    break;
                    
                    case 7:
                        login = false;
                        System.out.println("\nTerimakasih sudah mengunjungi aplikasi Peduli Sehat");
                        System.out.println("--------Selalu peduli terhadap kesehatan anda--------");
                        System.out.println("-------Lebih baik mencegah, daripada mengobati-------");
                    break;
                }
             }
         }
    
             else{
                int pil;
                String username, password;
                System.out.println("Anda ingin masuk sebagai ? ");
                System.out.println("\t1. Admin");
                System.out.println("\t2. Pengguna");
                System.out.println("\t3. Daftarkan Akun baru ?");
                System.out.println("\t4. Keluar");
                System.out.print("Pilihan anda : ");
                pil = scanNumber.nextInt();
                if(pil == 1){
                    System.out.print("\nUsername : ");
                    username = scanString.nextLine();
                    System.out.print("Password : ");
                    password = scanString.nextLine();
                    if(admin.authentikasi(username, password)){
                        login = true;
                        role = 1;
                    }
                }else if(pil == 2){
                    System.out.print("\nUsername : ");
                    username = scanString.nextLine();
                    System.out.print("Password : ");
                    password = scanString.nextLine();
                    for(user item : User){
                        if(item.authentikasi(username, password)){
                            login = true;
                            role = 2;
                            break;
                        }
                    }
                }else if(pil == 3){
                    int pil2;                    
                    System.out.println("\nDaftar Akun");
                    System.out.println("\t1. Pengguna");
                    System.out.println("\t2. Kembali");
                    System.out.print("Pilihan anda : ");
                    pil2 = scanNumber.nextInt();

                    if(pil2 == 1){
                        String _nama, _alamat, _username, _password, _pekerjaan;
                        String _tanggalLahir, _jenisKelamin;
                        JenisKelamin jk = JenisKelamin.Laki_Laki;

                        // Scan here
                        System.out.println("Username : ");
                        _username = scanString.nextLine();

                        System.out.println("Password : ");
                        _password = scanString.nextLine();
                        
                        System.out.println("Jenis Kelamin (L/P) : ");
                        _jenisKelamin = scanString.nextLine();

                        if(_jenisKelamin.equalsIgnoreCase("P")){
                            jk = JenisKelamin.PEREMPUAN;
                        }
                        if(pil2 == 1){
                            try{
                                User.add(new user(_username, _password, User.getLast().getId() + 1,jk));
                                tempuser = User.getLast();
//                                login = true;
                                if(login = true){
                                    System.out.println("\nAkun anda sudah berhasil terdaftar");
                                    System.out.println("Selamat memakai aplikasi");
                                }
                                role = 2;
                            }catch(Exception e){
                                System.err.println(e);
                            }
                        }else if(pil == 3){
                            break;
                        }
                    }

                }else if (pil == 4){
                    login = false;
                    System.out.println("\nTerimakasih sudah mengunjungi aplikasi Peduli Sehat");
                    System.out.println("--------Selalu peduli terhadap kesehatan anda--------");
                    System.out.println("-------Lebih baik mencegah, daripada mengobati-------");

                    break;
                }
            }
        }
    }
}
    

