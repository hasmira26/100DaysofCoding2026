
import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        int angka;
        int total = 0;

        System.out.println("Masukkan angka negatif untuk berhenti");

        while (true) {
            System.out.print("Masukkan angka: ");
            angka = m.nextInt();

            if (angka < 0) {
                break;
            }

            total += angka;
        }

        System.out.println("==================");
        System.out.println("Total penjumlahan: " + total);

        m.close();
    }
}
