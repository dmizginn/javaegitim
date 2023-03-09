package giris;

import java.util.Scanner;

public class us_hesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Taban sayıyı yazınız: ");
        int n = input.nextInt();
        System.out.println("Üs olacak sıyıyı yazınız: ");
        int m = input.nextInt();

        int deger=n;
        for(int i=1; i<m; i++){
           deger=deger*n;
        }
        System.out.println(deger);
    }
}
