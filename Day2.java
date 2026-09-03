 /**
  * Program untuk menampilkan biodata diri
  * Menggunakan Println(), Print(), Printf()
  */

public class BiodataDIri {
    public static void main(String[] args) {
        //====BIODATA MAHASISWA====//
        String Nama = "Hasmira";
        String Alamat = "Campalagian";
        String Tanggallahir = "26 juni 2007";
        int Umur = 19;
        double tb = 150.0;
        int bb = 45;
        String Hobi = "Nonton Dracin/Drakor";
        //====PENGGUNAAN PRINTLN====//
        System.out.println("====BIODATA MAHASISWA====");
        System.out.println("Nama        : " + Nama);
        System.out.println("Tanggallahir: " + Tanggallahir);
        System.out.println("Umur        : " + Umur);
    
        //====PENGGUNAAN PRINT====//
        System.out.print("Alamat        : ");
        System.out.print(Alamat);
        System.out.print("\n");
        //====PENGGUNAAN PRINTF====//
        System.out.printf("Hobi         : %s%n", Hobi);
        System.out.printf("Tinggi Badan : %.1f cm%n",tb);
        System.out.printf("Berat Badan  : %d kg%n", bb);

        System.out.println("=====================");



    }
}
