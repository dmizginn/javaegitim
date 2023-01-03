package giris;

// Java’da kullanıcıdan veri almak için Scanner sınıfı kullanılır.
// Ama bu sınıfı kullanmadan önce kodumuza Scanner sınıfını dahil etmemiz gerekir.
// Bunun için import deyimi kullanılır ;
import java.util.Scanner;

public class kullanicidan_veri_alma {
    public static void main(String[] args){
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("A sayısının değerini yazınız:");
        a = input.nextInt();
        System.out.println(a);
        //nextBoolean() -- kullanıcıdan boolean veri almak için
        //nextByte() -- kullanıcıdan byte değişkenlere veri almak için
        //nextDouble() -- kullanıcıdan double değişkenlere veri almak için
        //nextFloat() -- kullanıcıdan float değişkenlere veri almak için
        //nextInt() -- kullanıcıdan integer değişkenlere veri almak için
        //nextLine() -- kullanıcıdan string değişkenlere veri almak için
        //nextLong() -- kullanıcıdan long değişkenlere veri almak için
        //nextShort() -- kullanıcıdan short değişkenlere veri almak için
    }
}
