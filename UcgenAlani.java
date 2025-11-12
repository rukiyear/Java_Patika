import java.util.Scanner;
public class UcgenAlani {
    static void main() {
        int a, b, c, u;
        double alan;

        Scanner input = new Scanner(System.in);

        System.out.print("a :");
        a = input.nextInt();
        System.out.print("b :");
        b = input.nextInt();
        System.out.print("c :");
        c = input.nextInt();

        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin alanı : " + alan);
    }
}
