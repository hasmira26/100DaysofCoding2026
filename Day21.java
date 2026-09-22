import java.util.Scanner;

/**
 * Mengubah String menjadi tipe data primitif
 */
public class day22{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        String strInt = input.nextLine();

        System.out.print("Masukkan bilangan desimal: ");
        String strDouble = input.nextLine();

        System.out.print("Masukkan nilai true/false: ");
        String strBoolean = input.nextLine();

        // Mengubah String menjadi tipe data int
        int angka = Integer.parseInt(strInt);

        // Mengubah String menjadi tipe data double
        double desimal = Double.parseDouble(strDouble);

        // Mengubah String menjadi tipe data boolean
        boolean status = Boolean.parseBoolean(strBoolean);

        System.out.println("\n=== Hasil Konversi ===");
        System.out.println("String int     : " + strInt);
        System.out.println("Menjadi int    : " + angka);

        System.out.println("String double  : " + strDouble);
        System.out.println("Menjadi double : " + desimal);

        System.out.println("String boolean : " + strBoolean);
        System.out.println("Menjadi boolean: " + status);

        input.close();
    }
}
