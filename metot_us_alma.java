package giris;
import java.util.Scanner;
public class metot_us_alma {
    static void usAlma(int ust, int alt){
        int deger=alt;

        for(int i=1; i<ust; i++){
            deger=deger*alt;
        }
        System.out.println(deger);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int alt = scanner.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int ust = scanner.nextInt();

        usAlma(ust,alt);
    }
}
