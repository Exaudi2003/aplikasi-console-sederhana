/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiPeduliSehatFinal.Data_Informasi;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import AplikasiPeduliSehatFinal.Data_Informasi.methodTambahan;

public class Mengelola_Referensi{

    public static void tampilkan_Referensi() throws IOException{

        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("referensi.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println("File Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            TambahReferensi();
            return;
        }


        System.out.println("\n| No |\tJudul                   |\tLink                                                      ");
        System.out.println("-----------------------------------------------------------------------------------------------");

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
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    public static void tampilkanDataInformasiHapus() throws IOException{

        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("referensi.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println("File Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            TambahReferensi();
            return;
        }


        System.out.println("\n| No |\tJudul                   |\tLink                                                      ");
        System.out.println("-----------------------------------------------------------------------------------------------");

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
        System.out.println("------------------------------------------------------------------------------------------");
    }
    
        // default access modifier
    static boolean cekDataFile(String[] keywords, boolean isDisplay) throws IOException{

        FileReader fileInput = new FileReader("referensi.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine();
        boolean isExist = false;
        int nomorData = 0;

        if (isDisplay) {
        System.out.println("\n| No |\tJudul                   |\tLink                                                      ");
        System.out.println("-----------------------------------------------------------------------------------------------");
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
            System.out.println("--------------------------------------------------------------------------");
        }

        return isExist;
    }


    public static void TambahReferensi() throws IOException{

        FileWriter fileOutput = new FileWriter("referensi.txt",true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        //Mengambil inputan
        Scanner terminalInput = new Scanner(System.in);
        String title, link;

        System.out.print("Tuliskan Judul : ");
        title = terminalInput.nextLine();
        System.out.print("Masukan link : ");
        link = terminalInput.nextLine();
        
        

        // cek buku di database

        String[] keywords = {title +","+ link};
        System.out.println(Arrays.toString(keywords));

        boolean isExist = cekDataFile(keywords,false);

        // menulis buku di database
        if (!isExist){
            System.out.println("\nData yang akan anda masukan adalah");
            System.out.println("----------------------------------------");
            System.out.println("Judul  : " + title);
            System.out.println("Link : " + link);

            boolean isTambah = methodTambahan.YaTidak("Apakah akan ingin menambah data tersebut?");

            if(isTambah){
                System.out.println("\n");
                bufferOutput.write(title +","+ link);
                bufferOutput.newLine();
                bufferOutput.flush();
            }

        } else {
            System.out.println("Data yang anda masukkan sudah tersedia dalam file, yakni:");
            cekDataFile(keywords,true);
        }


        bufferOutput.close();
    }

    public static void deleteReferensi() throws  IOException{
        // kita ambil database original
        File database = new File("referensi.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // kita buat database sementara
        File tempDB = new File("referensitemp.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("List Data");
        tampilkan_Referensi();

        // kita ambil user input untuk mendelete data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukan nomor data yang akan dihapus: ");
        int deleteNum = terminalInput.nextInt();

        // looping untuk membaca tiap data baris dan skip data yang akan didelete

        boolean isFound = false;
        int entryCounts = 0;

        String data = bufferedInput.readLine();

        while (data != null){
            entryCounts++;
            boolean isDelete = false;

            StringTokenizer st = new StringTokenizer(data,",");

            // tampilkan data yang ingin di hapus
            if (deleteNum == entryCounts){
                System.out.println("\nData yang ingin anda hapus adalah:");
                System.out.println("-----------------------------------");
                System.out.println("Jenis Penyakit  : " + st.nextToken());
                System.out.println("Penyebab : " + st.nextToken());
                System.out.println("Pengobatan alternatif  : " + st.nextToken());

                isDelete = methodTambahan.YaTidak("Apakah anda yakin akan menghapus?");
                isFound = true;
            }

            if(isDelete){
                //skip pindahkan data dari original ke sementara
                System.out.println("Data berhasil dihapus");
            } else {
                // kita pindahkan data dari original ke sementara
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }
            data = bufferedInput.readLine();
        }

        if(!isFound){
            System.err.println("Data tidak ditemukan");
        }

        // menulis data ke file
        bufferedOutput.flush();
        // delete original file
        database.delete();
        // rename file sementara ke database
        tempDB.renameTo(database);

    }
}