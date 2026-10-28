import java.util.Scanner;

/**
 * Day57
 */
public class Day57 {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan nilai N:");
        int N = m.nextInt();
        System.out.println("Angka ganjil dari 1 sampai " + N + ":");

        for (int i = 1; i <= N;i++){
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\nAngka genap dari 1 sampai " + N + ":");

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
