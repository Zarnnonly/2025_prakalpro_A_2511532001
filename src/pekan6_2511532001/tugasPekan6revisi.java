package pekan6_2511532001;

import java.util.Random;
import java.util.Scanner;

public class tugasPekan6revisi{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int tries = 0;

        while (true) {
            tries++;
            int d1 = rnd.nextInt(6) + 1;
            int d2 = rnd.nextInt(6) + 1;
            int total = d1 + d2;

            System.out.println("Lemparan ke-" + tries + ": " + d1 + " + " + d2 + " = " + total);

            if (total == 7) {
                System.out.println("Kamu MENANG di percobaan ke-" + tries + "!");
                break;
            }

            System.out.print("Belum 7. Lanjut (y/n)? ");
            String j = in.nextLine().trim();
            if (j.equalsIgnoreCase("n") || j.equalsIgnoreCase("tidak")) {
                System.out.println("Game selesai. Total percobaan: " + tries);
                break;
            }
        }
        in.close();
    }
}
