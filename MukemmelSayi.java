import java.util.Scanner;
public class MukemmelSayi {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int k = input.nextInt();
        int toplam = 0;

        for (int i = 1; i < k; i++) {
            if (k % i == 0) {
                toplam += i;

            }
        } if (toplam == k) {
            System.out.println(k + " mükemmel sayıdır.");
        } else {
            System.out.println(k + " mükemmel sayı değildir.");
        }
    }
}
