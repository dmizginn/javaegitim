package giris;

public class tam_sayi {
    public static void main(String[] args){
        // byte 8 bit boyutundadır max 128 min -127 değerini alır
        byte vByte = 100;
        System.out.println(vByte);

        //short 16 bit uzunluğunda max 32767 min -32768 değerini alır
        short vSort = 1000;
        System.out.println(vSort);

        //Integer 32 bit uzunluğundadır max 2147483647 min -2147483648 değerini alır
        int vInt = 1000000;
        System.out.println(vInt);

        //long 64 bit uzunluğunda max 9223372036854775807 min -9223372036854775808 değerini alır
        int vLong = 92233758;
        System.out.println(vLong);
    }
}
