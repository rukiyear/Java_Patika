import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;
public class KdvHesabi {
    static void main() {
        double tutar, kdvOrani, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Tutarı giriniz: ");
        tutar = input.nextDouble();

        kdvOrani = (tutar <= 1000) ? 0.18 : 0.08;

        kdvTutar = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Fiyat: " + tutar);
        System.out.println("KDV Oranı: %" + (kdvOrani * 100));
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Fiyat: " + kdvliTutar);
    }
}
