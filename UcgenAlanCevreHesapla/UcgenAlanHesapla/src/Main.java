//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Scanner class ı import edilir
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üçgenin birinci kenar uzunluğunu girin:");
        double a = scanner.nextDouble();

        System.out.println("Üçgenin ikinci kenar uzunluğunu girin:");
        double b = scanner.nextDouble();

        System.out.println("Üçgenin üçüncü kenar uzunluğunu girin:");
        double c = scanner.nextDouble();

        // Üçgenin çevresini hesapla
        double u = (a + b + c) / 2;

        // Alanı hesapla
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Çevresi: " + (2 * u));
        System.out.println("Üçgenin Alanı: " + alan);

        scanner.close();
        }
    }
