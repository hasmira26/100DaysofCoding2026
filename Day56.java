import java.util.Scanner;

/**
 * Day54
 */
public class Day55 {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int n = m.nextInt();

        //mencetak angka satu sampai N
        System.out.print("Angka 1 sampai N : ");
        for (int i = 1;i <= n;i++){
            System.out.print(i + " ");
        }
        System.out.println();

        //Mencetak N - 1
         System.out.print("Angka N sampai 1 : ");
        for(int i = n; i>= 1; i--){
            System.out.print(i + " ");
        }
    }
}
