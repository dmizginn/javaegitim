package giris;

import java.util.Scanner;

public class taximetre {
    public static void main(String[] args){
        double km, tl;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilometre yol gittiniz? ");
        km = input.nextInt();

        tl = 10 + (km * 2.20);

        if (tl < 20){
            System.out.println("Ödemeniz 20 TL");
        }
        else{
            System.out.println("Ödemeniz" +  tl +  " TL");
        }

    }
}
