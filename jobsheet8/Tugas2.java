import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("Masukkan nilai n (minimal 3): ");
            

            while (!sc.hasNextInt()) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                System.out.print("Masukkan nilai n (minimal 3): ");
                sc.next(); 
            }
            
            n = sc.nextInt();
            
            if (n < 3) {
                System.out.println("Nilai n minimal adalah 3. Silakan coba lagi.");
            }
            
        } while (n < 3);

        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n);
                } else {
                    System.out.print(" ");
                }

                if (j < n) {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
        sc.close();
    }
}