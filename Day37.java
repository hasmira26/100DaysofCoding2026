import java.util.Scanner;

public class CekBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.println(angka + " adalah bilangan positif");
        } else if (angka < 0) {
            System.out.println(angka + " adalah bilangan negatif");
        } else {
            System.out.println("Bilangan tersebut adalah nol");
        }

        input.close();
    }
}
