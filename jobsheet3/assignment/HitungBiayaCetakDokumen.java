package assignment;
import java.util.Scanner;

public class HitungBiayaCetakDokumen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahLembar;
        
        double 
        biayaPerLembar = 500,
        biayaPenjilidan = 5000,
        totalBiaya;
        
        System.out.print("Jumlah lembar yang dicetak : ");
        jumlahLembar = sc.nextInt();

        totalBiaya = (jumlahLembar * biayaPerLembar) + biayaPenjilidan;

        System.out.println("Total biaya yang harus dibayar : " + totalBiaya);
    }
}
