import java.util.Scanner;

public class Reversing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int firstDigit = n / 100;
        int thirdDigit = n % 10;
        int secondDigit = (n - firstDigit * 100 - thirdDigit) / 10;
        int reversN = thirdDigit * 100 + secondDigit * 10 + firstDigit;
        System.out.println(reversN);
    }
}