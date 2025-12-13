import java.util.Scanner;
public class Fibonacci {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int n = input.nextInt();

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
