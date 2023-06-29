/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiPeduliSehatFinal.Data_Informasi;

/**
 *
 * @author My Laptop
 */

import java.util.Scanner;

public class methodTambahan {
    public static boolean YaTidak(String message){
        Scanner adminInput = new Scanner(System.in);
        System.out.print("\n"+message+" (Y/T) ?\n");
        String pilihanAdmin = adminInput.next();

        while(!pilihanAdmin.equalsIgnoreCase("y") && !pilihanAdmin.equalsIgnoreCase("T")) {
            System.err.println("Pilihan anda bukan Y atau T");
            System.out.print("\n"+message+" (Y/T)? ");
            pilihanAdmin = adminInput.next();
        }

        return pilihanAdmin.equalsIgnoreCase("Y");

    }

    public static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex){
            System.err.println("tidak bisa clear screen");
        }
    }
}
