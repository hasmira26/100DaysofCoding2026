import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 85) {
            System.out.println("Sangat Baik");
        } else if (nilai >= 75) {
            System.out.println("Baik");
        } else if (nilai >= 60) {
            System.out.println("Cukup");
        } else {
            System.out.println("Tidak Memenuhi");
        }
    }
}
