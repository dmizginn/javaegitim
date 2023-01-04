package giris;

import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        double armutFiyat =2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5;
        double armutMiktar, elmaMiktar, domatesMiktar, muzMiktar, patlicanMiktar;
        double toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo ?  ");
        armutMiktar = input.nextDouble();

        System.out.print("Elma kaç kilo ?  ");
        elmaMiktar = input.nextDouble();

        System.out.print("Domates kaç kilo ?  ");
        domatesMiktar = input.nextDouble();

        System.out.print("Muz kaç kilo ?  ");
        muzMiktar = input.nextDouble();

        System.out.print("Patlıcan kaç kilo ?  ");
        patlicanMiktar = input.nextDouble();

        toplamTutar =(armutMiktar * armutFiyat) + (elmaFiyat * elmaMiktar) + (domatesFiyat * domatesMiktar) + (muzFiyat * muzMiktar) + (patlicanFiyat * patlicanMiktar);
        System.out.println("Bütün alışveriş tutarı =  " + toplamTutar);
    }
}
