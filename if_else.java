package giris;

public class if_else {
    public static void main(String[] args) {
        int a = 10, b = 20;
        boolean compare = a == b;
        System.out.println(compare);

        String str = compare ? "Eşittir (?)" : "Eşit Değiller (?)";
        System.out.println(str);

        if(compare) {
            a = a + 50;
            System.out.println(a);
            System.out.println("Eşittir (if-else)");
        }
        else{
            System.out.println("Eşit Değiller (if-else)");
        }

        System.out.println("if else bloğundan çıktım");
    }
}
