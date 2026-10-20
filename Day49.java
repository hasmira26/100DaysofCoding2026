import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan angka:");
        int angka = m.nextInt();
        String hasil = (angka % 2 == 0) ? "Genap":"Ganjil";
        System.out.println("Hasil   :" + hasil);
        m .close();
    }
}
