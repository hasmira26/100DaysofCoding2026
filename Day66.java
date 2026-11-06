import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("Masukkan panjang garis  :");
        int n = m.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("=");
        }
    }
}
