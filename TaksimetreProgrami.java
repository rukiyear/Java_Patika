import java.util.Scanner;
public class TaksimetreProgrami {
    static void main() {
        double km, kmUcreti, taksimetreAcilis, minumumTutar, toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("km : ");
        km = input.nextDouble();

        taksimetreAcilis = 10;
        minumumTutar = 20;
        kmUcreti = 2.20;

        toplamTutar = (taksimetreAcilis + km * kmUcreti <= 20) ? 20 : (taksimetreAcilis) + (km * kmUcreti);

        System.out.println("Ödenecek tutar : " + toplamTutar + " TL");
    }
}
