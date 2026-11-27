
import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilai = {70, 80, 85, 90, 95};
        int pilihan;

        do {
            System.out.println("\n=== MENU MANIPULASI ARRAY ===");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Ubah Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.println("\nData Array:");
                    for (int i = 0; i < nilai.length; i++) {
                        System.out.println("Indeks " + i + " = " + nilai[i]);
                    }
                    break;

                case 2:
                    System.out.print("Masukkan indeks yang ingin diubah: ");
                    int indeks = input.nextInt();

                    if (indeks >= 0 && indeks < nilai.length) {
                        System.out.print("Masukkan nilai baru: ");
                        nilai[indeks] = input.nextInt();

                        System.out.println("Data berhasil diubah!");
                    } else {
                        System.out.println("Indeks tidak ditemukan!");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nilai yang dicari: ");
                    int cari = input.nextInt();

                    boolean ditemukan = false;

                    for (int i = 0; i < nilai.length; i++) {
                        if (nilai[i] == cari) {
                            System.out.println("Data ditemukan!");
                            System.out.println("Indeks: " + i);
                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 4);
    }
}
