
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int basamakSayi = 0, numberCounter = 0;
Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = input.nextInt();
        while (sayi != 0) {
            // her döngü çalıştığında numberCounter değeri 1 artar
            numberCounter++;
            sayi = sayi / 10;
        }
        System.out.println("Girilen sayi "+numberCounter +" basamaklıdır.");




    }
}