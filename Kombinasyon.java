import java.util.Scanner;
public class Kombinasyon {
    static void main() {
        int n, r ;
        int nFak = 1, rFak = 1, nrFak = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("n : ");
        n = input.nextInt();
        System.out.print("r : ");
        r = input.nextInt();

        if (r > n || n < 0 || r < 0) {
            System.out.println("Hatalı giriş! r, n'den büyük olamaz ve negatif sayı girilemez.");
            return;
        }
        for (int i = 1; i <= n; i++) {
            nFak *= i;
        }
        for (int i = 1; i <= r; i++) {
            rFak *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            nrFak *= i;
        }
        int kombinasyon = nFak / (rFak * nrFak);

        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
    }
}
