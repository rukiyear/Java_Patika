import java.util.Scanner;
public class CinZodyagi {
    static void main() {
        int yıl;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen doğum yılınızı giriniz : ");
        yıl = input.nextInt();

        if (yıl % 12 == 0) {
            System.out.print("Çin zodyağı burcunuz maymun");
        } else if (yıl % 12 == 1) {
            System.out.print("Çin zodyağı burcunuz horoz");
        } else if (yıl % 12 == 2) {
            System.out.print("Çin zodyağı burcunuz köpek");
        } else if (yıl % 12 == 3) {
            System.out.print("Çin zodyağı burcunuz domuz");
        } else if (yıl % 12 == 4) {
            System.out.print("Çin zodyağı burcunuz fare");
        } else if (yıl % 12 == 5) {
            System.out.print("Çin zodyağı burcunuz öküz");
        } else if (yıl % 12 == 6) {
            System.out.print("Çin zodyağı burcunuz kaplan");
        } else if (yıl % 12 == 7) {
            System.out.print("Çin zodyağı burcunuz tavşan");
        } else if (yıl % 12 == 8) {
            System.out.print("Çin zodyağı burcunuz ejderha");
        } else if (yıl % 12 == 9) {
            System.out.print("Çin zodyağı burcunuz yılan");
        } else if (yıl % 12 == 10) {
            System.out.print("Çin zodyağı burcunuz at");
        } else if (yıl % 12 == 11) {
            System.out.print("Çin zodyağı burcunuz koyun");
        }
    }
}
