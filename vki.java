package giris;

import java.util.Scanner;

public class vki {
    public static void main(String[] args) {
        double boy, kilo, vki;

        Scanner input = new Scanner(System.in);

        System.out.print("boy bilginizi yazınız (1,63 şeklinde): ");
        boy = input.nextDouble();

        System.out.print("Kilo bilginizi yazınız: ");
        kilo = input.nextDouble();

        vki = kilo / (boy * boy);
        System.out.println("VKİ değeriniz = " + vki);
    }
}
