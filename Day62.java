import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris : ");
        int b = m.nextInt();
        for (int i = b; i>= 1; i--) {
            for(int j = i; j <= b; j++){
                System.out.print( j + "");
            }
            System.out.println();
        }
    }
}
