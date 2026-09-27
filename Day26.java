import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        int a = m.nextInt();
        int b = m.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
