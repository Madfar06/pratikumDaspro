public class tugas1 {

    public static void main(String[] args) {
        
        for (int n = 1; n <= 5; n++) {
            int jumlah = 0;
            String detailpemjumlahan = "";
            for (int i = 1; i <= n; i++) {
                int kuadrat = i*i;
                jumlah += kuadrat;

                if (i == 1) {
                    detailpemjumlahan += kuadrat;
                } else {
                    detailpemjumlahan += " + " + kuadrat;
                }
            }
            System.out.print("n = " + n + "-> jumlah kuatdrat ");
            if ( n == 1) {
                System.out.println(jumlah);
            } else {
                System.out.println(detailpemjumlahan + "=" +jumlah );
            }
        }
    }
}