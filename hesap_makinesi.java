package giris;

import java.util.Scanner;

public class hesap_makinesi {
    public static void main(String[] args) {
        // switch() kullanımında () için e değişken, boolean veri, sayı veya string gelebilir

        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz:");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz:");
        n2 = input.nextInt();

        System.out.print("1 - Toplama \n 2 - Çıkartma \n 3 - Çarpma \n 4 - Bölme ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println(n1+n2);
                break; //break komutu kullanmazsak sorgulama olmaz son olanı yazar
            case 2:
                System.out.println(n1-n2);
                break;

            case 3:
                System.out.println(n1*n2);
                break;

            case 4:
                System.out.println(n1/n2);
                break;

            default:
                System.out.println("hatalı işlem seçimi");
        }

    }
}