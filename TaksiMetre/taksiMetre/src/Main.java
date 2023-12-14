//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km; double perKm = 2.20, total = 10;
Scanner input = new Scanner(System.in);
// kullanıcıdan km değeri alınır
        System.out.print("km değerini giriniz: ");
        km = input.nextInt();
        // total değeri hesapla
        total += (perKm*km); // taksimetre açılış ücreti eklendi
        // Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır
        total = (total < 20) ? 20 : total;
        System.out.println("Toplam ücret: "+total);


    }
}