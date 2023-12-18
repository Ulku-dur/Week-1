
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan N sayısını alma
        System.out.print("Kaç adet sayı gireceksiniz? ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Lütfen geçerli bir sayı girin.");
            return;
        }
        // İlk sayıyı alarak başlangıç değeri olarak kullanma
        System.out.print("1. sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        int enBuyuk = sayi;
        int enKucuk = sayi;
        int i = 2; // Döngüde kullanılacak sayaç
        // Diğer sayıları alma ve en büyük/en küçük değeri güncelleme
        while (i <= n) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = scanner.nextInt();
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            } else if (sayi < enKucuk) {
                enKucuk = sayi;
            }
            i++;
        }
        // Sonuçları ekrana yazdırma
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}