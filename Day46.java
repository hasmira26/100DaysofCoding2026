import java.util.Scanner;

/**
 * mira
 */
public class mira {

    public static void main(String[] args) {
        Scanner m = new  Scanner(System.in);
        System.out.println("=====PILIH MENU MAKANAN=====");
        System.out.println("1. Mie Ayam     ");
        System.out.println("2. Nasi Goreng  ");
        System.out.println("3. Mie Bakso    ");
        System.out.println("4. Ayam kecap   ");
        System.out.print("Pilih menu (1 -4) :");
        int p = m.nextInt();

        switch (p) {
            case 1:
                System.out.println("Menu: Mie Ayam");
                System.out.println("Harga: Rp15.000");
                break;

            case 2:
                System.out.println("Menu: Nasi Goreng");
                System.out.println("Harga: Rp12.000");
                break;

            case 3:
                System.out.println("Menu:  Mie Bakso");
                System.out.println("Harga: Rp10.000");
                break;

            case 4:
                System.out.println("Menu: Ayam Bakar");
                System.out.println("Harga: Rp20.000");
                break;

            default:
                System.out.println("Pilihan menu tidak tersedia!");
                break;
        }

        m.close();

    }
}
