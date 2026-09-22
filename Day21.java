/**
 * Program menukar dua nilai variabel
 */
import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
      
        Scanner r = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = r.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = r.nextInt();

        System.out.println("\nSebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Proses menukar nilai
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nSetelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        r.close();
    

    }
}
