import java.util.Arrays;
public class DiziTekrarnEdenCiftSayilar {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    static void main() {
        int[] list = {3, 7, 4, 3, 2, 9, 10, 21, 4, 33, 1, 9, 2, 10};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        if (!isFind(duplicate, list[i])) {
                            duplicate[startIndex++] = list[i];
                        }
                        break;
                    }
                }
            }
        }

        System.out.println("Tekrar eden çift sayılar:");
        for (int i = 0; i < startIndex; i++) {
            System.out.println(duplicate[i]);
        }
    }
}
