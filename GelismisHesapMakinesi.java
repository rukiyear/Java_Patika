import java.util.Scanner;

public class GelismisHesapMakinesi {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int divided(int a, int b) {
        int result = a / b;
        System.out.println("Bölüm : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyeli alınacak sayıyı giriniz : ");
        int n = input.nextInt();

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println(n + "! = " + result);
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calc(int a, int b) {
        System.out.println("Çevresi : " + (2 * (a + b)));
        System.out.println("Alanı : " + (a * b));
    }

    static void main() {

        Scanner input = new Scanner(System.in);
        int select;

        String menu =
                "1- Toplama İşlemi\n" +
                        "2- Çıkarma İşlemi\n" +
                        "3- Çarpma İşlemi\n" +
                        "4- Bölme İşlemi\n" +
                        "5- Üslü Sayı Hesaplama\n" +
                        "6- Faktöriyel Hesaplama\n" +
                        "7- Mod Alma\n" +
                        "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                        "0- Çıkış";

        while (true) {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz : ");
            select = input.nextInt();

            if (select == 0) {
                break;
            }

            
            if (select == 6) {
                factorial();
                continue;
            }

            System.out.print("İlk sayıyı giriniz : ");
            int a = input.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("İkinci sayı 0 olamaz!");
                    } else {
                        divided(a, b);
                    }
                    break;
                case 5:
                    System.out.println("Üs Hesabı : " + power(a, b));
                    break;
                case 7:
                    System.out.println("Mod İşlemi : " + mod(a, b));
                    break;
                case 8:
                    calc(a, b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz!");
            }
        }

        System.out.println("Güle Güle!");
    }
}

