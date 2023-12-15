
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yil;
Scanner scanner = new Scanner(System.in);
// kullanıcdan yıl bilgisini al
        System.out.print("Bir yıl girin: ");
        yil = scanner.nextInt();
        // Artık yıl kontrolü
        boolean artikYil = false;
        // yılın 100 e ve 4 e bölümünden kalan 0 ise girilen yıl artık yıldır
        if(yil % 4 == 0) {
            if(yil % 100 == 0) {
               if (yil % 400 ==0) {
                   artikYil = true;
               }
            }
            // sonucu ekrana yazdırma
            if(artikYil) {
                System.out.println(yil + " bir artık yıldır");
            }
            else {
                System.out.println(yil +" bir artık değildir");
            }
        }


        }
    }
