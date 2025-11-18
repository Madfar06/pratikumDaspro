import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int totalPelangganKeseluruhan = 0;
        int totalItemKeseluruhan = 0;

        System.out.println("=== Program Pencatatan Penjualan Kafe 'Kopi Senja' ===");
        int jumlahCabang;
        
        do {
            System.out.print("Masukkan jumlah cabang yang akan dicatat: ");
            if (sc.hasNextInt()) {
                jumlahCabang = sc.nextInt();
                if (jumlahCabang > 0) {
                    break;
                } else {
                    System.out.println("Jumlah cabang harus lebih dari 0. Silakan coba lagi.");
                }
            } else {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                sc.next();
                jumlahCabang = 0; 
            }
        } while (jumlahCabang <= 0);
        
        sc.nextLine(); 
        
        System.out.println("\n--- Memulai Pencatatan Penjualan Per Cabang ---\n");

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("--- Cabang ke-" + i + " ---");
            
            int jumlahPelangganCabang = 0;
            
            do {
                System.out.print("  Masukkan jumlah pelanggan yang dilayani hari ini: ");
                if (sc.hasNextInt()) {
                    jumlahPelangganCabang = sc.nextInt();
                    if (jumlahPelangganCabang >= 0) {
                        break;
                    } else {
                        System.out.println("  Jumlah pelanggan tidak boleh negatif. Silakan coba lagi.");
                    }
                } else {
                    System.out.println("  Input tidak valid. Harap masukkan angka.");
                    sc.next(); 
                    jumlahPelangganCabang = -1; 
                }
            } while (jumlahPelangganCabang < 0);
            
            int totalItemCabang = 0;

            for (int j = 1; j <= jumlahPelangganCabang; j++) {
                int jumlahItemPelanggan = 0;
                
                do {
                    System.out.printf("    Pelanggan ke-%d: Masukkan jumlah item yang dipesan (makanan/minuman): ", j);
                    if (sc.hasNextInt()) {
                        jumlahItemPelanggan = sc.nextInt();
                        if (jumlahItemPelanggan >= 1) {
                            totalItemCabang += jumlahItemPelanggan;
                            break;
                        } else {
                            System.out.println("    Jumlah item minimal 1. Silakan coba lagi.");
                        }
                    } else {
                        System.out.println("    Input tidak valid. Harap masukkan angka.");
                        sc.next(); 
                        jumlahItemPelanggan = 0; 
                    }
                } while (jumlahItemPelanggan < 1);
            }
            
            
            sc.nextLine(); 

            System.out.println("\n  Ringkasan Penjualan Cabang ke-" + i + ":");
            System.out.println("    - Total Pelanggan: " + jumlahPelangganCabang + " orang");
            System.out.println("    - Total Item Terjual: " + totalItemCabang + " item");
            System.out.println();
            
            totalPelangganKeseluruhan += jumlahPelangganCabang;
            totalItemKeseluruhan += totalItemCabang;
        }

        System.out.println("=================================================");
        System.out.println("         RINGKASAN PENJUALAN KESELURUHAN");
        System.out.println("=================================================");
        System.out.println("  Total Seluruh Pelanggan: " + totalPelangganKeseluruhan + " orang");
        System.out.println("  Total Seluruh Item Terjual: " + totalItemKeseluruhan + " item");
        System.out.println("=================================================");

        sc.close();
    }
}
    

