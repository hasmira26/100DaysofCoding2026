import java.util.Scanner;

public class r {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        System.out.println("=====hasil====");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
         System.out.println();
        }
    }
}
