import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("MAsukkan nama :");
        String nama = m.nextLine();

        //menghapus spasi
        String bersih = nama.trim();
        //Mengammbil sebagian teks
        String potong = nama.substring(0, 3);
        //Mengganti teks
        String ganti = bersih.replace("has", "mira");

        System.out.println("\n====Hasil Manipulasi====");
        System.out.println("Nama Asli       :" + nama);
        System.out.println("setelah trim    :" + bersih);
        System.out.println("Nama substring  :" + potong);
        System.out.println("Nama replace    :" + ganti);
    }
}
