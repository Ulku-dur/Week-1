//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Çalışmaya Scanner classını import ederek başlarız.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // kullanıcıdan veri alabilmek için Scanner nesnesi oluştururuz.
        Scanner scanner = new Scanner(System.in);
        //Kullanıcıdan 3 sayı istenildiği için 3 defa, 3 farklı değişkenle veri girişi sağlanır
        // birinci sayı
        System.out.println("birinci sayıyı giriniz: ");
        int a = scanner.nextInt();
        System.out.println("ikinci sayıyı giriniz: ");
        int b = scanner.nextInt();
        System.out.println("üçüncü sayıyı giriniz: ");
        int c = scanner.nextInt();
// işlem önceliğine göre işleme çarpma işlemini yaparak başlar.
        int sonuc = a +b * c - b;
        // Sonucu ekrana yazdırma
        System.out.println("İşlemin sonucu: " + sonuc);

    }
}