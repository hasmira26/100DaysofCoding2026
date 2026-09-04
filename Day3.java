/**
 * Penggunaan Escape Sequence (\n, \t, dan lain lain).
 * Hasmira
 */

public class EscapeQuence {
    public static void main(String[] args) {
         // \n - baris baru
        System.out.println("Baris pertama\nBaris kedua");

        // \t - tab
        System.out.println("Nama:\tMira");
        System.out.println("Umur:\t20");

        // \" - kutip dalam string
        System.out.println("Dia berkata: \"Halo dunia!\"");

        // \\ - backslash literal
        System.out.println("Lokasi file: C:\\Users\\Budi\\Documents");

        // \' - digunakan pada char, bukan String
        char kutip = '\'';
        System.out.println("Karakter kutip: " + kutip);
    }
}
