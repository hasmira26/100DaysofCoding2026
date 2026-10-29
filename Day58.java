import java.util.Scanner;

public class CetakGanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input nilai N dari pengguna
        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();
        
        System.out.println("\n--- Menggunakan Nilai N = " + n + " ---");
        
        // 1. Mencetak Angka Ganjil dari 1 sampai N-1
        System.out.print("Angka Ganjil dari 1 hingga " + (n - 1) + ": ");
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Baris baru
        
        // 2. Mencetak Angka Genap dari 1 sampai N-1
        System.out.print("Angka Genap dari 1 hingga " + (n - 1) + ": ");
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Baris baru
        
        scanner.close();
    }
}
