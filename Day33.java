import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = m.nextInt();

        if (umur >= 18) {
            System.out.println("Anda sudah dewasa");
        } else {
            System.out.println("Anda belum dewasa");
        }
    }
}
