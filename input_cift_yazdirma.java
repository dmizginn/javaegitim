package giris;
import java.util.Scanner;
public class input_cift_yazdirma {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz.");
        sayi = input.nextInt();

        for(int i=0; i<=sayi; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
