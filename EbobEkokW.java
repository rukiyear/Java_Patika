import java.util.Scanner;
public class EbobEkokW {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = input.nextInt();

        int ebob = 1;
        int i = n1;

        while (i >= 0) {
            if  (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }

            i--;
        }
        int ekok = ( n1 * n2 ) / ebob;
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
