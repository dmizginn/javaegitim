package giris;

import java.util.Scanner;
public class giris_islemi {
    public static void main(String[] args) {

        String kullanici_adi, sifre, degisme;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz:");
        kullanici_adi = input.nextLine();


        System.out.print("Şifre giriniz:");
        sifre = input.nextLine();


        if (kullanici_adi.equals("dmizginn") ) {
            if (sifre.equals("1234")) {
                System.out.println("giriş başarılı");
            }
            else {
                System.out.print("Şifreniz hatalı değiştirmek ister misiniz? [e-h]:");
                degisme = input.nextLine();
                if (degisme.equals("e")){
                    System.out.print("Yeni şifre giriniz:");
                    sifre = input.nextLine();
                    System.out.println("Şifreniz güncelleşti");
                }
                else{
                    System.out.println("çık o zaman");
                }
            }
        }

        else{
            System.out.println("kaydın yok kayıt ol yavrum");
        }
    }
}
