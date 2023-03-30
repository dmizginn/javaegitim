package giris;

import java.util.Scanner;
public class harmonik_seri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("N sayısını giriniz: ");
        int n = input.nextInt();
        double result =0;

        for(int i=1; i<=n; i++){
            result += (1.0/i); //1.0 yazmazsak sonuç yanlış çıkar int i int e böldüğümüz için
        }
        System.out.println(result);
    }
}
