import java.util.Scanner;

public class HesapMakinesi {
    static void main() {
        int x, y, secim;

        Scanner input = new Scanner(System.in);

        System.out.print("x : ");
        x = input.nextInt();
        System.out.print("y : ");
        y = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("secim : ");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.print("Toplam : " + (x + y));
                break;
            case 2:
                System.out.print("Fark : " + (x - y));
                break;
            case 3:
                System.out.print("Çarpım : " + (x * y));
                break;
            case 4:
                if (y != 0 ) {
                    System.out.print("Bölüm : " + (x / y));
                }
                else {
                    System.out.print("Bir sayı 0'a bölünemez");
                }
                break;
            default:
                System.out.print("Yanlış seçim yaptınız!");
        }
    }
}
