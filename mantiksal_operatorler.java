package giris;

public class mantiksal_operatorler {
    public static void main(String[] args) {
        int a = 50, b = 100, c = 10, d;
        boolean kosul1 = (a < b);
        boolean kosul2 = (a > b);
        boolean kosul3 = (a > c);

        boolean sonuc1 = kosul1 && kosul2;  // && ve anlamına gelir true olması için herşeyin true olması gerekir
        boolean sonuc2 = kosul1 && kosul3;
        boolean sonuc3 = kosul1 || kosul2;  // || veya anlamına gelir true olması için bir true yeterli

        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
        System.out.println(!sonuc3); // başa gelen ! sonucu tersine çevirir

        d = (a == b) ? 2 : 3;
        System.out.println(d);

    }
}
