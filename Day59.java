import java.util.Scanner;

/**
 * Day59
 */
public class Day59 {

    public static void main(String[] args) {
        Scanner r = new  Scanner(System.in);
        System.out.print("Masukkan nnilai M :");
        int m = r.nextInt();
        System.out.print("Masukkan nnilai N :");
        int n = r.nextInt();

        System.out.println("Bilangan kelipatan " + m + " dari 1 sampai " + n + ":");
        
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
