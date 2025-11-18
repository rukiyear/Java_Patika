import java.util.Scanner;
public class Burclar {
    static void main() {
        int ay, gun;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen doğduğunuz ayı giriniz : ");
        ay = input.nextInt();
        System.out.print("lütfen doğduğunuz günü giriniz : ");
        gun = input.nextInt();

        if (ay < 1 || ay > 12) {
            System.out.println("Geçersiz ay girdiniz.");
            return;
        }
        int maxGun;

        if (ay == 2) {
            maxGun = 29;
        } else if (ay == 4 || ay == 6 || ay == 9 || ay == 11) {
            maxGun = 30;
        } else {
            maxGun = 31;
        }

        if (gun < 1 || gun > maxGun) {
            System.out.println("Bu ay için geçerli bir gün girmediniz!");
            return;
        }

        if (ay == 3 && gun >= 21 || ay == 4 && gun <= 20) {
            System.out.print("Burcunuz koç");
        } else if (ay == 4 && gun >= 21 || ay == 5 && gun <= 21) {
            System.out.print("Burcunuz boğa");
        } else if (ay == 5 && gun >= 22 || ay == 6 && gun <= 22) {
            System.out.print("Burcunuz ikizler");
        } else if (ay == 6 && gun >= 23 || ay == 7 && gun <= 22) {
            System.out.print("Burcunuz yengeç");
        } else if (ay == 7 && gun >= 23 || ay == 8 && gun <= 22) {
            System.out.print("Burcunuz aslan");
        } else if (ay == 8 && gun >= 23 || ay == 9 && gun <= 22) {
            System.out.print("Burcunuz başak");
        } else if (ay == 9 && gun >= 23 || ay == 10 && gun <= 22) {
            System.out.print("Burcunuz terazi");
        } else if (ay == 10 && gun >= 23 || ay == 11 && gun <= 21) {
            System.out.print("Burcunuz akrep");
        } else if (ay == 11 && gun >= 22 || ay == 12 && gun <= 21) {
            System.out.print("Burcunuz yay");
        } else if (ay == 12 && gun >= 22 || ay == 1 && gun <= 21) {
            System.out.print("Burcunuz oğlak");
        } else if (ay == 1 && gun >= 22 || ay == 2 && gun <= 19) {
            System.out.print("Burcunuz kova");
        } else if (ay == 2 && gun >= 20 || ay == 3 && gun <= 20) {
            System.out.print("Burcunuz balık");
        }
    }
}
