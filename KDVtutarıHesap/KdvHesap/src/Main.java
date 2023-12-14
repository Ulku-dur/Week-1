
// Scanner classı import edilir
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran=0.18, kdvOran2=0.08;
// Kullanıcıdan input alınabilmesi için scanner nesnesi oluşturulur
Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();
        // tutarın karşılaştırılması yapılır
        boolean tutarCompare = tutar <=100;
        if(tutarCompare) {
            double kdvTutar = tutar*kdvOran;
            double kdvliTutar = tutar + kdvTutar;
            System.out.println("Kdv'siz Tutar: " + tutar);
            System.out.println("Kdv Oranı: " + kdvOran);
            System.out.println("Kdv tutar: " + kdvTutar);
            System.out.println("Kdv'li tutar: " + kdvliTutar);
        }
        // tutarın 1000 den büyük olması durumunda uygulanacak kdv oranı, kdvOra2 değeri ile tanımlandı
        else {
            double kdvTutar = tutar*kdvOran2;
            double kdvliTutar = tutar + kdvTutar;
            System.out.println("Kdv'siz Tutar: " + tutar);
            System.out.println("Kdv Oranı: " + kdvOran2);
            System.out.println("Kdv tutar: " + kdvTutar);
            System.out.println("Kdv'li tutar: " + kdvliTutar);
        }





    }
}