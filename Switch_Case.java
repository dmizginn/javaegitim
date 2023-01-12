package giris;

public class Switch_Case {
    public static void main(String[] args) {
        // switch() kullanımında () için e değişken, boolean veri, sayı veya string gelebilir

        int day = 8;

        switch (day){
            case 1:
                System.out.println("bugün pazartesi");
                break; //break komutu kullanmazsak sorgulama olmaz son olanı yazar
            case 2:
                System.out.println("bugün salı");
                break;

            case 3:
                System.out.println("bugün çarşamba");
                break;

            default:
                System.out.println("hatalı");
        }

    }
}
