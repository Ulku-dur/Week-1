//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // değişkenleri tanımlarız
        int mat, fizik, turkce, kimya, muzik;
        // Scanner classından nesne oluştururuz
        Scanner input = new Scanner(System.in);
        // kullanıcıdan not bigisi al
        System.out.println("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        // Notların geçerlilik kontrolü
        if (mat >= 0 && mat <= 100 &&
                fizik >= 0 && fizik <= 100 &&
                turkce >= 0 && turkce <= 100 &&
                kimya >= 0 && kimya <= 100 &&
                muzik >= 0 && muzik <= 100) {

            // Ortalama hesaplama
            double ortalama = (mat + fizik + turkce + kimya + muzik) / 5.0;
            if (ortalama >= 55) {
                System.out.println("Ortalamanız: " + ortalama + ". Sınıfı geçtiniz!");
            } else {
                System.out.println("Ortalamanız: " + ortalama + ". Sınıfta kaldınız.");
            }  }
        else {
            System.out.println("Hatalı not girişi! Notlar 0-100 arasında olmalıdır.");
        }


        }
    }

