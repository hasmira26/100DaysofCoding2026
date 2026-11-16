import java.util.Scanner;

public class day77 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan Nama   :");
        String nama = m.nextLine();

        System.out.println("\n==== Hasil ====");
        // 1. menghitung karakter
        System.out.println("Jumlah karakter : " + nama.length());

        // 2. Mengubah menjadi huruf besar
        System.out.println("Huruf besar     : " + nama.toUpperCase());

        // 3. Mengubah menjadi huruf kecil
        System.out.println("Huruf kecil     : " + nama.toLowerCase());

        // 4. Menghapus spasi awal dan akhir
        System.out.println("Nama bersih     : " + nama.trim());

        // 5. Mengambil karakter pertama
        System.out.println("Karakter pertama: " + nama.charAt(0));

        // 6. Mengambil 3 karakter pertama
        if (nama.length() >= 3) {
            System.out.println("3 karakter awal : " + nama.substring(0, 3));
        }

        // 7. Membandingkan nama
        System.out.println("Apakah nama Mira? : " + nama.equals("Mira"));

        // 8. Membandingkan tanpa memperhatikan huruf besar/kecil
        System.out.println("Apakah nama mira? : " + nama.equalsIgnoreCase("mira"));

        // 9. Memeriksa apakah mengandung kata
        System.out.println("Mengandung 'a'? : " + nama.contains("a"));

        // 10. Mengganti huruf
        System.out.println("Mengganti a menjadi o: " + nama.replace("a", "o"));

    }
}
