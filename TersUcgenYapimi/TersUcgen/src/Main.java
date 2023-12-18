
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan basamak sayısını alma
        System.out.print("Basamak sayısını giriniz: ");
        int basamak = scanner.nextInt();
        // İlk döngü, her bir satırı temsil eder
        for (int i = 0; i < basamak; i++) {
            // İkinci döngü, her bir satırdaki boşlukları temsil eder
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // İkinci döngü, her bir satırdaki yıldızları temsil eder
            for (int k = 0; k < 2 * (basamak - i) - 1; k++) {
                System.out.print("*");
            }
            // Bir sonraki satıra geç
            System.out.println();
        }
    }
}