package giris;

public class while_giris {
    public static void main(String[] args) {
        int i = 0, k = 0;
        System.out.println("Program Başladı.");
        while(i<=3){
            System.out.println(i);
            i++;
            while (k<=9){
                System.out.print(k+",");
                k++;
            }
            k=0;
            System.out.println("");
        }
        System.out.println("Program Bitti.");
    }
}
