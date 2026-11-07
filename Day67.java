import java.util.Scanner;

/**
 * Day67
 */
public class Day67 {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan ukuran persegi: ");
        int n = m.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
    }
}
}
