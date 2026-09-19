public class Day18 {
    public static void main(String[] args) {
        
        // 1. Rantai konversi otomatis: kecil -> besar
        int angka = 100;
        long besar = angka; 
        double desimal = angka; 
            
        System.out.println("int    : " + angka);
        System.out.println("long   : " + besar);
        System.out.println("double : " + desimal);

        // 2. byte + byte hasilnya int (bukan byte)
        byte a = 10;
        byte b = 20;
        int jumlah = a + b;         
        System.out.println("byte + byte = " + jumlah);

        // 3. Hasil operasi mengikuti tipe yang paling besar
        int i = 5;
        long l = 10L;
        double d = 2.5;
        long hasil1 = i + l;        
        double hasil2 = i + d;      
        System.out.println("int + long   = " + hasil1);
        System.out.println("int + double = " + hasil2);

        // 4. long -> float: boleh otomatis, tapi ketelitian bisa berkurang
        long angkaBesar = 123456789L;
        float f = angkaBesar;
        System.out.println("long  : " + angkaBesar);
        System.out.println("float : " + f);

        // 5. Angka long yang besar butuh huruf L
        long populasi = 10000000000L;
        System.out.println("Populasi: " + populasi);

        // 6. char -> int (kode ASCII)
        char huruf = 'A';
        int kode = huruf;
        System.out.println("Kode ASCII '" + huruf + "' = " + kode);

        // 7. Contoh nyata: hitung harga dengan diskon
        int harga = 50000;
        double diskon = 0.15;
        double potongan = harga * diskon;  
        double bayar = harga - potongan;
        System.out.println("Potongan : " + potongan);
        System.out.println("Bayar    : " + bayar);
    

    }
}
