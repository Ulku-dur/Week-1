
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan iki sayıyı alma
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        int ebob = 1; // EBOB için başlangıç değeri
        int ekok = sayi1 * sayi2; // EKOK için başlangıç değeri
        int i = 2; // Kontrol edilecek bölen
        // EBOB hesaplama
        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        // EKOK hesaplama
        i = 2; // Kontrol edilecek böleni sıfırla
        while (i <= sayi1 * sayi2) {
            if (i % sayi1 == 0 && i % sayi2 == 0) {
                ekok = i;
                break; // İlk ortak kat bulunduğunda döngüden çık
            }
            i++;
        }
        // Sonuçları ekrana yazdırma
        System.out.println("Girilen sayıların EBOB'u: " + ebob);
        System.out.println("Girilen sayıların EKOK'u: " + ekok);
    }
}