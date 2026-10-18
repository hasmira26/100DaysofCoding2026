import java.util.Scanner;

public class soal {
    public static void main(String[] args) {
        Scanner m = new  Scanner(System.in);
        System.out.println("======MASUKKAN NOMOR HARI======");
        System.out.println("1. SENIN");
        System.out.println("2. SELASA");
        System.out.println("3. RABU");
        System.out.println("4. KAMIS");
        System.out.println("5. JUMAT");
        System.out.println("6. SABTU");
        System.out.println("7. MINGGU");
        System.out.print("PILIH HARI (1-7): ");
        int p = m.nextInt();
        switch (p) {
            case 1:
                System.out.println("1 = SENIN");
                break;
            case 2:
                System.out.println("2 = SELASA");
                break;
            case 3:
                System.out.println("3 = RABU");
                break; 
            case 4:
                System.out.println("4 = KAMIS");
                break;
            case 5:
                System.out.println("5 = JUMAT");
                break;
            case 6:
                System.out.println("6 = SABTU");
                break; 
            case 7:
                System.out.println("7 = MINGGU");
                break; 
            default:
                System.out.println("NOMOR HARI TIDAK VALID");
                break;
    }
}
}
