import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayıyı alma
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi <= 0) {
            System.out.println("Lütfen pozitif bir sayı girin.");
            return;
        }

        int toplam = 1; // 1 dahil tüm bölenleri toplamak için başlangıç değeri
        int bolen = 2; // Kontrol edilecek ilk bölen

        // Mükemmel sayı kontrolü
        while (bolen <= sayi / 2) {
            if (sayi % bolen == 0) {
                toplam += bolen;
            }
            bolen++;
        }
        // Mükemmel sayı mı değil mi kontrolü ve sonucu ekrana yazdırma
        if (toplam == sayi) {
            System.out.println(sayi + " mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
    }
}