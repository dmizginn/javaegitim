package giris;

import java.util.Scanner;
public class atm_Switch_Case {
    public static void main(String[] args) {
        String password, userName;
        Scanner input= new Scanner(System.in);
        int right =3;
        int balance = 987;
        int select;

        while(right>0) {
            System.out.println("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.println("Şifreniz ");
            password = input.nextLine();

            if (userName.equals("dmizgin") && password.equals("1234")) { //.equals string ifadelerde eşitliği kontrol etmek için kullanılır.
                System.out.println("Bankamıza Hoşgeldiniz");
                do {
                    System.out.println("1 - Para Yatırma \n" +
                            "2 - Para Çekme \n" +
                            "3 - Bakiye Sorgulama \n" +
                            "4 - Çıkış Yap \n");
                    System.out.print("Lütfen Yapmak istediğiniz işlemi seçiniz.");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Para Miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Para Miktarı : ");
                            int price2 = input.nextInt();
                            if (price2 > balance) {
                                System.out.println("Bakiye Yetersiz :(");
                            } else {
                                balance -= price2;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar bekleriz by.");
                break;
            } else {
                right--;
                System.out.println("Hatalı Giriş");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                } else {
                    System.out.println("Kalan deneme hakkınız: " + right);
                }
            }
        }
    }
}