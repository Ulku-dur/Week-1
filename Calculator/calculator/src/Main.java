//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // main metodu altında değişkenlerimizi tanımladım
        int num1, num2, choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        num1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        num2 = scanner.nextInt();
        // "\n" kullanılarak bi satır alta geçmiş oldu, defalarca println yazmamıza gerek kalmadı
        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.print("Seçiminiz: ");
        choice = scanner.nextInt();
        // switch case yapısında (choice) ile case in yanındaki değerin eşit olup olmadığı kontrol edilir
        switch (choice) {
            case 1:
                System.out.println("Toplam: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Çarpma: " + (num1 * num2));
                break;
            case 4:
                // 0 a bölen hatasının önüne geçilmesi için yazıldı
                if (num2 != 0) {
                    System.out.println("Bölme: " + (num1 / num2));
                } else {
                    System.out.println("Bir sayıyı 0'a bölemezsiniz.");
                }
                break;
            default:
                System.out.println("Geçersiz bir seçim yaptınız.");
        }

        scanner.close();

        }
    }
