import java.util.Scanner;

public class ifElseCetakKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Cetak KRS Siakad---");
        System.out.print("Masukan semester saat ini ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("anda semester 1");
        } else if (semester == 2) {
            System.out.println("anda semester 2");
        } else if (semester == 3) {
            System.out.println("anda semester 3");
        } else if (semester == 4) {
            System.out.println("anda semester 4");
        } else if (semester == 5) {
            System.out.println("anda semester 5");
        }
        else if (semester == 6) {
        System.out.println("anda semester 6");
        }
        else if (semester == 7) {
           System.out.println("anda semester 7");
       }
        else if (semester == 8) {
           System.out.println("anda semester 8");
       }
        
    }
}
