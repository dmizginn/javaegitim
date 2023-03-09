package giris;

import java.util.Scanner;
public class kuvvet_bulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin (2): ");
        int sayi = input.nextInt();


        for(int i = 1; i<=sayi; i*=2 ){
            System.out.println(i);
        }

        System.out.print("----------------------");
        System.out.println("");

        System.out.print("Bir sayı girin (4): ");
        int sayi2 = input.nextInt();


        for(int i = 1; i<=sayi2; i*=4 ){
            System.out.println(i);
        }

        System.out.print("----------------------");
        System.out.println("");

        System.out.print("Bir sayı girin (5): ");
        int sayi3 = input.nextInt();


        for(int i = 1; i<=sayi3; i*=5 ){
            System.out.println(i);
        }

        System.out.print("----------------------");
    }
}
