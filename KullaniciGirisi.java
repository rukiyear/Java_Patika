import java.util.Scanner;
public class KullaniciGirisi {
    static void main() {
        String userName, password, cevap, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java101")) {
            System.out.print("Başarıyla giriş yaptınız");
        } else if (userName.equals("patika") && !password.equals("java101")) {
            System.out.println("Şifre hatalı");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H): ");
            cevap = input.nextLine();
            if (cevap.equals("E")){
                System.out.print("Yeni şifreyi giriniz : ");
                newPassword = input.nextLine();
                if (newPassword.equals("java101")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.print("Şifre başarıyla oluşturuldu");
                }
            } else if (cevap.equals("H")) {
                System.out.print("Şifre sıfırlanmayacaktır");
            } else {
                System.out.print("Geçersiz girdi");
            }

        }
        else if (!userName.equals("patika") && password.equals("java101")) {
            System.out.print("Kullanıcı adı hatalı");
        }else {
            System.out.print("Şifre ve kullanıcı adı hatalı");

        }
    }
}
