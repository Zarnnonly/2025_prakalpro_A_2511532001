package pekan7_2511532001;

import java.util.Scanner;

public class tugasAlproPekan7_2511532001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Akun_2511532001 akun = new Akun_2511532001();

        System.out.println("===== REGISTRASI AKUN BARU =====");

        System.out.print("Masukkan Username: ");
        akun.setUsername(input.nextLine());

        System.out.print("Masukkan Password: ");
        akun.setPassword(input.nextLine());

        System.out.print("Masukkan Email: ");
        akun.setEmail(input.nextLine());

        System.out.print("Masukkan PIN (6 digit): ");
        akun.setPinAngka(input.nextInt());

        System.out.println();

        if (!akun.isEmailValid()) {
            System.out.println("--- REGISTRASI GAGAL ---");
            System.out.println("Email Anda \"" + akun.getEmail() +
                    "\" tidak valid (harus mengandung '@' dan '.').");
            System.out.println("Silakan coba lagi.");
            return;
        }

        if (!akun.isPasswordValid()) {
            System.out.println("--- REGISTRASI GAGAL ---");
            System.out.println("Password minimal 8 karakter.");
            System.out.println("Silakan coba lagi.");
            return;
        }

        System.out.println("--- REGISTRASI BERHASIL ---");
        System.out.println("Akun untuk \"" + akun.getUsername() + "\" telah berhasil dibuat.\n");

        System.out.println("--- Detail Akun ---");
        System.out.println("Username (Lowercase): " + akun.getUsername().toLowerCase());
        System.out.println("Email (Uppercase)   : " + akun.getEmail().toUpperCase());
        System.out.println("ID Pengguna (Gabungan): " +
                akun.getUsername().toLowerCase().concat(String.valueOf(akun.getPinAngka())));

        System.out.println("\n--- Uji Tipe Data (PIN Anda: " + akun.getPinAngka() + ") ---");
        System.out.println("PIN (int) + 10        = " + (akun.getPinAngka() + 10));
        System.out.println("PIN (String) + \"10\" = " +
                (akun.getPinAngka() + "10"));

        input.close();
    }
}
