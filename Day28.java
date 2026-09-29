import java.util.Scanner;

/**
 * Day28
 * Operator Perbandingan == dan !=
 */
public class Day28 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();

        // Menggunakan operator ==
        if (a == b) {
            System.out.println("== : Nilai a dan b sama");
        }

        // Menggunakan operator !=
        if (a != b) {
            System.out.println("!= : Nilai a dan b berbeda");
        }
    }
}
