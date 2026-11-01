import java.util.Scanner;

/**
 * Day61
 */
public class Day61 {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkkan nnika N : ");
        int n = m.nextInt();
        int hasil = 1;
        
        for (int i = 1; i <= n; i++) {
            hasil = hasil*i;
        }
        System.out.println("Hasil perkalian angak 1 sampai " + n + " adalah: " + hasil);
    }
}
