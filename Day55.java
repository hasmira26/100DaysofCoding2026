
import java.util.Scanner;

public class Keyword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int batas = input.nextInt();

        for (int i = 1; i <= batas; i++) {

            if (i == 3) {
                continue;
            }

            if (i == 7) {
                break;
            }

            System.out.println("Angka: " + i);

            if (i == 5) {
                input.close();
                return;
            }
        }

        input.close();
    }
}
