
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int tbn, us;
        Scanner input = new Scanner(System.in);
        System.out.println("Taban sayıyı giriniz: ");
        tbn = input.nextInt();
        System.out.println("Üssü giriniz: ");
        us = input.nextInt();
        int sonuc = 1;
        for (int i=1; i <= us; i++) {
            sonuc *= tbn;
        }
        System.out.println(tbn + "^" + us + "=" +sonuc);


    }
}