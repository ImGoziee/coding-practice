package jobsheet4;

import java.util.Scanner;

public class TugasParkir10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lamaParkir, totalTarif;
        // data laen
        int tarif = 2000, perJam = 1000;

        System.out.print("Input lama parkir: ");
        lamaParkir = sc.nextInt();

        if (lamaParkir > 2) {
            totalTarif = tarif + (lamaParkir - 2) * perJam;
        } else {
            totalTarif = tarif;
        }

        System.out.println("Total tarif: " + totalTarif);
    }
}
