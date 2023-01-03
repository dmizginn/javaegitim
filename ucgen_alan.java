package giris;

import java.util.Scanner;

public class ucgen_alan {
    public static void main(String[] args){
        int kenar1, kenar2 , kenar3;
        double alan, alan_karesi,  u;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenar uzunluğunu yazınız:");
        kenar1 = input.nextInt();

        System.out.print("2. Kenar uzunluğunu yazınız:");
        kenar2 = input.nextInt();

        System.out.print("3. Kenar uzunluğunu yazınız:");
        kenar3 = input.nextInt();

        u = (kenar1 + kenar2 + kenar3)/2;
        alan_karesi = u * (u-kenar1) * (u-kenar2) * (u-kenar3);
        alan = Math.sqrt(alan_karesi);

        System.out.println("Verdiğiniz kenar bilgileri alan hesaplandı = " + alan);
    }
}
