import java.util.Scanner;
public class SicaklikEtkinligi {
    static void main() {
        double sıcaklık;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sıcaklık değerini giriniz : ");
        sıcaklık = input.nextDouble();

        if (sıcaklık < 5) {
            System.out.print("Kayak yapmak için uygun hava koşulu");
        } else if (sıcaklık >= 5 && sıcaklık < 15) {
            System.out.print("Sinema için uygun hava koşulu");
        } else if (sıcaklık >= 15 && sıcaklık < 25) {
            System.out.print("Piknik için uygun hava koşulu");
        } else if (sıcaklık >= 25 && sıcaklık < 40) {
            System.out.print("Yüzmek için uygun hava koşulu");
        } else {
            System.out.print("Hava sıcaklığı çok fazla, lütfen dışarı çıkmayınız");
        }
    }
}


