package jobsheet4;

import java.util.Scanner;

public class Tugas2Pemilihan10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input jumlah SKS: ");
        int jumlahSKS = sc.nextInt();

        String txt;

        if (jumlahSKS < 24) {
            txt = "KRS valid";
        } else {
            txt = "Melebihi batas";
        }

        System.out.println(txt);
    }
}