import java.util.Scanner;
public class RecursiveDesenMetot {
    static void pattern(int n) {
        System.out.print(n + " ");
        if (n <= 0) {
            return;
        }
        pattern(n - 5);
        System.out.print(n + " ");
    }
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısını giriniz: ");
        int n = input.nextInt();

        pattern(n);
    }
}
