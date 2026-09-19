import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        Scanner mira = new Scanner(System.in);
        System.out.print("Masukkan angka -128 sampai 127:");

        byte b = mira.nextByte();
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("byte        : " + b);
        System.out.println("short       : " + s);
        System.out.println("int         : " + i);
        System.out.println("long        : " + l);
        System.out.println("float       : " + f);
        System.out.println("double      : " + d);

        mira.close();
    }
}
