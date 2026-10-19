import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Bilangan 1    :");
        double a = m.nextDouble();
        System.out.print("Bilangan 2    :");
        double b = m.nextDouble();
        System.out.print("Pilih operator:");
        char perhitungan = m.next().charAt(0);
        double hasil;

        switch (perhitungan) {
            case '+':
                hasil = a + b ;
                System.out.println("Hasil Penjumlahan   :" + hasil);
                break;
            case '-':
                hasil = a - b ;
                System.out.println("Hasil Pengurangan   :" + hasil);
                break;
            case '*':
                hasil = a * b ;
                System.out.println("Hasil Perkalian     :" + hasil);
                break;
            case '/':
                 if (b != 0) {
                    hasil = a / b;
                    System.out.println("Hasil Pembagian   : " + hasil);
                } else {
                    System.out.println("Tidak bisa membagi dengan nol!");
                }
                break;
            default:
                System.out.println("Operator tidak valid");
                break;
        }

    }
}
