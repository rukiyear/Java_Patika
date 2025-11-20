import java.util.Scanner;
public class TamBolen3_4 {
    static void main() {
        int k, toplam, adet;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        k = input.nextInt();

        toplam = 0;
        adet = 0;

        for (int i = 0; i <= k; i++) {
            if (i % 12 == 0) {
                toplam += i;
                adet++;
            }
        }

        if (adet > 0) {
            double ortalama = (double) toplam / adet;
            System.out.println("Ortalama: " + ortalama);
        } else {
            System.out.println("Hiç uygun sayı yok.");
        }
    }
}
