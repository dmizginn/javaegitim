package giris;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisi eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        int oncekiSayi = 0, simdikiSayi = 1;

        System.out.print(oncekiSayi + " " + simdikiSayi + " ");

        for (int i = 3; i <= elemanSayisi; i++) {
            int yeniSayi = oncekiSayi + simdikiSayi;
            System.out.print(yeniSayi + " ");
            oncekiSayi = simdikiSayi;
            simdikiSayi = yeniSayi;
        }
    }
}
