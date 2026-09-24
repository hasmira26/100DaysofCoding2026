import java.util.Scanner;

/**
 * Program menghitung luas persegi
 */
public class Day23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi: ");
        double sisi = input.nextDouble();

        double luas = sisi * sisi;

        System.out.println("Luas persegi = " + luas);

        input.close();
    }
}
