import java.util.Scanner;
public class HarmonikSayi {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısını giriniz : ");
        int n = input.nextInt();
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += (1.0/i);
        }
        System.out.println("Harmonik seri sonucu: " + result);
    }
}
