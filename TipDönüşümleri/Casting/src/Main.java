/*
Bu program, öncelikle kullanıcıdan bir tam sayı ve bir ondalıklı sayı girmesini istesin. Daha sonra bu tam sayıyı
ondalıklı sayıya dönüştürerek ve bu ondalıklı sayıyı
tam sayıya dönüştürerek sonuçları ekrana yazdırır.
* */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan bir tam sayı ve bir ondalıklı sayı girmesini isteriz
        System.out.print("Bir tam sayı giriniz: ");
        int tamSayi = scanner.nextInt();
        System.out.print("Bir ondalıklı sayı giriniz: ");
        double ondalikliSayi = scanner.nextDouble();
        // Tam sayıyı ondalıklı sayıya dönüştürme
        double tamSayiOndalikli = (double) tamSayi;
        // Ondalıklı sayıyı tam sayıya dönüştürme
        int ondalikliSayiTam = (int) ondalikliSayi;
        // Sonuçları ekrana yazdırma
        System.out.println("Girilen tam sayı: " + tamSayi);
        System.out.println("Girilen ondalıklı sayı: " + ondalikliSayi);
        System.out.println("Tam sayıyı ondalıklıya dönüştürüldü: " + tamSayiOndalikli);
        System.out.println("Ondalıklı sayıyı tama dönüştürüldü: " + ondalikliSayiTam);
    }
}