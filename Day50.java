import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan bilangan   :");
        int b = m . nextInt();
        String hasil = (b % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Bilangan :" + hasil);
    }
}
