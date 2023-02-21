package giris;

import java.util.Scanner;
public class sayi_siralama {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz (a)");
        a = input.nextInt();
        System.out.print("2. sayıyı giriniz (b)");
        b = input.nextInt();
        System.out.print("3. sayıyı giriniz (c)");
        c = input.nextInt();

        if ((a!=b) && (b!=c)) {
            if ((a > b) && (a > c)) {
                if (b > c) {
                    System.out.println("a>b>c");
                    System.out.println(a + ">" + b + ">" + c);
                }
            } else if ((b > a) && (b > c)) {
                if (a > c) {
                    System.out.println("b>a>c");
                    System.out.println(b + ">" + a + ">" + c);
                } else {
                    System.out.println("b>c>a");
                    System.out.println(b + ">" + c + ">" + a);
                }
            } else if ((c > a) && (c > b)) {
                if (a > b) {
                    System.out.println("c>a>b");
                    System.out.println(c + ">" + a + ">" + b);
                } else {
                    System.out.println("c>b>a");
                    System.out.println(c + ">" + b + ">" + a);
                }
            }
        }
        else{
            System.out.println("eşit sayı var farklı sayılar gir lütfen");
            }

    }

}
