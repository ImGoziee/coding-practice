package assignment;
import java.util.Scanner;

public class RinaNyicilLaptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double 
        bunga = 0.02,
        hargaLaptop, 
        uangMuka, 
        sisaHargaLaptop,
        bungaPerBulan,
        cicilanPerBulan;

        int bulan;

        System.out.print("Masukkan harga laptop : ");
        hargaLaptop = sc.nextDouble();

        System.out.print("Masukkan uang muka : ");
        uangMuka = sc.nextDouble();
        
        System.out.print("Lama cicilan : ");
        bulan = sc.nextInt();

        sisaHargaLaptop = hargaLaptop - uangMuka;
        bungaPerBulan = sisaHargaLaptop * bunga;
        cicilanPerBulan = (sisaHargaLaptop + (bungaPerBulan * bulan)) / bulan;

        System.out.println("Cicilan yang harus dibayar tiap bulan : " + cicilanPerBulan);
    }
}