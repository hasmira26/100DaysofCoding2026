import java.util.Scanner;

/**
 * Day32
 */
public class Day32 {

  public static void main(String[] args) {
  
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas: ");
        int tugas = m.nextInt();

        System.out.print("Masukkan nilai ujian: ");
        int ujian = m.nextInt();

        System.out.print("Masukkan kehadiran (%): ");
        int kehadiran = m.nextInt();

        // Menghitung nilai rata-rata
        int rataRata = (tugas + ujian) / 2;

        System.out.println("Nilai rata-rata: " + rataRata);

        // Mengkombinasikan operator perbandingan dan logika
        if (tugas >= 75 && ujian >= 70 && kehadiran >= 80) {
            System.out.println("Status: LULUS");
        } else {
            System.out.println("Status: TIDAK LULUS");
        }
    

  }
}
