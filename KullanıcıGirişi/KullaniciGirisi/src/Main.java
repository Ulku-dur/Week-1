import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler tanımlandı
        String userName, password, answer, newPassword, wrongPassword = "";

        // Scanner class ı import edildi
        Scanner inp = new Scanner(System.in);

        // Kullanıcı adı istenildi
        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        userName = inp.nextLine();

        // kullanıcıdan şifre alındı
        System.out.print("Lütfen şifrenizi giriniz: ");
        password = inp.nextLine();

        // Kullanıcı isminizi ve şifrenizi kontrol ediniz.
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Başarılı bir şekilde giriş yaptınız");
        } else {
           // eğer password başta belirtilen değere eşit değilse, aşağıdaki adımlar izlenir
            if (!password.equals("java123")) {
                wrongPassword = password;
            }
            System.out.println("Şifreniz hatalı");

            System.out.print("Şifrenizi mi unuttunuz? Şifrenizi yenilemek ister misiniz? (Yes/No): ");
            answer = inp.nextLine();

            // cevap kontrol edilir
            int yesNo = answer.equalsIgnoreCase("Yes") ? 1 : 2;

            switch (yesNo) {
                case 1:
                    boolean validPassword = false;
                    while (!validPassword) {
                        System.out.print("Please enter your new password: ");
                        newPassword = inp.nextLine();

                        // önceki şifre ile yeni şifre karşılaştırılır.
                        if (!(newPassword.equals("java123") || newPassword.equals(wrongPassword))) {
                            System.out.println("Yenişifre düzenlendi");
                            validPassword = true;
                        } else {
                            System.out.println("Yenişifreniz oluşturuldu lütfen yenişifrenizle giriş yapınız");
                        }
                    }
                    break;

                default:
                    System.out.println("Geçersiz seçim. Lütfen 'Yes' veya 'No' yu seçin.");
            }
        }
    }
}