import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner m = new  Scanner (System.in);
        System.out.print("Massukkan nilai : ");
        int n = m .nextInt();
        if (n >= 90) {
            System.out.println("Predikat    : A");
        }else if (n >= 80) {
            System.out.println("Predikat    : B");   
        }else if (n >= 70) {
            System.out.println("Predikat    : C");
        }else if (n >= 60) {
            System.out.println("Predikat    : D"); 
        }else{
            System.out.println("Predikat    : E");
        }
    }
}
