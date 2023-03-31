package giris;

public class overloading_islemi {
    static void print(){
        System.out.println("Parametresiz Metot");
    }
    static void print(int a){
        System.out.println("Parametreli metot"+a);
    }
    static int print(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        //overloading  aşırı yüklenme
        //Java'da, iki veya daha fazla metot, parametreler açısından farklılık gösteriyorsa (farklı sayıda parametre, farklı türde parametre veya her ikisi) aynı isime sahip olabilir.
        //Bu duruma metotlarda "Overloading" yani aşırı yüklenme işlemi denir.
        print();
        print(24);
        System.out.println(print(8,5));
    }
}
