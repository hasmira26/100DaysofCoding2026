import java.util.Scanner;

public class mr {
    public static void main(String[] args) {
        Scanner m = new  Scanner(System.in);
        System.out.print("Masukkan angka:");
        int a = m. nextInt();
        if (a % 2 == 0) {
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }
        m.close();
    }
}
