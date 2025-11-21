import java.util.Scanner;

public class bioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, baris, kolom, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Masukan nama");
            nama = sc.nextLine();
            System.out.println("Masukan baris ");
            baris = sc.nextLine();
            System.out.println("Masukan kolom");
            kolom = sc.nextLine();
            sc.nextLine();

            int baris_index = Integer.parseInt(baris);
            int kolom_index = Integer.parseInt(kolom);

            penonton[baris_index -1][kolom_index -1] = nama;

            System.out.println("Input penonton lainya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
