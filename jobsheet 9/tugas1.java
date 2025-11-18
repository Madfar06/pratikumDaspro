import java.util.Scanner; 

public class tugas1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahNilai = sc.nextInt();

        if (jumlahNilai <= 0) {
            System.out.println("Jumlah nilai harus lebih dari 0.");
            sc.close();
            return; 
        }

        int[] daftarNilai = new int[jumlahNilai];

        long total = 0;
        int nilaiTertinggi = Integer.MIN_VALUE; 
        int nilaiTerendah = Integer.MAX_VALUE;  

        System.out.println("----------------------------------------");
        
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            int nilai = sc.nextInt();
            
            daftarNilai[i] = nilai;
            
            total += nilai;
            
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }
        System.out.println("----------------------------------------");

        double rataRata = (double) total / jumlahNilai;

        System.out.println("\n--- Hasil Analisis Nilai ---");
        System.out.println("Nilai Rata-rata : " + rataRata);
        System.out.println("Nilai Tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai Terendah  : " + nilaiTerendah);

        System.out.println("\n--- Daftar Semua Nilai ---");
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + daftarNilai[i]);
        }
        sc.close();
    }
}