//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
// kullanıcıdan sayılar istenir
        System.out.println("birinci sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int b = input.nextInt();
        System.out.println("Üçüncü sayıyı giriniz: ");
        int c = input.nextInt();
        if ((a>b) && (a>c)) {
            if (b>c) {
                System.out.println("a > b >c");
            }
            else {
                System.out.println("a > b > c");
            }
        } else if ((b>a) && (b>c)) {
            if (a>c) {
                System.out.println("b > a > c");
            }
            else {
                System.out.println("b > c > a");
            }
        } else if ((c>b) && (c>a)) {
            if (b>a) {
                System.out.println("c > b > a");
            }
            else {
                System.out.println("c > a > b");
            }
        }
    }
}


