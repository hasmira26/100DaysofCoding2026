import java.util.Scanner;

public class contoh {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.print("Masukkan nilai a\t:");
        int a = c.nextInt();
        System.out.print("Masukkan nilai b\t:");
        int b = c.nextInt();

        int hasilBagi = a/b;
        int sisaBagi = a%b;

        System.out.println("Hasil bagi\t\t:" + hasilBagi);
        System.out.println("Sisa bagib\t\t:" + sisaBagi);
    }
}
