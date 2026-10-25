import java.util.Scanner;

/**
 * Ra
 */
public class Ra {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan N :");
        int n = m.nextInt();

        for(int i = 1; i <= n; i++) {
            if ((i % 3 == 0 || i % 4 == 0)
                 && ! (i % 3 == 0 && i % 4 == 0)) {
                System.out.println( i + "");
            }
        }
    }
}
