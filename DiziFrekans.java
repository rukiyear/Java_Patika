public class DiziFrekans {
    static void main() {
        int[] dizi = {1,1,2,3,4,3,2,4,5,6,5,8,1};

        boolean[] kontrol = new boolean[dizi.length];

        for (int i = 0; i < dizi.length; i++) {

            if (kontrol[i]) {
                continue; 
            }

            int sayac = 1;

            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    sayac++;
                    kontrol[j] = true;
                }
            }

            System.out.println(dizi[i] + " sayısı " + sayac + " kere tekrar edildi.");
        }
    }
}

