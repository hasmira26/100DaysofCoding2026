import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = m.nextLine();

        System.out.println("\n===== HASIL PENGECEKAN =====");
        System.out.println("Aapakah nama saya Mira? " + nama.equals("Hasmira"));
        System.out.println("Aapakah nama saya Mira? " + nama.equalsIgnoreCase("Hasmira"));
        System.out.println("Aapakah mengandung huruf a? " + nama.contains("Hasmira"));
        System.out.println("Aapakah nama kosong? " + nama.isEmpty());
    }
}
