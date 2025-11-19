import java.util.Scanner;
public class UcakBileti {
    static void main() {
        double km, mesafeUcreti, toplamFiyat;
        int yas, yolculukTipi;

       Scanner input = new Scanner(System.in);

       System.out.print("Lütfen mesafeyi giriniz : ");
       km = input.nextDouble();
       System.out.print("Lütfen yaşınızı giriniz : ");
       yas = input.nextInt();
       System.out.print("Lütfen yolculuk tipini giriniz (1/2) : ");
       yolculukTipi = input.nextInt();

       mesafeUcreti = 0.10;
       toplamFiyat = km * mesafeUcreti;

       if (yas > 0 && km > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
           System.out.println("Girdiler doğru");
       } else {
           System.out.println("Hatalı veri girdiniz");
           return;
       }

       if (yas < 12) {
           toplamFiyat *= 0.5;
           System.out.println("%50 inirim uygululanmıştır.");
       } else if (yas >= 12 && yas <= 24) {
           toplamFiyat *= 0.9;
           System.out.println("%10 inirim uygululanmıştır.");
       } else if (yas > 65) {
           toplamFiyat *= 0.7;
           System.out.println("%30 inirim uygululanmıştır.");
       } else {
           System.out.println("Yaş için indirim uygulanmamıştır");
       }

       if (yolculukTipi == 2) {
           toplamFiyat *= 0.8;
           toplamFiyat *= 2;
           System.out.println("%20 inirim uygululandı ve gidiş - dönüş olduğu için 2 bilet fiyatı eklendi.");
       } else {
           System.out.println("Tek yön gidişlerde indirim uygulanmamaktadır");
       }
       System.out.println("Ödenecek toplam tutar: " + toplamFiyat);
    }
}
