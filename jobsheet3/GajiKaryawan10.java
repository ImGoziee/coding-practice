import java.util.Scanner;

public class GajiKaryawan10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajiPokok;

        double 
        tunjanganTransport = 600000,
        tunjanganMakanan = 400000,
        bonus; 
        int totalGaji;

        System.out.print("Masukkan gaji pokok : ");
        gajiPokok = sc.nextInt();

        bonus = 0.05 * gajiPokok;
        totalGaji = (int) (gajiPokok + tunjanganTransport + tunjanganMakanan + bonus - (0.1 * gajiPokok));

        System.out.println("Bonus bulanan anda adalah : " + bonus);
        System.out.println("Total gaji yang diterima adalah : " + totalGaji);
    }
}
