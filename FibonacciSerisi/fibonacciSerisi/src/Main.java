/*
kullanıcıdan alınan eleman sayısına bağlı olarak Fibonacci
serisini hesaplar. for döngüsü içinde her adımda, iki önceki sayı ile bir
önceki sayı toplanır ve sonuç ekrana yazdırılır
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan eleman sayısını alma
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int elemanSayisi = scanner.nextInt();

        // Fibonacci serisini hesapla ve ekrana yazdır
        int sayi1 = 0, sayi2 = 1;
        System.out.print(elemanSayisi + " Elemanlı Fibonacci Serisi: ");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(sayi1 + " ");
            int toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;
        }
    }
}