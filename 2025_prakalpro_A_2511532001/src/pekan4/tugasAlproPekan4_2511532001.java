package pekan4;

import java.util.Scanner;

public class tugasAlproPekan4_2511532001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input data pembeli
        System.out.print("Masukkan nama pembeli: ");
        String namaPembeli = input.nextLine();
        
        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = input.nextInt();
        
        System.out.print("Pilih hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
        int hari = input.nextInt();
        
        System.out.print("Pilih waktu tayang (1=Pagi 10:00-12:00, 2=Siang 12:00-17:00, 3=Malam 17:00-22:00): ");
        int waktu = input.nextInt();
        
        System.out.print("Pilih jenis studio (1=Regular, 2=Deluxe, 3=Premium): ");
        int studio = input.nextInt();
        
        // Harga dasar berdasarkan jenis studio
        int hargaDasar = 0;
        String jenisStudio = "";
        
        switch(studio) {
            case 1:
                hargaDasar = 40000;
                jenisStudio = "Regular";
                break;
            case 2:
                hargaDasar = 60000;
                jenisStudio = "Deluxe";
                break;
            case 3:
                hargaDasar = 80000;
                jenisStudio = "Premium";
                break;
            default:
                hargaDasar = 40000;
                jenisStudio = "Regular";
        }
        
        // Biaya tambahan berdasarkan hari
        double biayaHari = 0;
        String namaHari = "";
        
        if(hari == 1) {
            biayaHari = 0; // 0% untuk weekdays
            namaHari = "Senin-Kamis";
        } else if(hari == 2) {
            biayaHari = 0.15; // +15% untuk Jumat
            namaHari = "Jumat";
        } else {
            biayaHari = 0.30; // +30% untuk weekend
            namaHari = "Sabtu-Minggu";
        }
        
        // Biaya tambahan berdasarkan waktu
        double biayaWaktu = 0;
        String namaWaktu = "";
        
        switch(waktu) {
            case 1:
                biayaWaktu = 0; // 0% untuk pagi
                namaWaktu = "Pagi";
                break;
            case 2:
                biayaWaktu = 0.10; // +10% untuk siang
                namaWaktu = "Siang";
                break;
            case 3:
                biayaWaktu = 0.25; // +25% untuk malam
                namaWaktu = "Malam";
                break;
            default:
                biayaWaktu = 0;
                namaWaktu = "Pagi";
        }
        
        // Hitung harga per tiket
        double hargaPerTiket = hargaDasar * (1 + biayaHari + biayaWaktu);
        double subtotal = hargaPerTiket * jumlahTiket;
        
        // Diskon couple (jika jumlah tiket 2)
        double diskon = 0;
        double nilaiDiskon = 0;
        
        if(jumlahTiket == 2 ) {
            diskon = 0.15; // Diskon 15% untuk couple
            nilaiDiskon = subtotal * diskon;
        }
        
        double totalBayar = subtotal - nilaiDiskon;
        
        // Output hasil
        System.out.println("\n===== PEMBELIAN TIKET BIOSKOP =====");
        System.out.println("Nama Pembeli     : " + namaPembeli);
        System.out.println("Jumlah Tiket     : " + jumlahTiket);
        System.out.println("Hari             : " + namaHari);
        System.out.println("Waktu Tayang     : " + namaWaktu);
        System.out.println("Jenis Studio     : " + jenisStudio);
        System.out.println("------------------------------------");
        System.out.println("Harga Dasar      : Rp " + hargaDasar + "/tiket");
        
        if(biayaHari > 0) {
            System.out.println("Biaya Hari       : +" + (int)(biayaHari * 100) + "%");
        }
        if(biayaWaktu > 0) {
            System.out.println("Biaya Waktu      : +" + (int)(biayaWaktu * 100) + "%");
        }
        
        System.out.println("Harga per Tiket  : Rp " + (int)hargaPerTiket);
        System.out.println("Subtotal         : Rp " + (int)subtotal);
        
        if(diskon > 0) {
            System.out.println("Diskon Couple (" + (int)(diskon * 100) + "%) : Rp " + (int)nilaiDiskon);
        }
        
        System.out.println("------------------------------------");
        System.out.println("TOTAL BAYAR      : Rp " + (int)totalBayar);
        
        input.close();
    }
}
