package jobsheet4;

import java.util.Scanner;

public class PemilihanIf10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas (Y/N) : ");
        boolean uktLunas = sc.nextBoolean();
        if (uktLunas) {
            System.out.println("Pembayaran terverifikasi");
            System.out.println("Silahkan Cetak KRS dan minta tanda tangan dosen");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
    }
}
