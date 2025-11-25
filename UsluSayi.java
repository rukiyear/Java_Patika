import java.util.Scanner;
public class UsluSayi {
    static void main() {
        int n, k;
        int total = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı :");
        n = input.nextInt();
        System.out.print("Üs olacak sayı :");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.print("Cevap : " + total);
    }
}
