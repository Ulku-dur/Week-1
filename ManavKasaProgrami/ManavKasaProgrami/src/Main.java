
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner sınıfını kullanarak kullanıcıdan girdi alırız
        Scanner scanner = new Scanner(System.in);
        // Meyve fiyatları
        double armutFiyati = 2.14;
        double elmaFiyati = 3.67;
        double domatesFiyati = 1.11;
        double muzFiyati = 0.95;
        double patlicanFiyati = 5.00;
        // Kullanıcıdan kilo bilgilerini alalım
        System.out.print("Armut Kaç Kilo ? : ");
        double armutKilo = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elmaKilo = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domatesKilo = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muzKilo = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlicanKilo = scanner.nextDouble();

        // Toplam tutarı hesaplayalım
        double toplamTutar = (armutFiyati * armutKilo) + (elmaFiyati * elmaKilo)
                + (domatesFiyati * domatesKilo) + (muzFiyati * muzKilo) + (patlicanFiyati * patlicanKilo);

        // Toplam tutarı ekrana yazdırırız
        // "%.2f" formatı, virgülle iki basamaklı bir ondalık sayı anlamına gelir. Bu, toplam tutarı daha düzenli bir şekilde ekrana yazdırmak için kullandık
        System.out.println("Toplam Tutar : " + String.format("%.2f", toplamTutar) + " TL");
        scanner.close();
    }
}