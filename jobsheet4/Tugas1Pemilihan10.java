package jobsheet4;

import java.util.Scanner;

public class Tugas1Pemilihan10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas (Y/N) : ");
        boolean uktLunas = sc.nextBoolean();

        String txt = uktLunas ? 
            "Pembayaran terverifikasi\nSilahkan Cetak KRS dan minta tanda tangan dosen" : 
            "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        
        System.out.println(txt);
    }
}