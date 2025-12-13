package jobsheet11;

import java.util.Scanner;

public class kafe15 {
    public static void menu(String namaPelanggan, boolean isMember,String kodePromo){
        System.out.println("selamat datang " + namaPelanggan + "!");
        if (isMember) {
         System.out.println("Selamat datang " + namaPelanggan + ", Anda mendapatkan diskon 10% setiap pebelian!");
        } 

        if (kodePromo.equals ("DISKON50")) {
         System.out.println("Selamat datang " + namaPelanggan + ", Anda mendapatkan potongan harga sebesar 50 %!");      
        }
        else if (kodePromo.equals ("DISKON30")) {
         System.out.println("Selamat datang " + namaPelanggan + ", Anda mendapatkan potongan harga sebesar 30 %!");      
        }
        else {
            System.out.println("Kode promo tidak valid.");
        }

     System.out.println("====== Menu Resto Kafe ========");   
     System.out.println("1. kopi hitam - Rp. 15,000");   
     System.out.println("2. cappucino - RP. 20,000");   
     System.out.println("3. latte - Rp. 22,000");   
     System.out.println("4. teh tarik - Rp. 12,000");   
     System.out.println("5. roti bakar - Rp. 10,000");   
     System.out.println("6. mie goreng - Rp. 18,000");   
     System.out.println("==================================");   
     System.out.println("silakan pilih menu yang anda inginkan");  
     
     
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem){
        Scanner sc = new Scanner(System.in);
        int[] hargaItem = {15000,20000,22000,12000,10000,18000};
        int totalHarga = hargaItem[pilihanMenu - 1] *  banyakItem;
        return totalHarga;
    }
    public static void pesanMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\npilih nomer menu yang ingin anda pesan : ");
        int pilihanMenu = sc.nextInt();
        System.out.println("Maasukan jumlah item yang ingin di pesan : ");
        int banyakitem = sc.nextInt();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakitem);
        System.out.println("total harga untuk pesanan anda : Rp." + totalHarga);
    }
    public static void main(String[] args) {
    menu("andi",true,"DISKON30");
    hitungTotalHarga(2,3);
    pesanMenu();
    }
}
