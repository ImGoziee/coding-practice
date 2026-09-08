import java.util.Scanner;

public class studiKasus2_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lebarTanah, panjangTanah;
        double diameterKolam, sisiTaman;
        double phi = 3.14;

        System.out.print("Masukkan lebar tanah: ");
        lebarTanah = sc.nextInt();
        System.out.print("Masukkan panjang tanah: ");
        panjangTanah = sc.nextInt();
        System.out.print("Masukkan diameter kolam: ");
        diameterKolam = sc.nextDouble();
        System.out.print("Masukkan sisi taman: ");
        sisiTaman = sc.nextDouble();
        
        int luasTanah = lebarTanah * panjangTanah;
        double jariJari = diameterKolam / 2;
        double luasKolam = phi * jariJari * jariJari;
        double luasTaman = sisiTaman * sisiTaman;
        double luasTidakDigunakan = luasTanah - luasKolam - luasTaman;

        System.out.println("Luas tanah          : " + luasTanah + " m2");
        System.out.println("Luas kolam ikan     : " + luasKolam + " m2");
        System.out.println("Luas taman bunga    : " + luasTaman + " m2");
        System.out.println("Luas tidak digunakan: " + luasTidakDigunakan + " m2");
    }
}