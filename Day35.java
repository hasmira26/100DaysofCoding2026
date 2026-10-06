import java.util.Scanner;

/**
 * r
 */
public class r {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("masukkan bilangan:");
        int n = m.nextInt();
      if (n % 2 == 0) {
            System.out.println("bilangan genap");
        if (n % 4 == 0) {
            System.out.println("kelipatan 4");
        }
      }else{
        System.out.println("bilangan ganjil");
      }
        
    }
}
