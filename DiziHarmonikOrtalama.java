public class DiziHarmonikOrtalama {
    static void main() {
        double[] list = {2,3,5,1,7,9,13,6,18};
        double sum = 0.0;
        for (double sayi : list) {
            sum += 1.0 / sayi;
        }

        double harmonicMean = list.length / sum;
        System.out.println("Harmonik Ortalama : " + harmonicMean);
    }
}
