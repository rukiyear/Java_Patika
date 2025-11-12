import java.util.Scanner;
public class VucutKitleIndeksi {
    static void main() {
        double kilo, boy, vki;

        Scanner input = new Scanner(System.in);

        System.out.print("kilo : ");
        kilo = input.nextDouble();
        System.out.print("boy : ");
        boy = input.nextDouble();

        vki = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksi : " + vki);
    }
}
