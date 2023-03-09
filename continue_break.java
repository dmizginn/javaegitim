package giris;

public class continue_break {
    public static void main(String[] args) {
        for(int i = 1; i <=10; i++){
            if(i==5){
                System.out.println("i'nin değeri 5");
                break; //değer 5 olunca her şeyi durdurdum.
            }
            System.out.println(i);
        }
        for(int i = 1; i <=10; i++){
            if(i==5){
                continue; //değer 5 olunca aşağı yapmadan üste geri gelecek
            }
            System.out.println(i);
        }
    }
}
