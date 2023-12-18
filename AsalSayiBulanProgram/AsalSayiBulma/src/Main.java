
public class Main {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki asal sayılar:");
        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asal = true;
            // Bir sayının asal olup olmadığını kontrol etme
            for (int bolen = 2; bolen <= sayi / 2; bolen++) {
                if (sayi % bolen == 0) {
                    asal = false;
                    break;
                }
            }
            // Eğer sayı asalsa, ekrana yazdırma
            if (asal) {
                System.out.println(sayi);
            }
        }
    }
}