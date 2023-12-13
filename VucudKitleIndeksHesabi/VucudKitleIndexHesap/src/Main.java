
// kullanıcıdan boy kilo datasının alınması için Scanner classı aktif edilir.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz: ");
// boy ve kilo değeri tamsayı olmayabilir bu nedenle double türünde tanımladık.
        double boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();
        // Vücut Kitle İndeksi hesabı: kilo / (boy*boy)
        double vucutKitleIndeksi = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: " + vucutKitleIndeksi);
        scanner.close();

    }
}