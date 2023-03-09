package giris;

import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        int r=1,t=1,y=1, deger;
        Scanner input = new Scanner(System.in);

        System.out.print("Kümenin eleman sayısını yazınız: ");
        int n = input.nextInt();
        System.out.print("Kümenin eleman sayısını yazınız: ");
        int m = input.nextInt();

        for(int i=1; i<= n; i++){
            r = r*i;
        }
        for(int i=1; i<= m; i++){
            t = t*i;
        }
        for(int i=1; i<= n-m; i++){
            y = y*i;
        }

        deger=r/(t*(y));
        System.out.println(deger);

    }
}
