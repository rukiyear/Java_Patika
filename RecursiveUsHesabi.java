import java.util.Scanner;
public class RecursiveUsHesabi {
    static int power(int taban, int us) {
        if (us == 0) {
            return 1;
        }
        return taban * power(taban, (us -1));
    }
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban sayısını giriniz: ");
        int taban = input.nextInt();

        System.out.print("Üs sayısını giriniz: ");
        int us = input.nextInt();

        int sonuc = power(taban, us);
        System.out.println("Sonuç: " + sonuc);

    }
}
