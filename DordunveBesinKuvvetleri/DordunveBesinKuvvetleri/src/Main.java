// Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz: ");
       int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("4^" + i + " = " + Math.pow(4, i));
            System.out.println("5^" + i + " = " + Math.pow(5, i));
        }
    }
}