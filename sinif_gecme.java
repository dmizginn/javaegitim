package giris;

import java.util.Scanner;
public class sinif_gecme {
    public static void main(String[] args) {

        int mat,muzik,turkce,fen,sosyal;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik ortalamanızı giriniz:");
        mat = input.nextInt();

        System.out.print("Müzik ortalamanızı giriniz:");
        muzik = input.nextInt();

        System.out.print("Türkçe ortalamanızı giriniz:");
        turkce = input.nextInt();

        System.out.print("Fen ortalamanızı giriniz:");
        fen = input.nextInt();

        System.out.print("sosyal ortalamanızı giriniz:");
        sosyal = input.nextInt();

        if (mat > 0 && mat < 100 && muzik > 0 && muzik < 100 && turkce > 0 && turkce < 100 && fen > 0 && fen < 100 && sosyal > 0 && sosyal < 100){
            double ortalama =(mat+muzik+turkce+fen+sosyal)/5;

            if (ortalama > 50){
                System.out.println("geçtin tebrik");
            }
            else{
                System.out.println("kaldın");
            }
        }
        else{
            System.out.println("notlardan en az birinde hata var 0-100 arası gir");
        }

    }
}
