import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        String nama = c.nextLine();
        int umur = c.nextInt();
        c.nextLine();
        String hobi = c.nextLine();
        float ipk = c.nextFloat();

        System.out.printf("nama saya adalah %s,umur saya %d,dan hobi saya %s.Makanya ipk saya %.2f ",nama,umur,hobi,ipk);

    }
}
