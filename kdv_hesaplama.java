package giris;

import java.util.Scanner;

public class kdv_hesaplama {
    public static void main(String[] args){
        double ucret;

        Scanner input = new Scanner(System.in);

        System.out.print("Ürünün ücretini giriniz = ");
        ucret = input.nextDouble();

        if (ucret > 0 & ucret <1000){
            double kdvli_fiyat = ucret * 0.18;
            double toplam_odenen = kdvli_fiyat + ucret;

            System.out.println("Ürünün Ücreti: " + ucret);
            System.out.println("Ödediğiniz Ücret: " + toplam_odenen);
            System.out.println("Kdv Oranı %18");
        }
        else{
            double kdvli_fiyat = ucret * 0.08;
            double toplam_odenen = kdvli_fiyat + ucret;

            System.out.println("Ürünün Ücreti: " + ucret);
            System.out.println("Ödediğiniz Ücret: " + toplam_odenen);
            System.out.println("Kdv Oranı %8");
        }
    }
}
