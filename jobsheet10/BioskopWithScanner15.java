import java.util.Scanner;

public class BioskopWithScanner15 {

    private static final int JUMLAH_BARIS = 4;
    private static final int JUMLAH_KOLOM = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[JUMLAH_BARIS][JUMLAH_KOLOM];
        int pilihan;

        while (true) {
            System.out.println("\n--- MENU BIOSKOP ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");

            if (sc.hasNextInt()) {
                pilihan = sc.nextInt();
                sc.nextLine(); 
            } else {
                System.out.println(" Input tidak valid. Silakan masukkan angka (1-3).");
                sc.nextLine();
                continue;
            }

            switch (pilihan) {
                case 1:
                    inputPenonton(sc, penonton);
                    break;
                case 2:
                    tampilkanPenonton(penonton);
                    break;
                case 3:
                    System.out.println("Terima kasih, program selesai.");
                    sc.close();
                    return; 
                default:
                    System.out.println("Pilihan tidak ada. Silakan pilih 1, 2, atau 3.");
            }
        }
    }

    public static void inputPenonton(Scanner sc, String[][] penonton) {
        String nama;
        int baris = 0, kolom = 0;
        boolean inputValid;
        boolean isInteger;

        System.out.print("Masukkan nama penonton: ");
        nama = sc.nextLine();

        do {
            inputValid = true; 
            isInteger = true; 

            
            System.out.print("Masukkan baris (1-" + JUMLAH_BARIS + "): ");
            if (sc.hasNextInt()) {
                baris = sc.nextInt();
            } else {
                System.out.println(" Input baris harus berupa angka.");
                sc.nextLine(); 
                isInteger = false;
                continue; 
            }

            System.out.print("Masukkan kolom (1-" + JUMLAH_KOLOM + "): ");
            if (sc.hasNextInt()) {
                kolom = sc.nextInt();
                sc.nextLine(); 
            } else {
                System.out.println(" Input kolom harus berupa angka.");
                sc.nextLine(); 
                isInteger = false;
                continue; 
            }

            if (!isInteger) {
                continue;
            }
            
            if (baris < 1 || baris > JUMLAH_BARIS || kolom < 1 || kolom > JUMLAH_KOLOM) {
                System.out.println(" WARNING: Kursi " + baris + "/" + kolom + " tidak tersedia. Silakan masukkan baris dan kolom kembali.");
                inputValid = false;
            } 
            else if (penonton[baris - 1][kolom - 1] != null) {
                String namaTerisi = penonton[baris - 1][kolom - 1];
                System.out.println(" WARNING: Kursi " + baris + "/" + kolom + " sudah terisi oleh " + namaTerisi + ". Silakan masukkan baris dan kolom kembali.");
                inputValid = false;
            }

        } while (!inputValid);

        penonton[baris - 1][kolom - 1] = nama;
        System.out.println(" Kursi " + baris + "/" + kolom + " berhasil direservasi untuk " + nama + ".");
    }

    public static void tampilkanPenonton(String[][] penonton) {
        System.out.println("\n--- DAFTAR KURSI BIOSKOP ---");
        
        for (int i = 0; i < penonton.length; i++) { 
            System.out.print("Baris " + (i + 1) + ": ");
            
            for (int j = 0; j < penonton[i].length; j++) { 
                String namaPenonton = penonton[i][j];
                
                String tampilan = (namaPenonton == null) ? "***" : namaPenonton;
                
                System.out.printf("[%7s] ", tampilan); 
            }
            System.out.println();
        }
    }
}