package AplikasiPeduliSehatFinal.Data_Informasi;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import AplikasiPeduliSehatFinal.Data_Informasi.methodTambahan;

public class Feedback {
   public static void tampilkanFeedback() throws IOException{

        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("Feedback.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println("File Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            tambahfeedback();
            return;
        }


        System.out.println("\n| No |\tNama                  |\tKomentar                                         ");
        System.out.println("------------------------------------------------------------------------------------");

        String data = bufferInput.readLine();
        int nomorData = 0;
        while(data != null) {
            nomorData++;

            StringTokenizer stringToken = new StringTokenizer(data, ",");

            System.out.printf("| %2d ", nomorData);
            System.out.printf("|\t%-20s   ", stringToken.nextToken());
            System.out.printf("|\t%-20s   ", stringToken.nextToken());
            System.out.print("\n");

            data = bufferInput.readLine();
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }

    public static void tampilkanFeedbackHapus() throws IOException{

        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("Feedbacktemp.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println("File Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            tambahfeedback();
            return;
        }


        System.out.println("\n| No |\tNama                 |Komentar                                         ");
        System.out.println("------------------------------------------------------------------------------------");

        String data = bufferInput.readLine();
        int nomorData = 0;
        while(data != null) {
            nomorData++;

            StringTokenizer stringToken = new StringTokenizer(data, ",");

            System.out.printf("| %2d ", nomorData);
            System.out.printf("|\t%-20s   ", stringToken.nextToken());
            System.out.printf("|\t%-20s   ", stringToken.nextToken());
            System.out.print("\n");

            data = bufferInput.readLine();
        }
        System.out.println("--------------------------------------------------------------");
    }

    public static void cariDataFeedback() throws IOException{

        // membaca database ada atau tidak
        try {
            File file = new File("Feedback.txt");
        } catch (Exception e){
            System.err.println("File tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            tambahfeedback();
            return;
        }

        // kita ambil keyword dari user

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan kata kunci untuk mencari data jadwal: ");
        String cariString = terminalInput.nextLine();
        String[] keywords = cariString.split("\\s+");

        // kita cek keyword di database
        cekDataFile(keywords,true);

    }

    // default access modifier
    static boolean cekDataFile(String[] keywords, boolean isDisplay) throws IOException{

        FileReader fileInput = new FileReader("Feedback.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine();
        boolean isExist = false;
        int nomorData = 0;

        if (isDisplay) {
           System.out.println("\n| No |\tNama                 |Komentar                                         ");
        System.out.println("------------------------------------------------------------------------------------");
        }

        while(data != null){

            // cek keywords didalam baris
            isExist = true;

            for(String keyword:keywords){
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }

            // jika keywordnya cocok maka tampilkan

            if(isExist){
                if(isDisplay) {
                    nomorData++;
                    StringTokenizer stringToken = new StringTokenizer(data, ",");

                    System.out.printf("| %2d ", nomorData);
                    System.out.printf("|\t%-20s   ", stringToken.nextToken());
                    System.out.printf("|\t%-20s   ", stringToken.nextToken());
                    System.out.print("\n");
                } else {
                    break;
                }
            }

            data = bufferInput.readLine();
        }

        if (isDisplay){
            System.out.println("--------------------------------------------------------------");
        }

        return isExist;
    }


    public static void tambahfeedback() throws IOException{

        FileWriter fileOutput = new FileWriter("Feedback.txt",true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        //Mengambil inputan
        Scanner terminalInput = new Scanner(System.in);
        String nama_user, komen;

        System.out.print("Tuliskan nama anda : ");
        nama_user = terminalInput.nextLine();
        System.out.print("Berikan pendapat anda: ");
        komen = terminalInput.nextLine();

        // cek buku di database

        String[] keywords = {nama_user +","+ komen};
        System.out.println(Arrays.toString(keywords));

        boolean isExist = cekDataFile(keywords,false);

        // menulis buku di database
        if (!isExist){
            System.out.println("\nData yang akan anda masukan adalah");
            System.out.println("----------------------------------------");
            System.out.println("Nama pengguna  : " + nama_user);
            System.out.println("Komentar : " + komen);

            boolean isTambah = methodTambahan.YaTidak("Apakah akan ingin menambah data tersebut?");

            if(isTambah){
                System.out.println("\n");
                bufferOutput.write( nama_user + "," + komen);
                bufferOutput.newLine();
                bufferOutput.flush();
            }

        } else {
            System.out.println("Data yang anda masukkan sudah tersedia dalam file, yakni:");
            cekDataFile(keywords,true);
        }


        bufferOutput.close();
    }

    
}

        

