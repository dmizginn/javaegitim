package giris;

import java.util.Scanner;

public class not_ortalamasi {
    public static void main(String[] args){
        //değişkenleri oluşturuyoruz
        int mat, fizik, tarih, kimya, turkce, muzik;

        //Scanner sınıfını input adı ile tanımladım
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz:");
        mat = input.nextInt();

        System.out.print("Fizik notunu giriniz:");
        fizik = input.nextInt();

        System.out.print("Tarih notunu giriniz:");
        tarih = input.nextInt();

        System.out.print("Kimya notunu giriniz:");
        kimya = input.nextInt();

        System.out.print("Türkçe notunu giriniz:");
        turkce = input.nextInt();

        System.out.print("Müzik notunu giriniz:");
        muzik = input.nextInt();

        int toplam = (mat + fizik + tarih + kimya + turkce + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız: " + sonuc);

        String result = (sonuc >= 60) ? "Geçti" : "Kaldı";
        System.out.println(result);

        //boolean ile koşullu ifade kullanarak 60 ve üzerine geçti altına kaldı yazdıracağız
        //if else kullanmamalıyız
    }
}
