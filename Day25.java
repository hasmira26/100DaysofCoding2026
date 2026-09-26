import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner mira = new  Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkarang:");
        double r = mira.nextDouble();

        double luas = Math.PI*r*r;
        System.out.printf("Luas Lingkarang:%.2f%n1",luas );
    }
}
