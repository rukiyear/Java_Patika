import java.util.Scanner;
public class RecursiveAsalSayi {
    static boolean asalMi(int sayi, int bolen) {
        if (sayi < 2) {
            return false;
        }
        if (bolen == 1) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return asalMi(sayi, bolen - 1);
    }
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int sayi = input.nextInt();

        if (asalMi(sayi, sayi / 2)) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal değildir.");
        }
    }
}
