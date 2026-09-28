import java.util.Scanner;

public class increment {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan Angka       :");
        int angka = m.nextInt();
        System.out.println("Masukkan nilai awal  :"  + angka);

        angka++;
        System.out.println("setlah incrament(++) :" + angka);
        angka--;
        System.out.println("setlah decrement(++) :" + angka);
    }
}
