import java.util.Scanner;

/**
 * day17
 */
public class day17 {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);

        System.out.print("masukkan nilai \t:");
        int nilai = d.nextInt();

        nilai += 3;
        System.out.println("Setelah +=\t" + nilai);

        nilai  -= 5;
        System.out.println("Setelah -=\t" + nilai);

        nilai *= 2;
        System.out.println("Setelah *=\t" + nilai); 

        nilai /= 4;
        System.out.println("Setelah /=\t" + nilai);

        nilai %= 4;
        System.out.println("Setelah %=\t" + nilai);
    }
}
