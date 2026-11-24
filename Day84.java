
import java.util.Scanner;

/**
 * Day84
 */
public class Day84 {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        int[] nilai = new int[5];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai: ");
            nilai[i] = m.nextInt();
        }

        // Menentukan nilai maksimal
        int angka = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > angka) {
                angka = nilai[i];
            }
        }

        // Menampilkan hasil
        System.out.println();
        System.out.println("==== Hasil ====");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println();
        System.out.println("Angka terbesar adalah: " + angka);

        
    }
}
