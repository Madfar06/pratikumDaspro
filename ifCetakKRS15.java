import java.util.Scanner;

public class ifCetakKRS15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---cetak KRS SIAKAD---");
        System.out.print("apakah UKT sudah lunas (true/false): ");
        boolean uktLunas = sc.nextBoolean();
        

        if (uktLunas) {
            System.out.println("pembayaran UKT terverifikasi");
            System.out.println("silakan cetak KRS dan minta tanda tangan DPA");
           }
           else  {System.out.println("Register di tolak. Silakan lunasi UKT terlebih dahulu.");}
        
        }
} 
