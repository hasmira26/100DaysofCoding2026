import java.util.Scanner;

/**
 * Day64
 */
public class Day64 {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = m.nextInt();

        long hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        System.out.println("Faktorial dari " + n + " adalah: " + hasil);

        m.close();
    }
}
