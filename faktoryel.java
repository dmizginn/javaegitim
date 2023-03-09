package giris;

import java.util.Scanner;
public class faktoryel {
    public static void main(String[] args) {
        int deger=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Faktöryelini hesaplamak istediğin sayıyı gir: ");
        int sayi = input.nextInt();

        for(int i=1; i<= sayi; i++){
            deger= deger*i;
        }
        System.out.print(deger);
    }
}
