
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 𝜋 sayısını sabit olarak tanımla
        double pi = 3.14;

        System.out.println("Daire diliminin yarıçapını girin:");
        double r = scanner.nextDouble();

        System.out.println("Merkez açısının ölçüsünü (𝛼) girin: ");
        double alpha = scanner.nextDouble();
        // Daire çevre hesapla
        double cevre = 2*pi*r;
        System.out.println("Dairenin çevre uzunluğu: " + cevre);

        // Daire diliminin alanını hesapla
        double alan = (pi * (r * r) * alpha) / 360;

        System.out.println("Daire diliminin Alanı: " + alan);

        scanner.close();


    }
}