package pekan2;


import java.util.Scanner;

public class TugasAlproPekan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan IPK: ");
        double ipk = input.nextDouble();

        // Mengonversikan umur menjadi String
        String umurString = String.valueOf(umur);

        // Mengonversikan NIM ke Long dan ditambah dengan umur
        long nimLong = Long.parseLong(nim);
        long hasilJumlah = nimLong + umur;

        // Print hasil
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur + " tahun");
        System.out.println("IPK   : " + ipk);

        System.out.println("\nUmur (String): " + umurString);
        System.out.println("NIM + Umur   : " + hasilJumlah);
    }
}
