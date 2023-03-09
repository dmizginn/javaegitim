package giris;
import java.util.Scanner;
public class tek_toplama {
    public static void main(String[] args) {
        int sayi, toplam=0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Lütfen bir sayı giriniz.");
            sayi = input.nextInt();
            if(sayi%2 == 1){
                toplam=toplam+sayi;
            }
        }
        while (sayi > 0);
        System.out.print(toplam);
    }
}
