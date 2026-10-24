import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int angka;

        do  {
            System.out.print("Masukkan angka(0 untuk benrhenti):");
            angka = m.nextInt();

            System.out.println("Angka yang dimasukkan:" + angka);
    }while (angka !=0);
        System.out.println("Program selesai");
    }
}
