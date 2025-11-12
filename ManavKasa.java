import java.util.Scanner;
public class ManavKasa {
    static void main() {
        double  armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlıcanFiyat = 5, ucret;
        double armutKg, elmaKg, domatesKg, muzKg, patlıcanKg;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kg armut alacaksınız : ");
        armutKg = input.nextDouble();
        System.out.print("Kaç kg elma alacaksınız : ");
        elmaKg = input.nextDouble();
        System.out.print("Kaç kg domates alacaksınız : ");
        domatesKg = input.nextDouble();
        System.out.print("Kaç kg muz alacaksınız : ");
        muzKg = input.nextDouble();
        System.out.print("Kaç kg patlıcan alacaksınız : ");
        patlıcanKg = input.nextDouble();

        ucret = (armutFiyat * armutKg) + (elmaFiyat * elmaKg) + (domatesFiyat * domatesKg) + (muzFiyat * muzKg) + (patlıcanFiyat * patlıcanKg);

        System.out.println("Toplam ödenecek tutar : " + ucret);




    }
}
