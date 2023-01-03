package giris;

public class float_double {
    public static void main(String[] args){
       //Float 32 bit değerindedir. 1.4×10^-45 ile 3.4×10^38 aralığında bir değer tanımlanabilir.
       //Float ile double ayırmak için , float tanımlamalardan sonra ‘f’ veya ‘F’ konulmalıdır.
       float vFloat = 3.14F;
       System.out.println(vFloat);

       //64 Bit boyutundadır ve 4.9×10^-324 ile 1.8×10^308 aralığında bir değer tanımlanabilir.
       double vDouble = 3.14;
       System.out.println(vDouble);

       //Double tipi, yüksek duyarlıklı ve hassas matematiksel işlemlerde kullanılır.
       //Float basittir : hız ve bellek.
       //Double daha yavaş ve fazla yer kaplar.(Bu işlemler arasında milisaniye oynar)
       //Java hassas matematiksel işlemler, örneğin sinüs kosinüs fonksiyonları, double tipi değer döndürür.
    }
}
