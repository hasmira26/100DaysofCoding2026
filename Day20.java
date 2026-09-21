import java.util.Scanner;

/**
 * Mengubah tipe data primitif ke String
 * kicaumania caping(String.valueOf(variabel));
 */
public class kicaumania {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat:");
        int a = m.nextInt();
        System.out.print("Masukkan bilangan desimal:");
        double b = m.nextDouble();
        System.out.print("Masukkan bilangan bolean:");
        boolean c = m.nextBoolean();

        //Konversi ke String
        String aString = String.valueOf(a);
        String bString = String.valueOf(b);
        String cString = String.valueOf(c);

        System.out.println("\n=====HASIL KONVERSI=====");
        System.out.println("int -> String" + aString);
        System.out.println("doubel -> String" + bString);
        System.out.println("bolean -> String" + cString);
        m.close();
    }
}
