package pekan3;

import java.util.Scanner;

public class HitungVolume {
    public static void main(String[] args) {
        final double PI = 3.14; // nilai π

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung: ");
        double r = input.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double t = input.nextDouble();
        double volume = PI * r * r * t;

        System.out.println("Volume tabung = " + volume);

        input.close();
    }
}
