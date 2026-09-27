import java.util.Scanner;

/**
 * Day26
 */
public class Day26 {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int a = m.nextInt();
        int b = m.nextInt();

        int temp = a;
        a = b;
        b =temp;
        System.out.println(a);
        System.out.println(b);
    }
