public class AsalSayi {
    static void main() {
        for (int i = 2; i <= 100; i++) {
            boolean asalMi = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                System.out.print(i + " ");
            }
        }
    }
}
