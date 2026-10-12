import java.util.Scanner;

/**
 * c
 */
public class c {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan karyawan     : ");
        String a = m.nextLine();
        System.out.print("Masukkan Gaji Pokok   : ");
        double b = m.nextDouble();
        System.out.print("Masukkan tunjangan    : ");
        double c = m.nextDouble();
        System.out.print("Masukkan potongan     : ");
        double d = m.nextDouble(); 

        double gajiBersih = b + d - c ;

        System.out.println("\n=======GAJI BERSIH======");
        System.out.println("Nama kartawan : " + a);
        System.out.println("Gaji pokok    : " + b);
        System.out.println("Tunjangan     : " + c);
        System.out.println("Potongan      : " + d);
        System.out.println("Gaji Bersih   : " + gajiBersih);
        }
    }
