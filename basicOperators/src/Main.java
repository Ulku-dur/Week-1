
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      /*  int a=5, b=2;
        boolean sonuc = a == b;
        System.out.println(sonuc);
        * Eşitlik: a == b
        * Eşit Değil: a != b
        * Büyüktür: a > b
        * Büyük Eşittir: a >= b
        * Küçük Eşittir: a <= b
       */
//int a = 5, b= 1, c=5;
//Mantıksal Operatörler
/*boolean kosul1 = a == c;
boolean kosul2 = a >= b;
boolean sonuc = kosul1 && kosul2;
        System.out.println(sonuc);
     boolean sonuc = kosul1 || kosul2;
     System.out.println(sonuc);
    */
        //Koşul Operatörü:
        int a = 5, b = 6, c = 5;
        boolean kosul1 = a == c;
        boolean kosul2 = a >= b;
        boolean sonuc = kosul1 || kosul2;
        String str = sonuc ? "Doğru" : "Değil";
        int result = sonuc ? 1 :0; // burada string olarak tanımlarsak hata vercektir "0" gibi
        String strg = a==c ? "Doğru" : "Değil";
        System.out.println(str);
    }
}