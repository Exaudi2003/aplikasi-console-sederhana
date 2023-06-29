package AplikasiPeduliSehatFinal.Data_Informasi;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import AplikasiPeduliSehatFinal.Data_Informasi.methodTambahan;

public class Tampilkan_Informasi{

    public static void tampilkan_informasi() throws IOException{

        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("referensi.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println("File Tidak ditemukan");
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
}
