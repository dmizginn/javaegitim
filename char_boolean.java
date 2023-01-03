package giris;

import sun.font.TrueTypeFont;

public class char_boolean {
    public static void main(String[] args){
        char vChar = 'b'; //char değişkeni oluştururken '' içine yazmak zorundayız
        char v2Char = 77; // 77 sayısı ASCII tablosunda M ye denk gelir
        System.out.println(vChar);
        System.out.println(v2Char);

        char c1 = 'M';
        char c2 = 'İ';
        char c3 = 'Z';
        char c4 = 'O';
        System.out.println("" + c1 + c2 + c3 + c4); //eğer "" açmasak ASCII değerlerini toplar sayısal bir dönüt verir

        boolean dogru = true;
        boolean yanlis = false;
        System.out.println(dogru);
        System.out.println(yanlis);
    }
}
