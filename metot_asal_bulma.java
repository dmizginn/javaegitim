package giris;

import java.util.Scanner;
public class metot_asal_bulma {
    static void asalBulma(int number){
        int m=0, n=0;
        for (int i=2; i<=number; i++){
            m = number % i;
            if (m == 0){
                n++;
            }
        }
        if(n>1){
            System.out.print("Sayı asal değil");
        }else{
            System.out.print("Sayı asal");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = scanner.nextInt();

        asalBulma(number);
    }
}
