import java.util.Scanner;

public class tiketBioskop15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        double totalPenjualanTiketPerHari = 0.0;
        
        int totalTiketHarian = 0;
        
        System.out.println("Selamat datang!!");
        System.out.println("Masukkan jumlah tiket per transaksi.");
        
        do {
            
            System.out.print("\nMasukkan jumlah tiket: ");
            int jmlTiket = sc.nextInt();
            
            if (jmlTiket==0) {
                System.out.println("tidak bisa");
                break;
            }
            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, silakan coba lagi.");
                continue;
            }
            
            double diskon;           
            if (jmlTiket > 4 && jmlTiket <= 10) {
                diskon = 0.10;
            } 
            else if (jmlTiket > 10) {
                diskon = 0.15;
            } 
            else {
                diskon = 0.0;
            }
            
            double hargaAwal = jmlTiket * hargaTiket;
            double potonganDiskon = hargaAwal * diskon;
            double hargaAkhir = hargaAwal - potonganDiskon;

            System.out.println("Harga Tiket: Rp " + hargaAwal);
            System.out.println("Diskon: Rp " + potonganDiskon);
            System.out.println("Total yang harus dibayar: Rp " + hargaAkhir);

            totalTiketHarian = totalTiketHarian + jmlTiket;
            totalPenjualanTiketPerHari = totalPenjualanTiketPerHari + hargaAkhir;
            
        } while (true);
        

        System.out.println("\nTotal Tiket Terjual: " + totalTiketHarian + " tiket");
        System.out.println("Total Penjualan Harian: Rp " + totalPenjualanTiketPerHari);
    }
}
