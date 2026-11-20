import java.util.Scanner;

public class Day81{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah data: ");
        int n = input.nextInt();

        String[] data = new String[n];

        // Mengisi array
        for (int i = 0; i < n; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            data[i] = input.next();
        }

        // Menampilkan isi array
        System.out.println("\nIsi array:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Indeks " + i + ": " + data[i]);
        }

        input.close();
    }
}
