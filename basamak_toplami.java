import java.util.Scanner;
public class basamak_toplami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        int number = input.nextInt();

        int basSayisi=0, tempNumber = number, basamakDegeri, result=0;

        while(tempNumber != 0 ){
            tempNumber /=10;
            basSayisi++;
        }
        tempNumber = number;
        System.out.println("basamak sayısı "+basSayisi);

        while (tempNumber != 0){
            basamakDegeri = tempNumber % 10;
            result += basamakDegeri;
            tempNumber /= 10;
        }
        System.out.println(result);

    }
}
