import java.util.Scanner;

public class siakadFor15 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double nilai, tertinggi = 0, terrendah = 100, nilaiMinimum = 60;
    int lulus = 0, tidakLulus = 0;

    for ( int i = 1 ; i <= 10; i++ ) {
        System.out.println("Masukan nilai mahasiswa ke-" + i + " : ");
        nilai = sc.nextDouble();
        if (nilai > tertinggi ) {
            tertinggi = nilai;
        }
        if (nilai < terrendah) {
            terrendah = nilai;
        }

        if ( nilai >=  nilaiMinimum ) {
            lulus++;
        } else {
            tidakLulus++;
        }
       
     }
        System.out.println("nilai tertinggi: " + tertinggi);
        System.out.println("nilai terrendah : " + terrendah);
        System.out.println("jumlah mahasiswa yang lulus " + lulus + " orang");
        System.out.println("jumlah mahasiswa yang tidak lulus " + tidakLulus + " orang");
    }
}

