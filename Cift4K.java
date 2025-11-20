import java.util.Scanner;
public class Cift4K {
    static void main() {
        int k, total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            k = input.nextInt();
            if (k % 2 == 0 && k % 4 == 0) {
                total += k;
            }
        } while (k % 2 == 0);

        System.out.print("Toplam : " + total);
    }
}
