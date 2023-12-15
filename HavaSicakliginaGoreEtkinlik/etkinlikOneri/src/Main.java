
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sıcaklık girişi al
        System.out.println("Sıcaklık değerini girin: ");
        int sicaklik = scanner.nextInt();

        // Etkinlik önerileri
        if (sicaklik < 5) {
            System.out.println("Öneri: Kayak yapmayı düşünebilirsiniz.");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Öneri: Sinema etkinliğini düşünebilirsiniz.");
        } else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("Öneri: Piknik yapmayı düşünebilirsiniz.");
        } else {
            System.out.println("Öneri: Yüzme etkinliğini düşünebilirsiniz.");
        }

        scanner.close();
    }
        }

