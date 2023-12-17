
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
int j; int sayac = 0; int toplam = 0;
Scanner input = new Scanner(System.in);
System.out.println("Sayı giriniz: ");
j = input.nextInt();
for (int i=1; i <= j; i++) {
    if ( i % 3 == 0 && i % 4 == 0) {
        System.out.println(i);
        toplam += i;
        sayac ++;
    }
        }
// Toplam ve sayı adedi üzerinden ortalamayı hesaplar.
        double average = (double) toplam / sayac;

        // Ortamalayı ekrana yazdırır.
        System.out.println("Ortalama: " + average);

    }
}