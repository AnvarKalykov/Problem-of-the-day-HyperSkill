import java.util.Scanner;

public class ArithmeticAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double begin = scanner.nextInt();
        double end = scanner.nextInt();
        double sum = 0;
        double counter = 0;

        for (double n = begin; n <= end; n++) {
            if (n % 3 == 0) {
                sum = sum + n;
                counter++;
            }

        }
        System.out.println(sum / counter);
    }
}