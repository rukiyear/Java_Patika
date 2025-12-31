import java.util.Scanner;
public class DiziGirilenSayi {
    static void main() {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();
        int[] list = {89,15,-2,5,77,-45,-6,24};
        int enyakinkucuk = Integer.MIN_VALUE;
        int enyakinbuyuk = Integer.MAX_VALUE;

        for (int sayi : list) {
            if (sayi < number && sayi > enyakinkucuk) {
                enyakinkucuk = sayi;
            }
            if (sayi > number && sayi < enyakinbuyuk) {
                enyakinbuyuk = sayi;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + enyakinkucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + enyakinbuyuk);
    }
}
