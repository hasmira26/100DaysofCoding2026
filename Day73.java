import java.util.Scanner;

public class DoWhhile {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        int p;

        do {
            System.out.println("1. Nasi goreng");
            System.out.println("2. Jus jeruk");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");

            p = m.nextInt();

            if (p == 1) {
                System.out.println("Nasi goreng");
            } else if (p == 2) {
                System.out.println("Jus jeruk");
            } else if (p == 3) {
                System.out.println("Program selesai");
            } else {
                System.out.println("Pilihan salah");
            }

        } while (p != 3);

        m.close();
    }
}
