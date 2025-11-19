import java.util.Scanner;
public class ArtikYil {
    static void main() {
        int yıl;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen yılı giriniz : ");
        yıl = input.nextInt();

        if (yıl % 4 == 0) {
            if (yıl % 100 == 0) {
                if (yıl % 400 == 0) {
                    System.out.print(yıl + " Artık yıldır");
                } else {
                    System.out.print(yıl + " Artık yıl değildir");
                }
            } else {
                System.out.print(yıl + " Artık yıldır");
            }
        } else {
            System.out.print(yıl + " Artık yıl değildir");
        }
    }
}
