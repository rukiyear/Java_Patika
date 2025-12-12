import java.util.Scanner;
public class BasSayiToplami {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();

        int temp = number;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        System.out.println("Basamak toplamı: " + sum);
    }
}
