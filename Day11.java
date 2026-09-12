import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();
        
        System.out.println("Halo " + nama + ", umur Anda " + umur + " tahun.");
        
        input.close(); 
    
    }
}
