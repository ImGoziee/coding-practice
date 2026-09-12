import java.util.Scanner;

public class MenghitungTotalBayar10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga;
        double diskon = 0.15, potongan, jmlBayar;

        System.out.print("Masukkan harga barang : ");
        harga = sc.nextInt();

        potongan = harga * diskon;
        jmlBayar = harga - potongan;

        System.out.println("Diskon : " + potongan);
        System.out.println("Jumlah bayar : " + jmlBayar);
    }
}
