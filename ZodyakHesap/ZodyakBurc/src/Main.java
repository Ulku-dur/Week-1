
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum yılınızı girin: ");
        int dogumYili = scanner.nextInt();

        // Çin Zodyağı hesaplama
        int zodyakIndex = dogumYili % 12;

        // Çin Zodyağı belirleme
        String zodyak = "";
        switch (zodyakIndex) {
            case 0:
                zodyak = "Maymun";
                break;
            case 1:
                zodyak = "Horoz";
                break;
            case 2:
                zodyak = "Köpek";
                break;
            case 3:
                zodyak = "Domuz";
                break;
            case 4:
                zodyak = "Fare";
                break;
            case 5:
                zodyak = "Öküz";
                break;
            case 6:
                zodyak = "Tiger";
                break;
            case 7:
                zodyak = "Tavşan";
                break;
            case 8:
                zodyak = "Ejderha";
                break;
            case 9:
                zodyak = "Yılan";
                break;
            case 10:
                zodyak = "At";
                break;
            case 11:
                zodyak = "Koyun";
                break;
            default:
                System.out.println("Geçersiz bir değer girdiniz.");
                System.exit(0);
        }

        System.out.println("Çin Zodyağı Burcunuz: " + zodyak);

        }


    }





