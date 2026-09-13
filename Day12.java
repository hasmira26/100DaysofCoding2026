import java.util.Scanner;

public class BiodataScanner {
    public static void main(String[] args) {
       

        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan Nama Lengkap  : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Umur          : ");
        int umur = input.nextInt();
        input.nextLine(); 

        System.out.print("Masukkan Alamat        : ");
        String alamat = input.nextLine();

        System.out.print("Masukkan Tinggi Badan  : ");
        double tb = input.nextDouble();

        // Output biodata
        System.out.println("\n=========== BIODATA ===========");
        System.out.println("Nama         : " + nama);
        System.out.println("Umur         : " + umur + " tahun");
        System.out.println("Alamat       : " + alamat);
        System.out.println("tb           : " + tb + "cm");
        System.out.println("================================");

        input.close();
    
    }
}
