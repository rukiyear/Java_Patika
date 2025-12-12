import java.util.Scanner;
public class MinMaxSayi {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int n = input.nextInt();

        System.out.print("1. sayıyı girin: ");
        int number = input.nextInt();

        int min = number;
        int max = number;

        int i = 2;
        while (i <= n) {
            System.out.print(i + ". sayıyı girin: ");
            number = input.nextInt();

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }

            i++;
        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}
