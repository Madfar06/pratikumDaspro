import java.util.Scanner;

public class switchCaseKRS15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Cetak KRS Siakad---");
        System.out.print("Masukan semester saaat ini ");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
                System.out.println("KRS semsester 1 di tampilkan"); 
                break;
            case 2:
            System.out.println("KRS Semester 2 di tampilkan");
                break;
            case 3:    
            System.out.println("KRS Semester 3 di tampilkan");
                break;
            case 4:
            System.out.println("KRS Semester 4 di tampilkan");
                break;
            case 5:
            System.out.println("KRS Semester 5 di tampilkan");
                break;
            case 6:
            System.out.println("KRS Semester 6 di tampilkan");
                break;
            case 7:
            System.out.println("KRS Semester 7 di tampilkan");
                break;
            case 8:
            System.out.println("KRS Semester 8 di tampilkan");
                break;

            default:
            System.out.println("semester tidak valid");
                break;
        }
    }
}
