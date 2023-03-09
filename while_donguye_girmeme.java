package giris;

public class while_donguye_girmeme {
    public static void main(String[] args) {
        int left = 100 , right = 200;
        while (++left < --right); //while döngünün içeriği olmadan çalıştırılabilir.
        System.out.print(left);
    }
}
