import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan nilai n:");
        int n = m.nextInt();
        int kolom =10;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= kolom; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
