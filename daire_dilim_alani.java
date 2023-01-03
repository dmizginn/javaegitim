package giris;

import java.util.Scanner;

public class daire_dilim_alani {
    public static void main(String[] args) {
        double pi=3.14, yariCap, alan, merkezAci;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        yariCap = input.nextInt();

        System.out.print("Dilimin merkez açısını giriniz: ");
        merkezAci = input.nextInt();

        alan = (pi * (yariCap * yariCap) * merkezAci) / 360;
        System.out.println("Seçilen daire diliminin alanı = " + alan);
    }
}
