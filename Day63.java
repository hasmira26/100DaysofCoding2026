import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner r  = new Scanner(System.in);
        System.out.print("Masukkan nilai M :");
        int m = r.nextInt();
        System.out.print("Masukkan nilai N :");
        int n = r.nextInt();

        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * m ;

        }
        System.out.println(m + " pangkat " + n + " = " + hasil);
    }
}
