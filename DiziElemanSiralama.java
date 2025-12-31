import java.util.Scanner;
import java.util.Arrays;

public class DiziElemanSiralama {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz : ");
        int n = input.nextInt();

        int[] dizi = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". elemanı giriniz : ");
            dizi[i] = input.nextInt();
        }
        Arrays.sort(dizi); 

        System.out.println("Sıralanmış dizi : ");
        for (int i : dizi) {
            System.out.print(i + " ");
        }
    }
}
