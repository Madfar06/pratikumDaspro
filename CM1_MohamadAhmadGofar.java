 
import java.util.Scanner;

public class CM1_MohamadAhmadGofar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int beasiswa;

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama\t:");
        String nama = sc.nextLine();
        System.out.print("NIM\t:");
        String nim = sc.nextLine();

           System.out.println("--- Mata Kuliah 1 : Algoritma dan Pemrograman ---");
        System.out.println("Nilai UTS: " );
        int UTS = sc.nextInt();
        System.out.println("Nilai UAS: ");
        int UAS = sc.nextInt();
        System.out.println("Nilai Tugas: ");
        int tugas = sc.nextInt();

        System.out.println("=== Mata Kuliah 2: Sturktur Data ===");
        System.out.println("Nilai UTS: ");
        int nilaiUTS = sc.nextInt();
        System.out.println("nilai UAS: ");
        int nilaiUAS = sc.nextInt();
        System.out.println("Nilai Tugas: ");
        int nilaiTugas = sc.nextInt();



        double nilaiAkhir1 = (0.3 * UTS) + (0.4 * UAS) + (0.3 * tugas);
        double nilaiAkhir2 = (0.3 * nilaiUTS) + (0.4 * nilaiUAS) + (0.3 * nilaiTugas);

        String nilai1;
        if (nilaiAkhir1 > 80){
            nilai1 = "A";  
        }
         else if (nilaiAkhir1 > 73){
            nilai1 = "B+";
        }
        else if (nilaiAkhir1 > 65){
            nilai1 = "B";
        }
        else if (nilaiAkhir1 > 60) {
            nilai1 = "c+";
        }
        else if (nilaiAkhir1 > 50) {
            nilai1 = "C";
        }
        else if (nilaiAkhir1 > 39) {
            nilai1 = "D";
        }
        else {
            nilai1 = "E";
        }
        
       String nilai2;
       if (nilaiAkhir2 > 80) {
            nilai2 = "A";
        } 
        else if (nilaiAkhir2 > 73) {
            nilai2 = "B+";
        }
        else if (nilaiAkhir2 > 65) {
            nilai2 = "B";
        }
        else if (nilaiAkhir2 > 60) {
            nilai2 = "C+";
        }
        else if (nilaiAkhir2 > 50) {
            nilai2 = "C";
        }
        else if (nilaiAkhir2 > 39) {
            nilai2 = "D";
        }
        else {
            nilai2 = "E";
    }

    double ratarata = (nilaiAkhir1 + nilaiAkhir2) /2;

    String statusSemester;
    if (ratarata >= 60) {
        statusSemester = "LULUS";
    } 

    else {
        statusSemester = "TIDAK LULUS";
    }
    
    System.out.println("\n============ HASIL PENILAIAN AKADEMIKA =============");
    System.out.println("Nama\t" + nama);
    System.out.println("NIM\t" + nim);
    System.out.println("\nMata kuliah\t\t\t UTS\t UAS\t tugas\t\t Nilai Akhir\t Nilai Huruf\t Status"  );
    System.out.println("-------------------------------------------------------------------------------------------------------------------------");
    System.out.println("Algoritma dan Pemrograman\t " + UTS  + "\t" + UAS + "\t"  + tugas + "\t\t" + nilaiAkhir1 + "\t\t" + nilai1 + "\t\t" + statusSemester);
    System.out.println("Struktur pemrograman\t\t " + nilaiUTS  + "\t" + nilaiUAS + "\t"  + nilaiTugas + "\t\t" + nilaiAkhir2 + "\t\t" + nilai2 + "\t\t" + statusSemester);
    System.out.println("\n ratarata Nilai Akhir " + ratarata );
    System.out.println("Status Semester " + statusSemester );
   
    
     
      
    }
}
