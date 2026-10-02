import java.util.Scanner;

/**
 * Day31
 */
public class Day31 {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan Umur         :");
        int umur = m.nextInt();
        System.out.print("Punya kartu Mahasiswa :");
        boolean kartu = m.nextBoolean();

        //AND,OR,NOT
        System.out.println("AND : " + (umur >= 18 && kartu));
        System.out.println("OR  : " + (umur >= 18 || kartu));
        System.out.println("NOT : " + (!kartu));
    }
}
