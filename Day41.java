import java.util.Scanner;

/**
 * Day41
 */
public class Day41 {

    public static void main(String[] args) {
        Scanner m = new  Scanner(System.in);
        System.out.print("Masukkan suhu ruangan :");
        double s = m.nextDouble();
        System.out.println("=====KONDISI RUANGAN====");

        if (s < 18) {
            System.out.println("Suhu ruangan dingin");
        }else if (s <= 25) {
            System.out.println("Suhu ruangan normal");
            
        }else{
            System.out.println("Suhu ruangan panas");
        }
    }
}
