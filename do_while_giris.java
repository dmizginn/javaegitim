package giris;
import java.util.Scanner;

public class do_while_giris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass;
        boolean askPassword = true;
        do{
            System.out.print("Lütfen Şifrenizi Giriniz: ");
            pass = input.nextInt();

            if(pass == 123){
                System.out.print("Doğru şifre");
                askPassword = false;
            } else{
                System.out.print("Yanlış");
            }
        }
        while (askPassword);
        
    }
}