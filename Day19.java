import java.util.Scanner;

public class nyonya {
    public static void main(String[] args) {
        Scanner cegil = new Scanner(System.in);

        System.out.print("double: ");
        double harga = cegil.nextDouble();
        int bulat = (int) harga;
        System.out.println("int: " + bulat);

        System.out.print("int: ");
        int besar = cegil.nextInt();
        byte kecil = (byte) besar;
        System.out.println("byte: " + kecil);

        System.out.print("long: ");
        long populasi = cegil.nextLong();
        int hasil = (int) populasi;
        System.out.println("int: " + hasil);

        System.out.print("int: ");
        int x = cegil.nextInt();
        short s = (short) x;
        System.out.println("short: " + s);

        char huruf = 'A';
        int kode = (int) huruf;
        System.out.println("kode: " + kode);

        System.out.print("kode: ");
        int angka = cegil.nextInt();
        char raorr = (char) angka;
        System.out.println("char: " + raorr);

        cegil.close();
    }
}
