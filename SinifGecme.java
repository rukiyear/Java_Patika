
import java.util.Scanner;
public class SinifGecme {
    static void main() {
        int matematik, fizik, kimya, türkçe, tarih, müzik, toplam;
        double sonuç;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        matematik = input.nextInt();
        System.out.print("Fizik notunu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Kimya notunu giriniz : ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunu giriniz : ");
        türkçe = input.nextInt();
        System.out.print("Tarih notunu giriniz : ");
        tarih = input.nextInt();
        System.out.print("Müzik notunu giriniz : ");
        müzik = input.nextInt();

        toplam = (matematik + fizik + kimya + türkçe + tarih + müzik);
        sonuç = toplam / 6;

        if (0 <= matematik && matematik <= 100 &&
                0 <= fizik && fizik <= 100 &&
                0 <= kimya && kimya <= 100 &&
                0 <= türkçe && türkçe <= 100 &&
                0 <= tarih && tarih <= 100 &&
                0 <= müzik && müzik <= 100) {
            System.out.println("Girdi doğru");
            if (sonuç >= 55) {
                System.out.print("Geçti. Ortalama  : " + sonuç);
            } else {
                System.out.print("Kaldı.Ortalama : " + sonuç);
            }
        } else {
            System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz");
        }

    }
}
