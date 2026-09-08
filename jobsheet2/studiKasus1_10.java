import java.util.Scanner;

public class studiKasus1_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gajiPokok;
        int tunjanganPerAnak;
        int jumlahAnak;

        System.out.print("Masukkan gaji pokok: Rp ");
        gajiPokok = sc.nextInt();

        System.out.print("Masukkan tunjangan anak per bulan: Rp ");
        tunjanganPerAnak = sc.nextInt();

        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = sc.nextInt();

        int tunjanganAnak = jumlahAnak * tunjanganPerAnak;
        int potonganPensiun = gajiPokok * 10 / 100;
        int gajiBersih = gajiPokok + tunjanganAnak - potonganPensiun;

        System.out.println("Tunjangan anak   : Rp " + tunjanganAnak);
        System.out.println("Potongan pensiun : Rp " + potonganPensiun);
        System.out.println("Gaji bersih      : Rp " + gajiBersih);

        sc.close();
    }
}