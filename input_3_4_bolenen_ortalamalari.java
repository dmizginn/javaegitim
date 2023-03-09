package giris;

import java.util.Scanner;
public class input_3_4_bolenen_ortalamalari {
    public static void main(String[] args) {
        int sayi, sayac = 0;
        float ortalama,  toplam=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz.");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0) {
                sayac = sayac + 1;
                toplam = toplam + i;

            }
            if (i % 4 == 0) {
                sayac = sayac + 1;
                toplam = toplam + i;
            }
        }
        ortalama = toplam / sayac;
        System.out.println(ortalama);
    }
}
