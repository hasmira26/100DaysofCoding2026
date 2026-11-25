import java.util.Arrays;
import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int angka = sc.nextInt();

        if (angka <= 0) {
            System.out.println("Jumlah data harus lebih dari 0.");
            sc.close();
            return;
        }

        int[] array = new int[angka];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        int numMin = Arrays.stream(array).min().orElse(0);
        int numMax = Arrays.stream(array).max().orElse(0);

        System.out.println("Data terkecil: " + numMin);
        System.out.println("Data terbesar: " + numMax);

        sc.close();
    }
}
