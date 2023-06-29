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

public class Kontak_Darurat{

    public static void tampilkan_Data_Kontak() throws IOException{

        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("kontak.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println("File Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            TambahKontak();
            return;
        }


        System.out.println("\n| No |\tNama Kontak                   |\tNomor Telepon                                                     ");
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

    public static void tampilkanKontakHapus() throws IOException{

        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("kontak.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println("File Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            TambahKontak();
            return;
        }


        System.out.println("\n| No |\tNama Kontak                   |\tNomor Telepon                                                     ");
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

        FileReader fileInput = new FileReader("kontak.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine();
        boolean isExist = false;
        int nomorData = 0;

        if (isDisplay) {
        System.out.println("\n| No |\tNama Kontak                   |\tNomor Telepon                                                     ");
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


    public static void TambahKontak() throws IOException{

        FileWriter fileOutput = new FileWriter("kontak.txt",true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        //Mengambil inputan
        Scanner terminalInput = new Scanner(System.in);
        String name, number;

        System.out.print("Tuliskan nama bersangkutan : ");
        name = terminalInput.nextLine();
        System.out.print("Nomor Telepon : ");
        number = terminalInput.nextLine();
        
        

        // cek buku di database

        String[] keywords = {name+","+ number};
        System.out.println(Arrays.toString(keywords));

        boolean isExist = cekDataFile(keywords,false);

        // menulis buku di database
        if (!isExist){
            System.out.println("\nData yang akan anda masukan adalah");
            System.out.println("----------------------------------------");
            System.out.println("Nama pengguna  : " + name);
            System.out.println("No.Telp : " + number);

            boolean isTambah = methodTambahan.YaTidak("Apakah akan ingin menambah data tersebut?");

            if(isTambah){
                System.out.println("\n");
                bufferOutput.write(name+","+ number);
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