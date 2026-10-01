import java.util.Scanner;

/**
 * Day30
 */
public class Day30 {

    public static void main(String[] args) {
        Scanner m = new  Scanner(System.in);
        System.out.print("Masukkan nilai a:");
        int a = m.nextInt();
        System.out.print("Masukkan nilai b:");
        int b = m.nextInt();

        //pengunaan >= =<
        System.out.println(a >= b);
        System.out.println(a <= b);
    }
}
