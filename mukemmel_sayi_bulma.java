package giris;

import java.util.Scanner;
public class mukemmel_sayi_bulma {
    public static void main(String[] args) {
        int sayi1,pozitifCarpan=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz :");
        sayi1 = input.nextInt();

        for(int i=1; i<sayi1; i++){
            if(sayi1%i==0){
                pozitifCarpan=pozitifCarpan+i;
            }
        }
        if(pozitifCarpan==sayi1){
            System.out.println("Girilen sayı mükemmel sayıdır.");
        }else{
            System.out.println("Girilen sayı mükemmel sayı değildir.");
        }

    }
}
