import java.util.Scanner;

/**
 * Day60
 */
public class Day60 {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan nilai N  :");
        int n = m.nextInt();
        int jumlah = 0;
        for(int i = 1;i <= n; i++){
            jumlah = jumlah + i;

        }
        System.out.println("Jumlah angka 1 sampai " + n + " = " + jumlah);
    }
}
