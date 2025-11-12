import java.util.Scanner;
public class DaireDilimAlani {
    static void main() {
        int r, aci;
        double alan, pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("r : ");
        r = input.nextInt();
        System.out.print("aci : ");
        aci = input.nextInt();

        alan = pi * r * r * aci / 360;

        System.out.println("Daire diliminin alanı : " + alan);
    }
}
