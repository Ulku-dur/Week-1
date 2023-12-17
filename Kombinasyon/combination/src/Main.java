// Bu formüle göre kullanıcıdan n ve r sayılarını isteyip hepsinin ayrı ayrı faktöriyellerini hesaplayarak kodlarımızı oluşturacağız.
// N’in r’li kombinasyonu; C (n,r)= n!/ (( n-r)!.r !)
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("N değerini giriniz: ");
        int n = input.nextInt();
        System.out.println("R değerini giriniz: ");
        int r = input.nextInt();
        // Geçerli değer kontrolü
        if (r > n || r < 0) {
            System.out.println("Geçersiz giriş yaptınız");
        }
        else {
            // faktöriyel hesabı yapılır
            int totalNF= 1, totalRF = 1, totalNR=1;
            for ( int i=1; i <= n; i++) {
                totalNF *= i; // n faktöriyeli hesaplanır
            }
            for (int i=1; i <= r; i++) {
                totalRF *= i; // r faktöriyeli hesaplanır
                //System.out.println(totalRF);
            }
            int j = n - r;
            for (int i=1; i <= j; i++) {
                totalNR *= i; // (n-r) faktöriyeli hesaplanır
            }
            // kombinasyon hesaplanır C (n,r)= n!/ (( n-r)!.r !)
            int comb = totalNF / (totalRF*totalNR);
            System.out.println("Girilen değerlerin kombinasyon değeri: " +comb);
        }
    }
}