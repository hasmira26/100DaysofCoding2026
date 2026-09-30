/**
 * Operator perbandingan < >
 */
import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print(" Masukkan nilai a :");
        int a = m.nextInt();
        System.out.print(" Masukkan nilai b :");
        int b = m.nextInt();

        System.out.println(a>b);
        System.out.println(a<b);
    }
}
