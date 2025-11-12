import java.util.Scanner;
public class NotHesaplama {
    static void main() {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz :");
        matematik = inp.nextInt();

        System.out.print("Fizik notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz :");
        kimya = inp.nextInt();

        System.out.print("Turkce notunuz :");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz :");
        tarih = inp.nextInt();

        System.out.print("Muzik notunuz :");
        muzik = inp.nextInt();

        int toplam  = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println(sonuc);
        System.out.println(sonuc > 60 ? "gecti": "kaldi");
    }
}
