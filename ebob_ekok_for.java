package giris;
import java.util.Scanner;
public class ebob_ekok_for {
    public static void main(String[] args) {
        int sayi1, sayi2, kucukSayi, buyukSayi;
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz :");
        sayi1 = input.nextInt();
        System.out.print("2. sayıyı giriniz :");
        sayi2 = input.nextInt();

        if (sayi1 < sayi2) {
            kucukSayi = sayi1;
            buyukSayi = sayi2;
        } else {
            kucukSayi = sayi2;
            buyukSayi = sayi1;
        }

        int ebob = 1, i = 1;
        while (i<=kucukSayi) {
            if ((kucukSayi % i == 0) && (buyukSayi % i == 0)) {
                ebob = i;
            }
            i++;
        }
        int ekok = 1, k = 1;
        while (k <= (kucukSayi * buyukSayi)) {
            if ((k%kucukSayi == 0) && (k%buyukSayi == 0)) {
                ekok = k;
                break;
            }
            k++;

        }
        System.out.println("Girdiğiniz Sayıların EBOBU : " + ebob);
        System.out.println("Girdiğiniz Sayıların EKOKU : " + ekok);
    }
}