

import java.util.Scanner;

public class Square15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan nilai N =");
        int N = sc.nextInt();
        
    for (int x = 1; x <= N; x++) {
        for ( int i = 0; i <= N; i++) {
         System.out.print("*");
        }
         System.out.println();
    }    
        }  
}
