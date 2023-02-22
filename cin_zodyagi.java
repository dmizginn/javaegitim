package giris;

import java.util.Scanner;

public class cin_zodyagi {
    public static void main(String[] args) {
        int year, b = 12;
        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz : ");
        year = inp.nextInt();
        if (year % b == 0) {
            System.out.println("Zodyak burcunuz : Maymun");
        } else if (year % b == 1) {
            System.out.println("Zodyak burcunuz : Horoz");
        } else if (year % b == 2) {
            System.out.println("Zodyak burcunuz : Köpek");
        } else if (year % b == 3) {
            System.out.println("Zodyak burcunuz : Domuz");
        } else if (year % b == 4) {
            System.out.println("Zodyak burcunuz : Fare");
        } else if (year % b == 5) {
            System.out.println("Zodyak burcunuz : Öküz");
        } else if (year % b == 6) {
            System.out.println("Zodyak burcunuz : Kaplan");
        } else if (year % b == 7) {
            System.out.println("Zodyak burcunuz : Tavşan");
        } else if (year % b == 8) {
            System.out.println("Zodyak burcunuz : Ejderha");
        } else if (year % b == 9) {
            System.out.println("Zodyak burcunuz : Yılan");
        } else if (year % b == 10) {
            System.out.println("Zodyak burcunuz : At");
        } else if (year % b == 11) {
            System.out.println("Zodyak burcunuz : Koyun");
        }
    }
}
