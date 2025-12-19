import java.util.Scanner;
public class PalindromSayi {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, LastNumber;
        while (temp != 0) {
            LastNumber = temp % 10;
            reverseNumber = (reverseNumber* 10) + LastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }
    static void main() {
        System.out.println(isPalindrom(101));
    }
}
