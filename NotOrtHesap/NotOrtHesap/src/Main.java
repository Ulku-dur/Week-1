//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Scanner classımızı aktif ederiz
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// Değişkenleri tanımlarız
        int mat, fizik, kimya, turkce, tarih, muzik;
        // Scanner sınıfımızı tanımlarız
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan not bilgisini isteriz
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        // not ort hesaplandığı kod satırı
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız: " + sonuc);
        boolean sonuc2 = sonuc >= 60;
        String str = sonuc2 ? "Tebrikler Geçtiniz" :"Geçemediniz";
        System.out.println(str);
        }
    }
