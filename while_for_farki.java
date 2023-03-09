package giris;
import java.util.Scanner;

public class while_for_farki {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        /*
        for(boolean run =true; run;){
            System.out.println("bir sayı giriniz: ");
            sayi = input.nextInt();
            if(sayi<0){
                run = false;
            }
        } */
        /*
        System.out.println("bir sayı giriniz: ");
        sayi = input.nextInt();
        while(sayi > 0){
            System.out.println("bir sayı giriniz: ");
            sayi = input.nextInt();
        } */

        do{
            System.out.println("bir sayı giriniz: ");
            sayi = input.nextInt();
        } while (sayi > 0);


    }
}
