import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner m = new  Scanner(System.in);
        System.out.print("Masukkan bilangan 1 :");
        Double b = m.nextDouble();
        System.out.print("Masukkan bilangan 2 :");
        Double d = m.nextDouble();

        System.out.println("===== Kalkulator======");
        System.out.println("1.Penjumlahan (+)");
        System.out.println("2.Pengurangan (-)");
        System.out.println("3.Perkalian (*)");
        System.out.println("4.Pembagian (+)");

        System.out.println("Pilih operasi (1-4):");
        double h = m.nextDouble();
        if (h == 1) {
            System.out.println("Hasil:" + (b + d));
        }else if (h == 2) {
            System.out.println("Hasil:" + (b - d));
        }else if (h == 3) {
            System.out.println("Hasil:" + (b * d));  
        }else if (h == 4) {
            if (d != 0) {
                System.out.println("Hasil: " + (b / d));
            } else {
                System.out.println("Tidak bisa membagi dengan nol!");
            }
        }else{
            System.out.println("Tidak memenuhi");
        }
    }
}
