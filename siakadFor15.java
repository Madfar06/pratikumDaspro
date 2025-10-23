import java.util.Scanner;

public class siakadFor15 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double nilai, tertinggi = 0, terrendah = 100;
  
    for ( int i = 1 ; i <= 10; i++ ) {
        System.out.println("Masukan nilai mahasiswa ke-" + i + " : ");
        nilai = sc.nextDouble();
        if (nilai > tertinggi ) {
            tertinggi = nilai;
        }
        if (nilai < terrendah) {
            terrendah = nilai;
        }
       
     }
        System.out.println("nilai tertinggi: " + tertinggi);
        System.out.println("nilai terrendah : " + terrendah);
    
    }
}

