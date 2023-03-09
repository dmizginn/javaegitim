package giris;
import java.util.Scanner;

public class while_sifre {
    public static void main(String[] args) {
        int password;
        boolean isPasswordSuccess = true;

        Scanner input = new Scanner(System.in);
        while (isPasswordSuccess){
            System.out.print("Lütfen Şifrenizi Giriniz: ");
            password = input.nextInt();
            if(password == 123){
                System.out.println("Giriş Başarılı");
                isPasswordSuccess = false;
            }else{
                System.out.println("Şifre Yanlış Lütfen Tekrar Dene: ");
            }
        }


    }

}
