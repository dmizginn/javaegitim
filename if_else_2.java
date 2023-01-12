package giris;

public class if_else_2 {
    public static void main(String[] args) {
        int a = 50, b = 100, c = 10;

        if ((a < b) && (a < c)){
            System.out.println("a en küçük sayıdır.");
        } else if((b < a) && (b < c)){
            System.out.println("b en küçük sayıdır.");
        } else if((c < a) && (c < b)){
            System.out.println("c en küçük sayıdır.");
        } else {
            System.out.println("hepsi birbirine eşit");
        }

        if (a < c){
            if (a < b) {
                System.out.println("a en küçük");
            }
            else{
                System.out.println("a b den büyük");
            }
        }else{
            System.out.println("c a dan büyük");
        }

    }

}
