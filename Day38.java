import java.util.Scanner;

/**
 * mira
 */
public class mira {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("====MENU MAKANAN====");
        System.out.println("1.Nasi goreng");
        System.out.println("2.Mie ayam");
        System.out.println("3.Bakso");
        System.out.println("4.Ayam Bakar");
        System.out.println("====================");

        System.out.print("Pilih menu(1-4) : ");
        int menu = m.nextInt();
        
        if (menu == 1) {
            System.out.println("Anda memilih nasi goreng");
            System.out.println("Harga : Rp.15.000");
        }else if (menu == 2) {
            System.out.println("Anda memilih mie ayam");
            System.out.println("Harga : Rp.12.000");
        }else if (menu == 3) {
            System.out.println("Anda memilih Bakso");
            System.out.println("Harga : Rp.10.000");
        }else if (menu == 4) {
            System.out.println("Anda memilih Ayanm bakar");
            System.out.println("Harga : Rp.20.000");
        }else{
            System.out.println("pilihan tidak tersedia");
        }
        m.close();
    }
}
