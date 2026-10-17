import java.util.Scanner;

public class total {
    public static void main(String[] args) {
        Scanner m = new  Scanner(System.in);
        System.out.print("Masukkan bilangan :");
        int b = m .nextInt();

        if ( b >= 80) {
            System.out.println("A");
        }else if (b >= 70) {
            System.out.println("B");
        }else if (b >= 60) {
            System.out.println("C");
        }else if (b <= 60) {  
            System.out.println("D");
        }else{
            System.out.println("Eror ");
        }
    }
}
