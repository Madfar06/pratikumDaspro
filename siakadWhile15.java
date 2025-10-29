import java.util.Scanner;

public class siakadWhile15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int jml, nilai, i = 0;
       System.out.println("Massukan jumlah Mahasiswa : ");
       jml = sc.nextInt();
        

        while (i < jml) {
            System.out.println("Masukan nilai Mahasiswa ke  " + (i + 1) + ": ");
           nilai = sc.nextInt();

           if (nilai < 0|| nilai>100) {
            System.out.println("nilai tidak valid, Massukan lagi nilai yanng valid ");
            continue;
           }
           
           if (nilai > 80 && nilai <=100) {
            System.out.println("nilai mahasiswa ke " + (i + 1) + " adalah A " + nilai + " Bagus, pertahankan nilainya");
           }
           else if (nilai > 73 && nilai <=80) {
            System.out.println("Nilai mahasiswa ke " + (i +1) + " adalah B+");
           }
           else if (nilai > 65  && nilai <=73) {
            System.out.println("Nilai mahasiswa ke " + (i +1) + " adalah B");
           }
           else if (nilai > 60 && nilai <=65) {
            System.out.println("Nilai mahasiswa ke " + (i +1) + " adalah C");
           }
           else if (nilai > 50 && nilai <=60) {
            System.out.println("Nilai mahasiswa ke " + (i +1) + " adalah c+");
           }
           else if (nilai > 39 && nilai <=50) {
            System.out.println("Nilai mahasiswa ke " + (i +1) + " adalah D");
           }
           else {
            System.out.println("Nilai mahasiswa ke " + (i +1) + " adalah E");
           }
           i++; 
        }
    
    } 
   
}
