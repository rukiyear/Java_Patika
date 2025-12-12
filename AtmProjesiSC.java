import java.util.Scanner;
public class AtmProjesiSC {
    static void main() {
        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;
        String userName, password;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Şifreniz : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına hoşgeldiniz.");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    int price = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            balance += price;
                            break;

                        case 2:
                            System.out.print("Para miktarı : ");
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz");
                            } else {
                                balance -= price;
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;

                        case 4:
                            System.out.println("Çıkış yapılıyor...");
                            break;

                        default:
                            System.out.println("Geçersiz işlem seçtiniz.");
                    }

                } while (select != 4);

                System.out.println("Tekrar görüşmek üzere");
                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }
        }
    }
}
