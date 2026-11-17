import java.util.Scanner;

/**
 * login
 */
public class login {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        //Membuat akun
        System.out.println("\n===== Buat Akun =====");
        System.out.print("Masukkan Username : ");
        String user = m.nextLine();
        System.out.print("Masukkan Password : ");
        String pass = m.nextLine();
        System.out.println("\n Akun berhasil di buat! : ");

        //Proses Login
        String Username;
        String Password;

        do {
            System.out.println("\n==== LOGIN ====");
            System.out.print("Masukkan Username : ");
            Username = m.nextLine();
            System.out.print("Masukkan Password : ");
            Password = m.nextLine();
            if (!Username.equals(user) || !Password.equals(pass)) {
                System.out.println("\nUsername atau Password Salah!");
                System.out.println("Silahkan Coba Lagi!");
            }

        } while (!Username.equals(user) || !Password.equals(pass));
        System.out.println("\n Login Berhasil!");
        System.out.println("\n Selamat datang," + user);
    }
}
